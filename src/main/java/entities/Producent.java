package entities;

public class Producent {
    private int id;
    private String producentName;
    private String country;


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
