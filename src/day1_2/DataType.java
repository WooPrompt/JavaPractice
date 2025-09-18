package day1_2;

public class DataType {
    public static void main(String[] args) {
        int i = 10;
        byte b = 127;
        short s = 32767;
        long l = 123456789000L;
        b++; //overflow (-128)
        b = (byte)(b+1);
        s++;
        l++;

        System.out.println(l);
        System.out.println(b);
        System.out.println(s);

        double d = 3.14;
        float f = 3.14f;
        System.out.println(d);
        System.out.println(f);
        System.out.println(0.1+0.2);

        f = 3.4e38f;
        System.out.println(f*10);
        f = 1.4e-45f;
        System.out.println(f/10f);

        boolean boo = true;
        System.out.println(boo);
        boo = i < f ;
        System.out.println(boo);

    }
}
