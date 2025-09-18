package day6;

public class DataType {

    public static void print(double a) {
        System.out.println(a);
    }
//overloading
    public static void print(boolean a) {
        System.out.println(a);
    }

    public static void main(String[] args) {
        int i = 10;
        byte b = 127;
        short s = 32767;
        long l = 123456789000L;
        b++; //overflow (-128)
        b = (byte) (b + 1);
        s++;
        l++;

        print(l);
        print(b);
        print(s);
        double d = 3.14;
        float f = 3.14f;
        print(d);
        print(f);
        print(0.1 + 0.2);

        f = 3.4e38f;
        print(f * 10);
        f = 1.4e-45f;
        print(f / 10f);

        boolean boo = true;
        print(boo);
        boo = i < f;
        print(boo);

    }
}
