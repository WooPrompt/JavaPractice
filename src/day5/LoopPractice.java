package day5;

public class LoopPractice {
    public static void main(String[] args) {
        int i = 0;

        // 0 2 4 6 8 10
        for (i = 0; i <= 10; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
        for (i = 0; i <= 10; i += 2) {
            System.out.print(i + " ");
        }
        System.out.println();
        //1 3 5 7 9
        for (i = 0; i <= 10; i++) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
        }
        // 10 9 8 7 6 5 4 3 2 1
        System.out.println();

        for (i = 10; i > 0; i--) {
            System.out.print(i + " ");

        }

        System.out.println();

        for (i = 10; i <= 50; i+=10) {
            System.out.print(i + " ");

        }

        //1 10 100 100 1000 10000
        System.out.println();

        for (i = 10; i <= 10000; i*=10) {
            System.out.print(i + " ");

        }

        // 3 type of print ( increment operator  / continue / break) // substitute it by While statement.
    }
}
