package day7;

import javax.script.ScriptContext;
import java.util.Scanner;

public class BMICalculator {
    //키와 몸무게 입력받기
    //입력 받을 수 있게 하기
    //BMI = (키m * 키m) / kg 저체중 : < 18.5 , 정상 18.5 ~ 24.9 , 과체중 25.0~ 29.9 , 비만 30이상
    //키 몸무게는 0보다 커야하고, 단위 신경쓰기 , 메소드 분리, 반복문 적용 , 조건 분기

    public static double scan() {
        Scanner sc = new Scanner(System.in);
        double scan = sc.nextDouble();
        return scan;
    }

    public static double BMI(double height, double weight) {
        double heightM = height / 100.0;
        return weight / (heightM * heightM);
    }

    public static String BMIStr(double bmi) {
        String bmiStr = "";
        if (bmi < 18.5) bmiStr = "저체중";
        else if (bmi >= 18.5 && bmi <= 24.9) bmiStr = "정상체중";
        else if (bmi >= 25 && bmi <= 29.9) bmiStr = "과체중";
        else if (bmi >= 30) bmiStr = "비만";
        return bmiStr;
    }

    public static void bmiExe() {
        System.out.println("BIM 계산기 \n0을 누르시면 종료됩니다.");
        boolean isNotZero = true;
        double height =1 ;
        double weight =1;
        do {
            if (height != 0 || weight != 0) {
            System.out.println("키(cm)를 입력하세요.");
            height = scan();
            System.out.println("몸무게(kg)를 입력하세요.");
            weight = scan();
                double BMI = BMI(height, weight);
                String BMIstr = BMIStr(BMI);
                System.out.printf("BMI = %.1f(kg) / (%.1f(cm) x %.1f(cm) = %.1f \n%s\n", weight, height, height, BMI, BMIstr);
            } else {
                isNotZero = false;
                System.out.println("프로그램을 종료합니다. 잘가요!");
            }
        }
        while (isNotZero) ;
    }

    public static void main(String[] args) {
        bmiExe();
    }
}
