import entities.Category;
import entities.Product;
import org.hibernate.Session;
import org.hibernate.query.Query;

import java.util.List;
import java.util.Optional;

public class ProdductFinder {


    public void findByName(Session session, String name) {
        Query by_name = session.createQuery("from Product p where p.productName LIKE concat('%', :name, '%')");
        by_name.setParameter("name", name);
        List<Product> productList = by_name.getResultList();
        productList.forEach(product -> System.out.println(product.toString()));
    }


    public void findByCategory(Session session, Category category) {
        Query all_from_category = session.createQuery("from Product p where p.category =:cat");
        all_from_category.setParameter("cat", category);
        List<Product> productList = all_from_category.getResultList();
        productList.forEach(product -> System.out.println(product.toString()));

    }


    public void findByProducent(Session session, String producent) {
        Query all_from_producent = session.createQuery("from Product p where p.producent.producentName = :prod ");
        all_from_producent.setParameter("prod", producent);
        List<Product> productList = all_from_producent.getResultList();
        productList.forEach(product -> System.out.println(product.toString()));
    }


    public void showAllProducts(Session session) {
        Query all_from_products = session.createQuery("from Product");
        List<Product> productList = all_from_products.getResultList();
        productList.forEach(product -> System.out.println(product.toString()));
    }

    public Product getProductById(Session session, int number) {
        Query productById = session.createQuery("from Product p where p.id = :number");
        productById.setParameter("number", number);
        List<Product> list = productById.list();
        Optional <Product> optional = productById.stream().findAny();
        if (optional.isPresent()) {
            return optional.get();
        } else {
            System.out.println("No product found");
            return null;
        }
    }
}
