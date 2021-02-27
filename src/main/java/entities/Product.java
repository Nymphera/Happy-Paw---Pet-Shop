package entities;

public abstract class Product {
    private int id;
    private String productName;
    private double price;
    private int quantity;
    private Producent producent;
    private Category category;
    private String description;

    public Product(String productName, double price, int quantity, Producent producent,
                  String description) {
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
        this.producent = producent;
        this.description = description;
    }

    public int getId() {
        return id;
    }

    public String getProductName() {
        return productName;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public Producent getProducent() {
        return producent;
    }

    public Category getCategory() {
        return category;
    }

    public String getDescription() {
        return description;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setProducent(Producent producent) {
        this.producent = producent;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "name='" + productName + '\'' +
                ", price=" + price +
                ", quantity=" + quantity +
                ", producent=" + producent.getProducentName() +
                ", ";
    }
}
