package day14.shipping;

public class ShippingMain {
    public static void main(String[] args) {
        Truck t1 = new Truck(10000);
        Truck t2 = new Truck(1000);
        Truck t3 = new Truck(100);
        Barge b1 = new Barge(20000);
        Barge b2 = new Barge(2000);
        Barge b3 = new Barge(200);

        System.out.println(t1 == t2);
        System.out.println(t1.equals(t2));
        Company c1 = Company.getInstance();// new로 인스턴스를 생성(계속 재생성)하는게 아니라 , 하나의 인스턴스를 컴퍼니 내부에 저장하여 싱글톤패턴으로 재사용.
        Company c2 = Company.getInstance();
        System.out.println( c1 == c2 ); // 싱글톤 패턴, c1과 c2가 주솟값이 같다 = 같은 인스턴스를 사용함을 확인가능

        c1.addVehicle(t2);
        c2.addVehicle(b1);
        c2.printVehicleList();

        FuelNeedsReport report = new FuelNeedsReport();
        report.printRequiredFuel();
    }
}
