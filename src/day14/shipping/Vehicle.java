package day14.shipping;

public abstract class Vehicle {
    String capacity;

    abstract double calculateTripDistance();

    abstract String getName();

    abstract double calculateFuelEfficiency();

    abstract void requiredFuel();
    public final double calculatedFuelNeeds(){ //연료량을 계산하는 공식은 변하면 안되니 final, 자식이 오버라이드 불가.
        //template method. 틀 자체는 고정이지만 내부 동작들은 abstract여서 각각의 자식이 자신만의 정의가 달라 다른방식으로 작동함.
        //실행 순서나 시나리오를 정의하는데 사용.
        return calculateTripDistance()/calculateFuelEfficiency();
    }


}
