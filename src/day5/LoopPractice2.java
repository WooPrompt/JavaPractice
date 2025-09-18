package day5;

public class LoopPractice2 {

    // 1 2 3 4 5 6 7 8 9 10
    public static void printPattern1ForInc() {
        for (int i = 1; i <= 10; i++) System.out.print(i + " ");
        System.out.println();
    }
    public static void printPattern1ForContinue() {
        for (int i = 0; i <= 10; i++) {
            if (i == 0) continue;
            System.out.print(i + " ");
        }
        System.out.println();
    }
    public static void printPattern1ForBreak() {
        for (int i = 1;; i++) {
            if (i > 10) break;
            System.out.print(i + " ");
        }
        System.out.println();
    }
    public static void printPattern1WhileInc() {
        int i = 1;
        while (i <= 10) {
            System.out.print(i + " ");
            i++;
        }
        System.out.println();
    }
    public static void printPattern1WhileContinue() {
        int i = 0;
        while (i < 10) {
            i++;
            if (i == 0) continue;
            System.out.print(i + " ");
        }
        System.out.println();
    }
    public static void printPattern1WhileBreak() {
        int i = 1;
        while (true) {
            if (i > 10) break;
            System.out.print(i + " ");
            i++;
        }
        System.out.println();
    }

    // 0 2 4 6 8 10
    public static void printPattern2ForInc() {
        for (int i = 0; i <= 10; i += 2) System.out.print(i + " ");
        System.out.println();
    }
    public static void printPattern2ForContinue() {
        for (int i = 0; i <= 10; i++) {
            if (i % 2 != 0) continue;
            System.out.print(i + " ");
        }
        System.out.println();
    }
    public static void printPattern2ForBreak() {
        for (int i = 0;; i += 2) {
            if (i > 10) break;
            System.out.print(i + " ");
        }
        System.out.println();
    }
    public static void printPattern2WhileInc() {
        int i = 0;
        while (i <= 10) {
            System.out.print(i + " ");
            i += 2;
        }
        System.out.println();
    }
    public static void printPattern2WhileContinue() {
        int i = -1;
        while (i < 10) {
            i++;
            if (i % 2 != 0) continue;
            System.out.print(i + " ");
        }
        System.out.println();
    }
    public static void printPattern2WhileBreak() {
        int i = 0;
        while (true) {
            if (i > 10) break;
            System.out.print(i + " ");
            i += 2;
        }
        System.out.println();
    }

    // 1 3 5 7 9
    public static void printPattern3ForInc() {
        for (int i = 1; i <= 9; i += 2) System.out.print(i + " ");
        System.out.println();
    }
    public static void printPattern3ForContinue() {
        for (int i = 1; i <= 9; i++) {
            if (i % 2 == 0) continue;
            System.out.print(i + " ");
        }
        System.out.println();
    }
    public static void printPattern3ForBreak() {
        for (int i = 1;; i += 2) {
            if (i > 9) break;
            System.out.print(i + " ");
        }
        System.out.println();
    }
    public static void printPattern3WhileInc() {
        int i = 1;
        while (i <= 9) {
            System.out.print(i + " ");
            i += 2;
        }
        System.out.println();
    }
    public static void printPattern3WhileContinue() {
        int i = 0;
        while (i < 9) {
            i++;
            if (i % 2 == 0) continue;
            System.out.print(i + " ");
        }
        System.out.println();
    }
    public static void printPattern3WhileBreak() {
        int i = 1;
        while (true) {
            if (i > 9) break;
            System.out.print(i + " ");
            i += 2;
        }
        System.out.println();
    }

    // 10 9 8 7 6 5 4 3 2 1
    public static void printPattern4ForInc() {
        for (int i = 10; i >= 1; i--) System.out.print(i + " ");
        System.out.println();
    }
    public static void printPattern4ForContinue() {
        for (int i = 10; i >= 1; i--) {
            if (i < 1) continue;
            System.out.print(i + " ");
        }
        System.out.println();
    }
    public static void printPattern4ForBreak() {
        for (int i = 10;; i--) {
            if (i < 1) break;
            System.out.print(i + " ");
        }
        System.out.println();
    }
    public static void printPattern4WhileInc() {
        int i = 10;
        while (i >= 1) {
            System.out.print(i + " ");
            i--;
        }
        System.out.println();
    }
    public static void printPattern4WhileContinue() {
        int i = 11;
        while (i > 1) {
            i--;
            if (i < 1) continue;
            System.out.print(i + " ");
        }
        System.out.println();
    }
    public static void printPattern4WhileBreak() {
        int i = 10;
        while (true) {
            if (i < 1) break;
            System.out.print(i + " ");
            i--;
        }
        System.out.println();
    }

