package day3;

public class TypeConversion {
    public static void main(String[] args) {
        byte bNum = 10;
        int iNum = bNum;
        System.out.println(bNum);
        System.out.println(iNum);

        int iNum2 = 20;
        float fNum = iNum2;
        System.out.println(iNum2);
        System.out.println(fNum);

        int num1 = 128;
        byte num2 = (byte) num1;
        System.out.println(num2);

        double dNumPI = 3.94;//throw away after the decimal point
        int iNumPI = (int) dNumPI;
        System.out.println(dNumPI);
        System.out.println(iNumPI);

        double dNum1 = 1.2;
        float fNum2 = 0.9f;

        int iNum3 = (int) (dNum1+fNum2);
        System.out.println(iNum3);
        int iNum4 = (int)dNum1+(int)fNum2;
        System.out.println(iNum4);

    }
}
