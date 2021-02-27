import entities.Category;
import entities.Product;
import entities.Stock;

public class ProdductFinder {
    private Stock stock;

    public void findByName(String name) {
        for (Product product : stock.getListOfProducts()) {
            if (product.getProductName() == name) {
                System.out.println(product.toString());
            }
        }
    }

    public void findByCategory (String category) {
        for (Product product : stock.getListOfProducts()) {
            if (product.getCategory().equals(Category.valueOf(category))) {
                System.out.println(product);
            }
        }
    }

    public void findByProducent (String producent) {
        for (Product product : stock.getListOfProducts()) {
            if (product.getProductName().equals(producent)) {
                System.out.println(product.toString());
            }
        }
    }

    public void showAllProducts () {
        for (Product product : stock.getListOfProducts()) {
            System.out.println(product.toString());
        }
    }

}
