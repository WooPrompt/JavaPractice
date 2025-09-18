package day5;

public class WhileExample {
    public static void main(String[] args) {
        int sum = 0 ;
        int index = 1; //iteration
        while (true) {
            sum += index ;
            index++;
            if(index>=10){
                break;
            }
        }
        System.out.println("1~10 accumulation : " + sum);
    }
}
