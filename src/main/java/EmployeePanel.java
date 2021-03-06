import entities.Order;
import entities.Producent;
import entities.Product;
import entities.User;
import org.hibernate.Session;
import org.hibernate.query.Query;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Date;
import java.util.List;
import java.util.Optional;

public class  EmployeePanel extends UserPanel {
    public EmployeePanel(Session session, User user) {
        super(session, user);
    }


    public void showAllOrdersFromDate(String date) throws ParseException {
        Date startdate = new SimpleDateFormat("hh:mm, yyyy-MM-dd").parse("00:01, " + date);
        Instant reqInstant = startdate.toInstant();
        Date endDate = new SimpleDateFormat("hh:mm, yyyy-MM-dd").parse("23:59, " + date);
        Instant reqInstant2 = endDate.toInstant();
        Query findOrders = super.getSession().createQuery("from Order o where o.dateOfOrder BETWEEN :date " +
                "AND :date2 ");
        findOrders.setParameter("date", reqInstant);
        findOrders.setParameter("date2", reqInstant2);
        findOrders.stream().forEach(order -> System.out.println(order.toString()));
    }

    public void showProductsFromOrder(int id) {
        Query findProducts = super.getSession().createQuery("from Order o where o.id = :number");
        findProducts.setParameter("number", id);
        Optional<Order> optionalOrder = findProducts.stream().findAny();
         if (optionalOrder != null) {
             Order order = optionalOrder.get();
             for (Product p : order.getListOfProducts()) {
                 System.out.println(p.toString());
             }
         }
    }

    public void addProduct(String productName, double price, int quantity, Producent producent,
                           String description) {

    }

}
