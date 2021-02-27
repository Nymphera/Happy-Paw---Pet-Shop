package entities;

import java.time.Instant;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

public class Order {
    private int id;
    private final Client client;
    private final List<Product> listOfProducts;
    private OrderStatus orderStatus = OrderStatus.IN_PROGESS;
    private double orderValue;
    private int loyalityPoints;
    private final Instant dateOfOrder = Instant.now();

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

}
