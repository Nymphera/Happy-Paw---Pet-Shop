package entities;

import java.util.List;

public class Order {
    private int id;
    private Client client;
    private List<Product> listOfProducts;
    private OrderStatus orderStatus = OrderStatus.IN_PROGESS;
    private double orderValue;

    public Order(Client client, List<Product> listOfProducts) {
        this.client = client;
        this.listOfProducts = listOfProducts;
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
