package Lesson1Group4720;
import java.util.ArrayList;
public class Category{
    private String name;
    private ArrayList<Product> products;

    public Category(String name){
        this.name = name;
        this.products = new ArrayList<>();

    }

    public String getName(){
        return name;
    }

    public ArrayList<Product> getProducts(){
        return products;
    }
    
    public void addProduct(Product product){
        products.add(product);

    }
}