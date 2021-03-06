import entities.Client;
import entities.Product;
import entities.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

import java.util.List;
import java.util.Optional;
import java.util.Scanner;
import java.util.SortedMap;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        final SessionFactory sessionFactory = HibernateUtils.getSessionFactory();
        final Session session = sessionFactory.openSession();
        session.beginTransaction();
        User user = null;

        while (true) {
            System.out.println("Do you have an account?");
            System.out.println("Y - yes, N - no, Q - quit");
            String answear = scanner.nextLine();

            switch (answear) {
                case "Y":
                    System.out.println("Enter email");
                    String email = scanner.nextLine();
                    System.out.println("Enter password");
                    String password = scanner.nextLine();
                    Query findUser = session.createQuery("from Client c where c.email = :email");
                    findUser.setParameter("email", email);
                    Optional<Client> optional = findUser.stream().findAny();
                    if (optional.isPresent()) {
                         user =  optional.get();
                        if (user.logIn(password)) {
                            System.out.println("You are logged in");
                        } break;
                    } else {
                        System.out.println("No user found");
                    }
                    continue;
                case "N":
                    System.out.println("Set email");
                    email = scanner.nextLine();
                    System.out.println("Set password");
                    password = scanner.nextLine();
                     user = new Client(email, password);
                    session.save(user);
                    break;
                case "Q":
                    break;
                default:
                    continue;
            }
            break;
        }
        if (user != null && user.getClass() == Client.class) {
            while (true) {
                ClientPanel clientPanel = new ClientPanel(session, user);
                System.out.println("What do you want to do?");
                System.out.println("S - show all products, N - find by name, P - find by producent, " +
                        "A - add to cart, R - remove from cart, C - confirm and make order, Q - quit");
                String command = scanner.nextLine();
                switch (command) {
                    case "S":
                        clientPanel.findAllProducts();
                        continue;
                    case "N":
                        System.out.println("Enter product name");
                        String name = scanner.nextLine();
                        clientPanel.findByName(name);
                        continue;
                    case "P":
                        System.out.println("Enter producent name");
                        String producent = scanner.nextLine();
                        clientPanel.findByProducent(producent);
                        continue;
                    case "A":
                        System.out.println("Enter product id");
                        int id = scanner.nextInt();
                        clientPanel.addToCart(id);
                        continue;
                    case "R":
                        System.out.println("Enter product id");
                        int id2 = scanner.nextInt();
                        clientPanel.removeFromCard(id2);
                        continue;
                    case "C":
                        clientPanel.makeOrder();
                        continue;
                    case "Q":
                        break;
                    default:
                        System.out.println("Wrong command");
                        continue;
                }
                break;
            }
        }
        session.getTransaction().commit();
        session.close();
        HibernateUtils.shutdownSessionFactory();
    }
}
