package designpatterns;

class Volt {
    private int volts;

    public Volt(int volts) {
        this.volts = volts;
    }
    public int getVolts() {
        return volts;
    }

    public void setVolts(int volts) {
        this.volts = volts;
    }
}

class Socket {
    public Volt getVolt() {
        return new Volt(120);
    }
}

interface SocketAdaptor {
    public Volt get120Volt();
    public Volt get12Volt();
    public Volt get3Volt();
}

class SocketAdaptorImpl implements SocketAdaptor {

    private Socket socket;

    public SocketAdaptorImpl(Socket socket) {
        this.socket = socket;
    }

    @Override
    public Volt get120Volt() {
        return socket.getVolt();
    }

    @Override
    public Volt get12Volt() {
        int volts = socket.getVolt().getVolts()/10;
        return new Volt(volts);
    }

    @Override
    public Volt get3Volt() {
        int volts = socket.getVolt().getVolts()/40;
        return new Volt(volts);
    }
}

public class AdaptorPattern {
    public static void main(String[] args) {
        SocketAdaptor adaptor = new SocketAdaptorImpl(new Socket());
        Volt v3 = adaptor.get3Volt();
        Volt v12 = adaptor.get12Volt();
        System.out.println(v3.getVolts());
        System.out.println(v12.getVolts());
    }
}
