package entities;

import javax.persistence.Embeddable;
import javax.persistence.Entity;

@Entity
public class CatFood  extends Product{
    private String taste;
    private double weight;

    public CatFood() {
    }

    public CatFood(String productName, double price, int quantity, Producent producent, String description,
                   String taste, double weight) {
        super(productName, price, quantity, producent, description);
        this.taste = taste;
        this.weight = weight;
        super.setCategory(Category.CAT);
    }

    public String getTaste() {
        return taste;
    }

    public void setTaste(String taste) {
        this.taste = taste;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return  "CatFood{" + super.toString() +
                "taste='" + taste + '\'' +
                ", weight=" + weight +
                '}';
    }
}
