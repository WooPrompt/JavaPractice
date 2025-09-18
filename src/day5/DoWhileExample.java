package day5;

public class DoWhileExample {
    public static void main(String[] args) {
        int sum = 0;
        int i = 1;
        do {
            sum += i;
            i++;
        }while(i<=10); // at least executed once due do 'do' statement, so semi column is required.
        System.out.println("1~10 accumulation : "+sum);
    }
}
