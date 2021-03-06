package entities;

import javax.persistence.*;


@MappedSuperclass
public abstract class User {
    @Id
    @GeneratedValue
    private int id;
    @Column (name = "email", unique = true)
    private String email;
    @Column (name = "password")
    private String password;
    @Column (name = "name")
    private String name;
    @Column (name = "surname")
    private String surname;
    @Column
    private String city;
    @Column
    private String street;
    @Column (name = "houde_number")
    private String houseNumber;
    @Column (name = "postal_code")
    private String postalCode;
    @Column (name = "telephone_number")
    private String telephoneNumber;

    public User() {
    }

    public User(String email, String password) {
        this.email = email;
        this.password = password;
    }

    public int getId() {
        return id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getHouseNumber() {
        return houseNumber;
    }

    public void setHouseNumber(String houseNumber) {
        this.houseNumber = houseNumber;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getTelephoneNumber() {
        return telephoneNumber;
    }

    public void setTelephoneNumber(String telephoneNumber) {
        this.telephoneNumber = telephoneNumber;
    }

    public  boolean logIn(String password) {
        return this.password == password;
    }
}
