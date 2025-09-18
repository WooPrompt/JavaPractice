package day5;

public class SwitchCase3 {
    public static void main(String[] args) {
        String medalColor = "blank";
        String message = switch (medalColor) {
            case "gold"->"gold medal";
            case "silver"->"silver medal";
            case "bronze"->"bronze medal";
            default->{
                if("blank"==medalColor) {
                    yield "participation prize";
                }else{
                    yield "there isn't a prize like that";
                }
            }
        };
        System.out.println(message);
    }
}
