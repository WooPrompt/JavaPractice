package day10.array.basic;

public class ArrayTest {
    public static void main(String[] args) {
        int[] numbers;
        int[] nums = {1, 2, 3};
        int[] nums1 = new int[4];

        //caution patterns
        int[] numErr;
//        numErr = {1,2,3};
//        numErr[0] = 1; //doesn't know coverage
//        int[] numErr2 = new int[3] {1,2,3,4}; // memory coverage collision VM doesn't know array coverage is 3 or 4.
        int[] nums3 = new int[] {1,2,3,4}; //okay


        int[] numsOK ;
        numsOK = new int[3]; // Array must be declared that how much it is ( memory ) when it is initialized.
        numsOK[0] = 1; // Starting from the 0.
        numsOK[1] = 2;
        numsOK[2] = 3;
//        numsOK[3] = 2;

        System.out.println("Length of array :"+numsOK.length);

        System.out.println("Normal for loop");
        for (int i = 0; i<numsOK.length ; i++){
            System.out.print(i+",");
        }

        System.out.println("Advanced for loop");
        for(int j : numsOK){//extracting element
            System.out.print(j+",");
        }
    }
}
