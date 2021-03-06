package entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table (name = "clients")
public class Client extends User{
    @Column (name = "username")
    private String nickName;
    @Column (name = "loyality_points")
    private int loyalityPoints = 0;

    public Client() {
    }

    public Client(String email, String password) {
        super(email, password);
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public int getLoyalityPoints() {
        return loyalityPoints;
    }

    public void setLoyalityPoints(int loyalityPoints) {
        this.loyalityPoints = loyalityPoints;
    }


}
