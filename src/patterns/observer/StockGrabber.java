package patterns.observer;

import java.util.ArrayList;
import java.util.List;

public class StockGrabber implements Subject {
    private List<Observer> observerList;

    private double ibmPrice;
    private double applPrice;
    private double googPrice;

    public StockGrabber() {
        observerList = new ArrayList<>();
    }

    @Override
    public void register(Observer o) {
        observerList.add(o);
    }

    @Override
    public void unregister(Observer o) {
        int index = observerList.indexOf(o);
        System.out.println("Observer " + (index + 1) + " is removed");
        observerList.remove(o);
    }

    @Override
    public void notifyObservers() {
        for (Observer o : observerList) {
            o.update(ibmPrice, applPrice, googPrice);
        }
    }

    public void setIbmPrice(double ibmPrice) {
        this.ibmPrice = ibmPrice;
        notifyObservers();
    }

    public void setApplPrice(double applPrice) {
        this.applPrice = applPrice;
        notifyObservers();
    }

    public void setGoogPrice(double googPrice) {
        this.googPrice = googPrice;
        notifyObservers();
    }


}
