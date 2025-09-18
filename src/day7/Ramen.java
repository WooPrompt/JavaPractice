package day7;

public class Ramen {
    //member = ingredients
    String noodleType;
    boolean hasSoup;
    boolean isCooked;


    Ramen(){

    }

    Ramen(String dt,boolean tc){
     noodleType = dt;
     isCooked = tc;
    }
    
    void boilWater(){
        System.out.println("boiling water..");
    }
    void addNoodles(){
        System.out.println("putting the noddles..");
    }
    void addSoup(){
        System.out.println("adding soup...");
    }

    public static void main(String[] args) {
    }
}
