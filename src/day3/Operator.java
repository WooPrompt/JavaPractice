package day3;

public class Operator {
    public static void main(String[] args) {
        int math = 88;
        int english = 35;
        int total =math + english;

        double avg =  total /(double)2;
        System.out.println(avg);
        System.out.println(5-3);
        System.out.println(5*3);
        System.out.println(5%3);

        int num = 458;
        int one , hundred , ten;
        one = num % 10;
        System.out.println(one);
        ten = num %100 - one;
        System.out.println(ten);
        hundred = num - ten - one ;
        System.out.println(hundred);

        int hundredDigit = num/100;
        System.out.print("hundred digit : "+hundredDigit);
        int tenDigit = (num%100)/10;
        System.out.print(" ten digit : "+tenDigit);
        int oneDigit = num%10;
        System.out.print(" one digit : "+oneDigit);

        int i = 100;
        int minus = -100;
        System.out.println(+i);
        System.out.println(-i);
        System.out.println(+minus);
        System.out.println(-minus);// even if the print result sign was converted  , the original stored value are the same.
        // if you want to change the sign permanently , assign it explicitly to the variable
        minus = -minus;
        System.out.println(minus);

        int i2 = -323;
        i2 *= (-1);
        System.out.println(i2);

        int i3, i4 ;
        i3 = 4 ;
        i4 = 10;

        i3 /= 2;
        System.out.println(i3);
        i4 *= 2;
        System.out.println(i4);

        int score , lastScore;
        score = 80;
        lastScore = ++score;// increment operator affect to the original stored value.
        System.out.println(lastScore);
        System.out.println(score);
        System.out.println(lastScore++);
        System.out.println(lastScore);
    }
}
