package designpatterns;

import java.io.Serializable;

public class Singleton implements Serializable, Cloneable {

    private Singleton() {}
    private static class SingletonInner {
        private static final Singleton INSTANCE = new Singleton(); //BillPughSingleton
    }

    public static Singleton getInstance() {
        return SingletonInner.INSTANCE;
    }

    protected Object readResolve() {
        return SingletonInner.INSTANCE;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        throw new CloneNotSupportedException();
    }
}

