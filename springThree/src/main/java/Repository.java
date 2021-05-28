import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class Repository {
    ArrayList<Product> productList= new ArrayList<Product>();
    Product product= new Product();
    public Product findById(int id){
        product.setTitle("Beef" + id);
        product.setAmount(100 + id);
        return product;
    }
    public Product showAll(ArrayList<Product>productList){
        for (int i=0;i<productList.size();i++){
            System.out.println(productList.get(i));
        }
        return product;
    }
    public Product addProduct(ArrayList<Product>productList){

    }
}
