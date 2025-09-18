package day3;
import java.util.Scanner;
public class Practice01 {
    /*타수와 안타수를 입력받고 타율을 계산하세요.
    타수 : 55555
    안타 : 9955
    타율 : 0.179
    1할 7푼 9리
    **/
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("타수 :");
        int atBat = scan.nextInt();
        System.out.print("안타 :");
        int hit = scan.nextInt();
        double battingAvg = (double)hit/(double)atBat;
        int battingAvgDecimal = (int)(battingAvg*1000);
        int hal = battingAvgDecimal/100;
        int fuen = battingAvgDecimal%100/10;
        int lee = battingAvgDecimal%10;
        System.out.printf("타율 : %.3f\n", battingAvg);
        System.out.println(hal+"할 "+fuen+"푼 "+lee+"리");
    }
}
