package day3;

public class OperatorPrecedence {
    public static void main(String[] args) {
        //괄호 > 단항> 이항(곱나눗나머지>덧뺄셈)>삼항
        // 비교, 관계 > 논리 > 대입 > 삼항
        int result1 = 2+3*4;
        System.out.println(result1);

        System.out.println("=".repeat(10));
        int a = 10, b = 4;
        a = b+2;
        System.out.println("a = "+a);

        System.out.println("=".repeat(10));
        boolean result3 = 5>3 && 2<4;
        System.out.println("result3 ="+result3);

        System.out.println("=".repeat(10));
        //논리 부정 연산자(단항연산자 !)와 비교 연산자의 우선순위
        boolean result4 = !(5 < 3);
        System.out.println("result4 = "+result4);

        int result5 = 10 - 3 + 2 * 5 / (1+1);
        System.out.println("result5 = "+result5);

    }
}
