package day1_2;

public class StFormatting {
    public static void main(String[] args) {

        // %d 정수 10진  / 8진 o 16진 x X
        String name = "홍길동";
        System.out.printf("이름은 %s 입니다\n",name);
        System.out.printf("이름은 %s 입니다\n","name");
        System.out.printf("이름은 %s 입니다\n",1);
        System.out.printf("이름은 %5s 입니다\n",name);
        double d = 123.4567;
        int n = 1234;
        System.out.printf("d는 %6.1f이고, n은 %10d 입니다.\n",d,n);
        System.out.printf("정렬 출력 %10d right \n",n);
        System.out.printf("정렬 출력 %-10d right \n",n);
        System.out.printf("정렬 출력 %010d 오른쪽 정렬출력에서 0채우기 \n",n);
        System.out.printf("실수값 포맷팅 %f 디폴트가 소숫점 6자리까지, 없으면 0채움, 넘으면 반올림 \n",d);
        System.out.printf("실수값 포맷팅 %10.2f 열칸을 차지, 두번째자리까지만 출력 \n",d);
        System.out.printf("실수값 포맷팅 %-10.2f 열칸을 차지, 두번째자리까지만 출력 \n",d);
        System.out.printf("실수값 포맷팅 %010.2f 열칸을 차지 빈자리 0채움, 두번째자리까지만 출력 \n",d);

        int age =20;

        String myName = "우예은";
        System.out.printf("name : %s , age : %d \n",myName,age);

        System.out.println((int)'예');
        System.out.printf("\\u%04X",(int)'예');


    }
}
