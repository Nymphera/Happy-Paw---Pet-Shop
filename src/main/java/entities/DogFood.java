package entities;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class DogFood extends Product{
    @Column
    private String taste;
    @Column
    private double weight;


    public DogFood(String productName, double price, int quantity, Producent producent, String description,
                   String taste, double weight) {
        super(productName, price, quantity, producent, description);
        this.taste = taste;
        this.weight = weight;
        super.setCategory(Category.DOG);
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
        return  "DogFood{" + super.toString() +
                "taste='" + taste + '\'' +
                ", weight=" + weight +
                '}';
    }
}
