package stream;

public class Event {
    long timestamp;
    double x;
    double y;
    public Event(long timestamp, double x, double y) {
        this.timestamp = timestamp;
        this.x = x;
        this.y = y;
    }

    public long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(long timestamp) {
        this.timestamp = timestamp;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }
}
