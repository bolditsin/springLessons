package src;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Random;

public class SecondServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{
        int i;
        int j= (int) (Math.random() * 100);
        for (i=0;i<10;i++){
            Product p = new Product(i, " Product ", j);
            resp.getWriter().write(String.valueOf(p)+'\n');
        }

    }
}
