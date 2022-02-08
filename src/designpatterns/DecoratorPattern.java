package designpatterns;

interface Car {
    public void assemble();
}
class BasicCar implements Car {
    @Override
    public void assemble() {
        System.out.println("Basic car");
    }
}

class CarDecorator implements Car {
    private Car c;
    public CarDecorator(Car c) {
        this.c = c;
    }
    @Override
    public void assemble() {
        this.c.assemble();
    }
}

class SportsCar extends CarDecorator {
    SportsCar(Car c) {
        super(c);
    }
    @Override
    public void assemble() {
        super.assemble();
        System.out.println("Added Sports car features");
    }
}



public class DecoratorPattern {
    public static void main(String[] args) {
        Car c = new BasicCar();
        CarDecorator cd = new SportsCar(c);
        cd.assemble();
    }
}
