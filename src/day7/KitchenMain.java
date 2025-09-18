package day7;

public class KitchenMain {
    public static void main(String[] args) {
        Ramen spicyMen = new Ramen();
        Ramen mediumMen = new Ramen("김치면",true);
        spicyMen.noodleType="안성탕면";
        spicyMen.boilWater();
        spicyMen.addNoodles();
        spicyMen.addSoup();
        spicyMen.isCooked=true;

        if(mediumMen.isCooked) System.out.println(mediumMen.noodleType+" 조리 완료");


    }
}
