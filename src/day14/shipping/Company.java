package day14.shipping;

public class Company {
    private String name;
    private Vehicle[] vehicles;
    private int v_num;
    //    private static Company instance = new Company();//컴퍼니 인스턴스에 접근하는 유일한 방법은 메서드를 통해 접근. //메모리효율화를 위해 생성자가 생성시에 만들게 변경
    private static Company instance; // 내부에서 생성한 객체를 저장하기 위한 필드. 클래스 로드 시점에 존재해야하므로 static.

    private Company() {//외부에서 객체를 무단으로 많이 생성하지 못하게, 생성을 밖에서 못하게 생성자를 private으로 만들기
        //싱글톤 패턴 , 인스턴스가 애플리케이션 내에서 한번만 생성, 전역에서 한 인스턴스 공유 , 프라이빗으로 생성자 -> 컴퍼니가 로드될때 곧바로 객체생성
        this.vehicles = new Vehicle[10];
    }

    public static Company getInstance() { // public Company getInstance() 로 스태틱이 아니라면, 객체가 생성되지 않으면 호출불가하니 스태틱으로 사용. 외부에서 사용가능하게 public
        //메모리 효율화를 위해 가장 처음으로 컴퍼니 객체를 스태틱 메소드로 요청 했을때 객체 생성하도록 작성.
        if (instance == null) { // nullPointException 방지
            instance = new Company();//내부에서 생성한 객체 저장
        }
        return instance;
    }

    void addVehicle(Vehicle vehicle) {
        vehicles[v_num++] = vehicle;
    }

    void printVehicleList() {
        for (Vehicle v : vehicles) {
            if (v != null) System.out.println(v);
        }
    }

    public Vehicle[] getVehicles() {
        return vehicles;
    }
}
