package entities;

import java.util.ArrayList;
import java.util.List;

public class Stock {
    private List<Product> listOfProducts = new ArrayList<>();

    public List<Product> getListOfProducts() {
        return listOfProducts;
    }

    public void addProduct(Product product) {
        listOfProducts.add(product);
    }

    public void removeProduct(Product product) {
        listOfProducts.remove(product);
    }


}
