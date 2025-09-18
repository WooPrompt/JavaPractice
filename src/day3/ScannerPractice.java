package day3;

import java.util.Scanner;

public class ScannerPractice {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("What's your name");
        System.out.println("=".repeat(11));
        String userInput = scan.nextLine();
        String name = "Name : ";
        char ch = name.charAt(0);
        System.out.println(name +userInput);
        System.out.println("How old are you");
        System.out.println("=".repeat(11));
        int age = scan.nextInt();
        String ageA = "age : ";
        System.out.println(ageA + age);

        //buffer was read;
        System.out.println("New Name");
        System.out.println("=".repeat(11));
        String newName = scan.nextLine();
        System.out.println("New Name : "+newName);
        scan.close();
    }
}
