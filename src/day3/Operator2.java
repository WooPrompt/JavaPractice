package day3;

public class Operator2 {
    public static void main(String[] args) {
        int n1 =100, n2=95, n3=80;
        boolean boo;
        boo = n1 <= n2;
        System.out.println(boo);

        System.out.println(true&&true); // *and operator* if the lef operand and right operand are true, print the true .
        System.out.println(true&&false);
        System.out.println((n1 != n2)&& true);
        System.out.println((n1 >= n2)&& true);
        System.out.println("-".repeat(11));
        //*or operator*
        System.out.println(true||false);
        System.out.println(false||false);
        System.out.println((n1 != n2)||false);
        System.out.println("-".repeat(11));
        //!
        System.out.println(!false);

        System.out.println("=".repeat(11)); 
        //단락 회로 평가 short circuit evaluation
        //logical operators like && and ||, which skip evaluating the second (right) operand if the result can be determined by the first
        n1 = 2;
        n2 = 10;
        boo = (n1 += 10) > 10 || (n2 += 2) > 2 ;
        System.out.println(boo);
        System.out.println(n1);
        System.out.println(n2);

        // ternary operator
        System.out.println(true? 10:20);
        System.out.println(false? 10:20);
        System.out.println((5>2)? 10:20);

        int dadAge , momAge;
        dadAge = 40; momAge = 60;
        String result = (dadAge>momAge)? "dad is older than mom" : "mom is older than dad";
        System.out.println(result);


    }
}
