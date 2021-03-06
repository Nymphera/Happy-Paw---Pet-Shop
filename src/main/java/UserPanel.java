import entities.Category;
import entities.Product;
import entities.User;
import org.hibernate.Session;

import java.util.Optional;

abstract class UserPanel {
    private Session session;
    private User user;
    private ProdductFinder finder;

    public UserPanel(Session session, User user) {
        this.session = session;
        this.user = user;
    }

    public Session getSession() {
        return session;
    }

    public User getUser() {
        return user;
    }

    void findAllProducts() {
        if (finder == null) {
            finder = new ProdductFinder();
        }
        finder.showAllProducts(this.session);
    }

    void findByName(String name) {
        if (finder == null) {
            finder = new ProdductFinder();
        }
        finder.findByName(this.session, name);
    }

    void findByCategory (Category category) {
        if (finder == null) {
            finder = new ProdductFinder();
        }
        finder.findByCategory(this.session, category);
    }

    void findByProducent (String producentName) {
        if (finder == null) {
            finder = new ProdductFinder();
        }
        finder.findByProducent(this.session, producentName);
    }

    Product getById(int id) {
        if (finder == null) {
            finder = new ProdductFinder();
        }
        return finder.getProductById(this.session, id);
    }
}
