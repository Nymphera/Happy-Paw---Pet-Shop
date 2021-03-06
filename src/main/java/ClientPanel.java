import entities.Client;
import entities.User;
import org.hibernate.Session;

public class ClientPanel extends UserPanel{
    private static Cart cart;

    public ClientPanel(Session session, User user) {
        super(session, user);
    }


    void addToCart (int id) {
        if (cart == null) {
            cart = new Cart((Client) super.getUser());
        }
        cart.addtoCart(super.getById(id));
        cart.showCart();
    }

    void removeFromCard (int id) {
        if (cart == null) {
            System.out.println("cart is already empty");
        } else {
            cart.removeFromCart(super.getById(id));
            cart.showCart();
        }
    }

    void makeOrder() {
        if (cart == null) {
            System.out.println("The cart is empty");
        } else {
            cart.buy();
        }
    }

}
