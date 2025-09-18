package day6;

import java.util.Scanner;

public class FunctionTest {

    public static int addFunc(int a, int b) {
        int result = a + b;
        return result;
    }

    public static int multipleFunc(int a, int b) {
        int result = a * b;
        return result;
    }

    public static int differFunc(int a, int b) {
        int result = a>b ? a - b : b-a ;
        return result;
    }
   public static void powerFunc(int a, int b) {
        int aSquare = a*a;
        int bSquare = b*b;
       System.out.printf("%d^2 = %d",a,aSquare);
       System.out.printf("%d^2 = %d",b,bSquare);
    }


    public static void main(String[] args) {
        int num1, num2;
        Scanner sc = new Scanner(System.in);


        System.out.print("Input number1 :");
        num1 = sc.nextInt();

        System.out.print("Input number2 :");
        num2 = sc.nextInt();

        int add = addFunc(num1, num2);
        int multiple = multipleFunc(num1, num2);
        int difference = differFunc(num1, num2);
        System.out.printf("sum = %d\t", add);
        System.out.printf("multiple = %d\t", multiple);
        System.out.printf("gap = %d\t", difference);
        powerFunc(num1,num2);
    }
}
