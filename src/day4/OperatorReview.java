package day4;

public class OperatorReview {
    public static void main(String[] args) {
        int momAge  = 34 , dadAge = 34 ;
        String result;
        if(dadAge>momAge)result = "아빠가 더 나이가 많음";
        else if (dadAge == momAge) result = "둘이 나이가 같음";
        else result ="엄마가 더 나이가 많음";
        System.out.println(result);


        int x = 1 , y = 0;
        if(y!=0&& (x/y>0)){
            System.out.println("y is not 0");
        }
    }
}
