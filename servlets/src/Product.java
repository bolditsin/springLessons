package src;

public class Product {
    int id;
    String title;
    int cost;

    public Product(int id, String title, int cost) {
        this.id=id;
        this.title=title;
        this.cost=cost;
    }
    public void printProd(){
        System.out.println(title + "number " +id +" costs "+cost+" rub");
    }
}
