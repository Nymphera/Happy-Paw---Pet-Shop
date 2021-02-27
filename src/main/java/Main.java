import entities.*;

public class Main {
    public static void main(String[] args) {
        Client user1 = new Client("email", "haslo123");
        System.out.println(user1.logIn("haslo"));
        System.out.println(user1.logIn("haslo123"));

        Producent acana = new Producent("Acana", "Germany");
        CatFood food = new CatFood("Food", 12, 10, acana, "opis", "chcken", 12.5);
        System.out.println(food.toString());
        Stock stock = new Stock();
        stock.addProduct(food);

        System.out.println(food.getClass());
        Cart cart = new Cart();
        cart.addtoCart(food);
        System.out.println(food.toString());



    }
}
