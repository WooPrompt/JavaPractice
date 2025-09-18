package day3;
import java.util.Scanner;
public class Practice03 {
    /*
    금액을 입력받아 최소 화폐 개수를 구한다.

    금액 : 67340
    50000원 : 1
    10000원 : 1
    5000원 : 1
    1000원 : 2
    500원 : 0
    100원 : 3
    50원 : 0
    10원 :4
    67340원은 총 12개의 화폐가 필요함.
    * */

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("금액 :");
        int money = scan.nextInt();
        int oman = money/50000 , man=(money/10000)%5 , ochen=(money%10000)/5000, chen=(money%5000)/1000 , obeck=(money%1000)/500, beck=(money%500)/100 , osib=(money%100)/50 , sib=(money%100)/10 ;
        // InitialMoney = scan.nextInt() ; oman = money/50000; money %= 50000; count +=oman ; man = money/10000 ; money %=10000; count +=man; ...
        int count =oman+man+ochen+chen+obeck+beck+sib+osib;
        System.out.println("금액 :"+money);
        System.out.println("50000원 :"+oman);
        System.out.println("10000원 :"+man);
        System.out.println("5000원 :"+ochen);
        System.out.println("1000원 :"+chen);
        System.out.println("500원 :"+obeck);
        System.out.println("100원 :"+beck);
        System.out.println("50원 :"+osib);
        System.out.println("10원 :"+sib);
        System.out.println(money+"는 총 "+count+"개의 화폐가 필요함.");

    }
}
