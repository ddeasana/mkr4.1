import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Waiter> waiters = new ArrayList<>();
        Kitchen kitchen = new Kitchen();
        Client client = new Client();

        List<Dish> dishList = new ArrayList<>();
        dishList.add(new Dish("Grape", 1.99));
        dishList.add(new Dish("Apple", 0.99));
        dishList.add(new Dish("Juice", 6));
        dishList.add(new Dish("Pasta", 13));
        dishList.add(new Dish("Pizza", 10.60));

        waiters.add(new Waiter("Ann"));
        waiters.add(new Waiter("Max"));

        kitchen.addObserver(client);

        client.cart = new Cart(dishList);
        client.cart.checkout();
        Order order = waiters.get(1).takeOrder(new OrderData(dishList, new SelfPickupStrategy()), kitchen);
    }
}