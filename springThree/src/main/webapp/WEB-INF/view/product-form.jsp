<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>

<html>
<body>
<form:form action="processForm" modelAttribute="product">
    Name: <form:input path="productName" />
    <br>
    Amount: <form:input path="productAmount" />
    <br>
    <input type="submit" value="Submit" />
</form:form>
</body>
</html>