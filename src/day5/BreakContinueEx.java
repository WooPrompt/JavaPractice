package day5;

public class BreakContinueEx {
    public static void main(String[] args) {
        int sum = 0;
        int i = 1;
//        int [] omittedNumber = new int[100];
        for (i = 1; i < 99; i++) {
            // calculate 1~30 accumulation which is odd
            if(i%2 == 1){
                System.out.println("omitted number : "+i);
                continue;
            }
            System.out.println("acumulated sum : "+sum);
            sum += i;
            // break at specific condition
            if (i >= 30) {
                break;
            }
        }
        System.out.println("1~30 accumulation : "+sum +"\niteration : "+i );
    }
}
