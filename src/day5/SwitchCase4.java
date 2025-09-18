package day5;
//https://docs.oracle.com/en/java/javase/17/language/switch-expressions-and-statements.html
import java.util.Scanner;

public class SwitchCase4 {
    public static void main(String[] args) {
        // 1 3 5 7 8 10 12 -> 31
        // 2 -> 28
        // 4 6 9 11 -> 30
        Scanner sc = new Scanner(System.in);
        System.out.println("달을 입력하세요.(예:12)");
        int month = sc.nextInt();
//        int day = switch (month) {
//            case 1, 3, 5, 7, 8, 10, 12 -> 31;
//            case 2 -> 28;
//            case 4, 6, 9, 11 -> 30;
//            default -> throw new IllegalStateException("invalid day");
//        };
//        System.out.println(month + "월의 날짜는 " + day + "일까지 있습니다.");
        System.out.println(
                month + "월의 날짜는 " +
                        switch (month) {
                            case 1, 3, 5, 7, 8, 10, 12 -> 31;
                            case 2 -> 28;
                            case 4, 6, 9, 11 -> 30;
                            default -> throw new IllegalStateException(month+" is invalid day! check again!");
                        }
                        + "일까지 있습니다."
        );
    }
}
