package day5;

public class ForExample {
    public static void main(String[] args) {
        int sum = 0;
        int i = 0 ;
        for(; ; i++){

            if( i >= 10){
                System.out.println("stop at i = "+i);
                break;
            }
            sum += i ;
        }
        System.out.println("1~10 accumulation : "+sum+"\n i :"+i);

        //you can skip the one or more sections from the declaration, but you should put the semicolon in it
        //https://www.tutorialgateway.org/java-for-loop/


    }
}
