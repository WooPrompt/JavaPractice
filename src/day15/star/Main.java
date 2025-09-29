package day15.star;

public class Main {
    public static void main(String[] args) {
//        SCV s = new SCV();
//        s.specialSkill();
//        s.getMineral();
//
//        Zergling z = new Zergling();
//        z.specialSkill();
//        z.getMineral();

        Race[] units = {new Zergling(),new SCV()};

        for(Race unit : units){
            unit.specialSkill();
            if(unit instanceof Worker){
                ((Worker)unit).getMineral();
                ((Worker)unit).introduce();
            }
        }

    }
}
