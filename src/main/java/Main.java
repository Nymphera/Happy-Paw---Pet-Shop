import entities.Client;
import entities.User;

public class Main {
    public static void main(String[] args) {
        Client user1 = new Client("email", "haslo123");
        System.out.println(user1.logIn("haslo"));
        System.out.println(user1.logIn("haslo123"));


    }
}
