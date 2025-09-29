package day15.star;

public abstract class Terran extends Race{
    Terran(){
    super.name="Tarran";
    }
    @Override
    void specialSkill() {
        System.out.println("You can fix a machine!");
    }
}
