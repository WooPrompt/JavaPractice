package day5;

public class ForPractice {
    public static void main(String[] args) {
        //369 game, if the number contains 3, 6, 9 = > clap / else, print number; 1~30
        int i = 1;
        for (i = 1; i <= 30; i++) {
            if((i%10) == 3 || (i%10) == 6 || (i%10) == 9 || (i/10)==3 || (i/10) == 6 || (i/10) == 9 ){

                System.out.println("clap");
                continue;
            }

            System.out.println(i);
        }


    }
}
