package entities;

public class Producent {
    private int id;
    private int producentName;
    private String country;


    public Producent(int producentName, String country) {
        this.producentName = producentName;
        this.country = country;
    }

    public int getId() {
        return id;
    }

    public int getProducentName() {
        return producentName;
    }

    public void setProducentName(int producentName) {
        this.producentName = producentName;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}
