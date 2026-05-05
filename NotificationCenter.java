import java.util.*;

public class NotificationCenter {

    private List<Observer> observers = new ArrayList<>();

    public void addObserver(Observer o) {
        observers.add(o);
    }

    public void notifyAllUsers(String message) {
        for (Observer o : observers) {
            o.update(message);
        }
    }
}