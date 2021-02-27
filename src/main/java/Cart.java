import entities.Client;
import entities.Order;
import entities.Product;


import java.util.ArrayList;
import java.util.List;

public class Cart {
    private Client client;
    private List<Product> listOfProducts = new ArrayList<>();
    private double cartValue = 0;

    public void addtoCart (Product product) {
        if (product.getQuantity() > 0) {
            listOfProducts.add(product);
            cartValue += product.getPrice();
        } else {
            System.out.println("there is not enough product in stock");
        }
    }

    public void removeFromCart (Product product) {
        listOfProducts.remove(product);
        cartValue -= product.getPrice();
    }

    public void showCart() {
        System.out.println("Products in cart: ");
        for (Product product : listOfProducts) {
            System.out.println(product.getProductName() + " " + product.getPrice() + "$");
        }
        System.out.println("To pay: " + cartValue + "$");
    }

    public void buy() {
        System.out.println("Thank for the order");
        System.out.println("You pay " + cartValue);
        int loyalityPoints = (int) (cartValue / 5);
        Order order = new Order(client, listOfProducts, cartValue, loyalityPoints);
        System.out.println("You get " + loyalityPoints + " loyality points for that order.");

        for (Product product : listOfProducts) {
            product.setQuantity(product.getQuantity() -1);
            listOfProducts.remove(product);
        }
    }


}
