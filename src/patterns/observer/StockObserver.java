package patterns.observer;

public class StockObserver implements Observer {

    private Subject stockGrabber;
    private static int observerIdTracker;
    private int observerId;

    private double ibmPrice;
    private double applPrice;
    private double googPrice;

    public StockObserver(Subject stockGrabber) {
        this.stockGrabber = stockGrabber;
        this.observerId = ++observerIdTracker;
        System.out.println("New Observer " + this.observerId + " created");
        stockGrabber.register(this);
    }
    @Override
    public void update(double ibmPrice, double applPrice, double googPrice) {
        this.ibmPrice = ibmPrice;
        this.applPrice = applPrice;
        this.googPrice = googPrice;
        printPrices();
    }

    private void printPrices() {
        System.out.println(observerId + "\nIBM Price: " + ibmPrice + "\nApple Price: " + applPrice + "\nGoogle Price: " + googPrice + "\n");
    }
}
