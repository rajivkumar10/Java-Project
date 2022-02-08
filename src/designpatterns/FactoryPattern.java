package designpatterns;

interface Vehicle {
    String getDescription();
}

class VehicleCar implements Vehicle {
    @Override
    public String getDescription() {
        return "Car";
    }
}

class VehicleBike implements Vehicle {
    @Override
    public String getDescription() {
        return "Bike";
    }
}

enum VehicleType {
    Bike, Car;
}

class VehicleFactory {
    public static Vehicle getVehicle(VehicleType vehicleType) throws Exception {
        Vehicle v = null;
        switch (vehicleType) {
            case Car:
                v = new VehicleCar();
                break;
            case Bike:
                v = new VehicleBike();
                break;
            default:
                throw new Exception("Not valid vehicle");
        }
        return v;
    }
}

public class FactoryPattern {
    public static void main(String[] args) throws Exception {
        Vehicle v = VehicleFactory.getVehicle(VehicleType.Bike);
        System.out.println(v.getDescription());
        v = VehicleFactory.getVehicle(VehicleType.Car);
        System.out.println(v.getDescription());
    }
}
