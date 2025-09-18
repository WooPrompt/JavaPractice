package day5;

public class SwitchCase2 {
    public static void main(String[] args) {
        String medalColor = "gold";
        switch (medalColor) {
            case "gold":
                System.out.println("gold medal");
                break;
            case "silver":
                System.out.println("silver medal");
                break;
            case "bronze":
                System.out.println("bronze medal");
                break;
            default:
                System.out.println("participation prize");
        }
    }
}
