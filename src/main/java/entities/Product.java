package entities;

public abstract class Product {
    private int id;
    private String productName;
    private double price;
    private int quantity;
    private Producent producent;
    private Category category;
    private String description;

    public Product(int id, String productName, double price, int quantity, Producent producent,
                   Category category, String description) {
        this.id = id;
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
        this.producent = producent;
        this.category = category;
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
}
