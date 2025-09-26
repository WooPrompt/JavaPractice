package day14.shipping;

public class Barge extends Vehicle {
    String name;
    public Barge(double maxLoad){
        capacity = maxLoad+"kg";
    }

    @Override
    double calculateTripDistance() {
        return 50.0;
    }

    @Override
    String getName() {
        return "Barge";
    }

    @Override
    double calculateFuelEfficiency() {
        return 5.2;
    }

    @Override
    void requiredFuel() {
        System.out.printf("\n탈것 %s는 %.3fL의 연료가 필요합니다.\n", this.getName(), this.calculatedFuelNeeds());
    }

    @Override
    public String toString() {
        return "Barge{" +
                "name='" + getName() + '\'' +
                ", capacity='" + capacity + '\'' +
                '}';
    }
}
