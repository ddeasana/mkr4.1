import java.util.ArrayList;
import java.util.List;


public class OrderData {
    private List<Dish> dishes = new ArrayList<>();
    private DeliveryStrategy deliveryStrat;
    public Double totalCost() {
        double total = 0;
        for (Dish dish : dishes) {
            total += dish.price;
        }
        return total;
    }
    public OrderData(List<Dish> dishes, DeliveryStrategy deliveryStrat) {
        this.dishes = dishes;
        this.deliveryStrat = deliveryStrat;
    }
    public Double getTotal() {
        double deliveryCost = deliveryStrat.DeliveryCost(this);
        return totalCost()+deliveryCost;
    }
}
