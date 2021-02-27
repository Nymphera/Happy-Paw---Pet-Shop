package entities;

public class Client extends User{
    private String nickName;
    private int loyalityPoints = 0;

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
