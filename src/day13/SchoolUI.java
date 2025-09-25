package day13;

import java.util.Scanner;

public class SchoolUI {
    public static Scanner input = new Scanner(System.in);

    void printMainMenu() {
        System.out.println("=".repeat(50));
        System.out.println("메뉴를 선택하세요.");
        System.out.println("1. 등록");
        System.out.println("2. 찾기");
        System.out.println("3. 삭제");
        System.out.println("4. 전체출력");
        System.out.println("99. 종료");
    }

    int selectMenu(){
        System.out.println("번호를 선택하세요. =>");
        int no = input.nextInt();
        input.nextLine();
        return no;
    }

    public void printCreatePerson(){
        System.out.println("=".repeat(50));
        System.out.println("Person을 선택하세요.");
        System.out.println("1. 학생");
        System.out.println("2. 교수");
        System.out.println("3. 상위 메뉴 호출");
    }

    public String findByName(){
        System.out.println("이름");
        String name = input.nextLine();
        return name;
    }
}
