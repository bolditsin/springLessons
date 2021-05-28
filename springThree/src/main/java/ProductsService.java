import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductsService {
    private Repository repository;

    @Autowired
    public void setRepository(Repository repository){
        this.repository= repository;
    }

    public Product getProductById(int id){
        Product product = repository.findById(id);
        return product;
    }
    public ProductsService(){

    }
}
