package patterns.observer;

public class ObserverPattern {
    public static void main(String[] args) {
        StockGrabber stockGrabber = new StockGrabber();
        StockObserver observer1 = new StockObserver(stockGrabber);
        stockGrabber.setIbmPrice(193.25);
        stockGrabber.setApplPrice(282.10);
        stockGrabber.setGoogPrice(832.40);
        StockObserver observer2 = new StockObserver(stockGrabber);
        stockGrabber.setIbmPrice(193.25);
        stockGrabber.setApplPrice(282.10);
        stockGrabber.setGoogPrice(832.40);
        stockGrabber.unregister(observer2);
        stockGrabber.setIbmPrice(193.25);
        stockGrabber.setApplPrice(282.10);
        stockGrabber.setGoogPrice(832.40);
    }
}
