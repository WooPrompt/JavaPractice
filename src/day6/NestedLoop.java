package day6;

import java.util.Scanner;

public class NestedLoop {
    public static void main(String[] args) {

        for(int i = 0 ; i<10 ; i++){
            for(int j = 0 ; j < 10 ; j++){
                System.out.println(i+"번째 반복에서 반복을 더 하는 중, "+j+"번째 반복");
            }
//            System.out.println(i+"번째 반복");
        }

        // 구구단　
        for (int i = 2; i < 12 ; i++){
            for (int j = 1; j < 10 ; j++){
                System.out.println(i+"x"+j+"="+i*j);
            }
            System.out.println("=".repeat(30));
        }


    }


}
