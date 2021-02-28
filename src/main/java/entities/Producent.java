package entities;

import javax.persistence.*;
import java.util.List;

@Entity
@Table (name = "producents")
public class Producent {
    @Id
    @GeneratedValue
    private int id;
    @Column (name = "producent_name")
    private String producentName;
    @Column (name = "country")
    private String country;
    @Column
    @OneToMany
    private List<Product> listOfProducts;


    public Producent(String producentName, String country) {
        this.producentName = producentName;
        this.country = country;
    }

    public int getId() {
        return id;
    }

    public String getProducentName() {
        return producentName;
    }

    public void setProducentName(String producentName) {
        this.producentName = producentName;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}