    // 10 20 30 40 50
    public static void printPattern5ForInc() {
        for (int i = 10; i <= 50; i += 10) System.out.print(i + " ");
        System.out.println();
    }
    public static void printPattern5ForContinue() {
        for (int i = 10; i <= 50; i++) {
            if (i % 10 != 0) continue;
            System.out.print(i + " ");
        }
        System.out.println();
    }
    public static void printPattern5ForBreak() {
        for (int i = 10;; i += 10) {
            if (i > 50) break;
            System.out.print(i + " ");
        }
        System.out.println();
    }
    public static void printPattern5WhileInc() {
        int i = 10;
        while (i <= 50) {
            System.out.print(i + " ");
            i += 10;
        }
        System.out.println();
    }
    public static void printPattern5WhileContinue() {
        int i = 9;
        while (i < 50) {
            i++;
            if (i % 10 != 0) continue;
            System.out.print(i + " ");
        }
        System.out.println();
    }
    public static void printPattern5WhileBreak() {
        int i = 10;
        while (true) {
            if (i > 50) break;
            System.out.print(i + " ");
            i += 10;
        }
        System.out.println();
    }

    // 1 10 100 1000 10000
    public static void printPattern6ForInc() {
        for (int i = 1; i <= 10000; i *= 10) System.out.print(i + " ");
        System.out.println();
    }
    public static void printPattern6ForContinue() {
        for (int i = 1; i <= 10000; i++) {
            if (i != 1 && i != 10 && i != 100 && i != 1000 && i != 10000) continue;
            System.out.print(i + " ");
        }
        System.out.println();
    }
    public static void printPattern6ForBreak() {
        for (int i = 1;; i *= 10) {
            if (i > 10000) break;
            System.out.print(i + " ");
        }
        System.out.println();
    }
    public static void printPattern6WhileInc() {
        int i = 1;
        while (i <= 10000) {
            System.out.print(i + " ");
            i *= 10;
        }
        System.out.println();
    }
    public static void printPattern6WhileContinue() {
        int i = 0;
        while (i <= 10000) {
            if (i == 1 || i == 10 || i == 100 || i == 1000 || i == 10000)
                System.out.print(i + " ");
            i++;
        }
        System.out.println();
    }
    public static void printPattern6WhileBreak() {
        int i = 1;
        while (true) {
            if (i > 10000) break;
            System.out.print(i + " ");
            i *= 10;
        }
        System.out.println();
    }

    // Print dashes
    public static void printDash() {
        System.out.println("---------------------");
    }
    // Print separator for patterns
    public static void printPatternSeparator() {
        System.out.println("========");
    }


    // For-loop version
    public static void printThreeSixNineFor() {
        for (int i = 1; i <= 50; i++) {
            int count = 0;
            int n = i;
            while (n > 0) {
                int digit = n % 10;
                if (digit == 3 || digit == 6 || digit == 9) count++;
                n /= 10;
            }
            if (count == 0) {
                System.out.print(i + " ");
            } else {
                for (int j = 0; j < count; j++) System.out.print("짝");
                System.out.print(" ");
            }
        }
        System.out.println();
    }

    // While-loop version
    public static void printThreeSixNineWhile() {
        int i = 1;
        while (i <= 50) {
            int count = 0;
            int n = i;
            while (n > 0) {
                int digit = n % 10;
                if (digit == 3 || digit == 6 || digit == 9) count++;
                n /= 10;
            }
            if (count == 0) {
                System.out.print(i + " ");
            } else {
                for (int j = 0; j < count; j++) System.out.print("짝");
                System.out.print(" ");
            }
            i++;
        }
        System.out.println();
    }


    public static void main(String[] args) {
        // Pattern 1
        printPattern1ForInc();
        printPattern1ForContinue();
        printPattern1ForBreak();
        printPattern1WhileInc();
        printPattern1WhileContinue();
        printPattern1WhileBreak();
        printDash();
        printPatternSeparator();

        // Pattern 2
        printPattern2ForInc();
        printPattern2ForContinue();
        printPattern2ForBreak();
        printPattern2WhileInc();
        printPattern2WhileContinue();
        printPattern2WhileBreak();
        printDash();
        printPatternSeparator();

        // Pattern 3
        printPattern3ForInc();
        printPattern3ForContinue();
        printPattern3ForBreak();
        printPattern3WhileInc();
        printPattern3WhileContinue();
        printPattern3WhileBreak();
        printDash();
        printPatternSeparator();

        // Pattern 4
        printPattern4ForInc();
        printPattern4ForContinue();
        printPattern4ForBreak();
        printPattern4WhileInc();
        printPattern4WhileContinue();
        printPattern4WhileBreak();
        printDash();
        printPatternSeparator();

        // Pattern 5
        printPattern5ForInc();
        printPattern5ForContinue();
        printPattern5ForBreak();
        printPattern5WhileInc();
        printPattern5WhileContinue();
        printPattern5WhileBreak();
        printDash();
        printPatternSeparator();

        // Pattern 6
        printPattern6ForInc();
        printPattern6ForContinue();
        printPattern6ForBreak();
        printPattern6WhileInc();
        printPattern6WhileContinue();
        printPattern6WhileBreak();
        printDash();
        printPatternSeparator();

        //369
        printThreeSixNineFor();
        printThreeSixNineWhile();
    }
}
