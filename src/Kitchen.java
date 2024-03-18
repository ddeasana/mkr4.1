import java.util.ArrayList;
import java.util.List;

public class Kitchen {
    private List<Observer> observers = new ArrayList<Observer>();
    public void addObserver(Observer observer) {
        observers.add(observer);
    }
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }
    public void notifyObservers(String message) {
        for (Observer observer : observers) {
            observer.update(message);
        }
    }
    public void cookOrder(Order order) {
        System.out.println("(kitchen) Order is in processing");
        order.setState(order.getInProcessing());
        notifyObservers("Order is in processing");

        System.out.println("(kitchen) Order is almost done");
        order.setState(order.getPreparing());
        notifyObservers("Order is almost done");

        System.out.println("(kitchen) Order is ready to be picked up");
        order.setState(order.getDelivered());
        notifyObservers("Order is ready to be picked up");
    }
}
