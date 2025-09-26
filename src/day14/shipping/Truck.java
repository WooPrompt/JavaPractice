package day14.shipping;

public class Truck extends Vehicle{

    public Truck(double maxLoad){
        capacity = maxLoad+"kg";
    }

    @Override
    double calculateTripDistance() {
        return 100.0;
    }

    @Override
    String getName() {
        return "Truck ";
    }

    @Override
    public String toString() {
        return "Truck{" +
                "name='" + getName() + '\'' +
                "capacity='" + capacity + '\'' +
                '}';
    }
}
