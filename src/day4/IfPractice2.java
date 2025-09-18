package day4;
import java.util.Scanner;
public class IfPractice2 {

    public static void ageCalculator(){
        Scanner scan = new Scanner(System.in);
        int thisYear , birthYear, age;
        System.out.println("올해를 입력하세요.");
        thisYear = scan.nextInt();
        System.out.println("생년을 입력하세요.");
        birthYear = scan.nextInt();
        if(!(birthYear>thisYear)) {
            age = thisYear - birthYear;

            System.out.println(age + "살");
            String isBirthYearOdd = birthYear % 2 == 0 ? "짝수 해" : "홀수 해";
            String isThisYear5multiple = thisYear % 5 == 0 ? "5의 배수이다." : "5의 배수가 아니다.";
            System.out.println("태어난 해가 " + isBirthYearOdd + "이고, 올해가 " + isThisYear5multiple);
        }
        else{
            System.out.println("잘못 입력하셨습니다.");
        }
    }

    public static void leapYearCalculator(){
        //태어난 해가 윤년인지 확인
        //4년마다 윤년, 100년마다 평년 단! 400년마다 무조건 윤년 이다.
        //2001년과 1900년은 평년이고 2004년이나 2000년은 윤년이다.
        Scanner scan = new Scanner(System.in);
        int  birthYear ;
        System.out.println("생년을 입력하세요.");
        birthYear = scan.nextInt();
        if (birthYear%4==0){
            String thisYearType = birthYear%100 == 0 ? "평년" : "윤년";
            if (birthYear%400 ==0 ) thisYearType ="윤년";
            System.out.println("태어난 해가 "+thisYearType+" 입니다.");
        }else {
            System.out.println("윤년이 아닙니다.");
        }
    }
    public static void main(String[] args) {
        //생년과 올해를 입력받으세요. 생년은 올해보다이전이여야 함 , 올바른 값을 입력한 경우에만
        //1.몇살인지 출력 "몇살" 2. 생년이 짝수해인지 확인"생년이 짝수해" 3."태어난 해가 홀수이고 올해가 5의 배수가 아니다."

        ageCalculator();

        leapYearCalculator();
        //if((birthYear%4==0) && (birthYear%100!=0)) || (birthYear%400)==0){ system.out.println("생년이 윤년");} else{System.out.println("윤년아님");}

    }
}
