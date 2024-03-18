import java.util.ArrayList;
import java.util.List;

public class Cart {
    public List<Dish> dishes = new ArrayList<>();
    public Cart() {
    }
    public Cart(List<Dish> dishes) {
        this.dishes = dishes;
    }
    public void addProduct(Dish dish) {
        dishes.add(dish);
    }
    public void removeProduct(Dish dish) {
        dishes.remove(dish);
    }
    public double calculateTotal() {
        double total = 0;
        for (Dish dish : dishes) {
            total += dish.price;
        }
        return total;
    }
    public void checkout() {
        System.out.println("Checkout complete");
    }
    public void update(String message) {
        System.out.println("Cart received update: " + message);
    }
}
