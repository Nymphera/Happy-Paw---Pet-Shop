package entities;

import javax.persistence.*;
import java.time.Instant;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

@Entity
@Table (name = "orders")
public class Order {
    @Id
    @GeneratedValue
    private int id;
    @ManyToOne
    private  Client client;
    @OneToMany
    private  List<Product> listOfProducts;
    @Column (name = "status")
    private OrderStatus orderStatus = OrderStatus.IN_PROGESS;
    @Column (name = "order_value")
    private double orderValue;
    @Column (name = "loyality_points")
    private int loyalityPoints;
    @Column (name = "date_of_order")
    private final Instant dateOfOrder = Instant.now();

    public Order() {
    }

    public Order(Client client, List<Product> listOfProducts, double orderValue, int loyalityPoints) {
        this.client = client;
        this.listOfProducts = listOfProducts;
        this.orderValue = orderValue;
        this.loyalityPoints = loyalityPoints;
    }

    public int getId() {
        return id;
    }

    public Client getClient() {
        return client;
    }

    public List<Product> getListOfProducts() {
        return listOfProducts;
    }

    public OrderStatus getOrderStatus() {
        return orderStatus;
    }

    public double getOrderValue() {
        return orderValue;
    }

    public void setOrderStatus(OrderStatus orderStatus) {
        this.orderStatus = orderStatus;
    }

    public void calculateOrderValue() {
        double orderValue = 0;
        for (Product product : listOfProducts) {
            orderValue += product.getPrice();
        }
        this.orderValue = orderValue;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", client=" + client +
                ", orderStatus=" + orderStatus +
                ", orderValue=" + orderValue +
                ", loyalityPoints=" + loyalityPoints +
                ", dateOfOrder=" + dateOfOrder +
                '}';
    }
}
