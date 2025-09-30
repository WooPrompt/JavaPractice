package day16.string;

public class StringBufferTest {
    public static void main(String[] args) {
        String str = "String";
        long startTime;
        int lasting = 100000;
        long concatSpendTime;
        //Literal of the string object stored into the string pool.
        //concat => generate new object, it's waste of memory.
        String newStr ="";
        startTime = System.currentTimeMillis();
        for(int i = 0; i<lasting; i++){
            newStr += str;
        }
        concatSpendTime = System.currentTimeMillis()-startTime;
        System.out.println("String concatenation time : " + concatSpendTime);


        //StringBuffer / StringBuilder storing data as string array. // computing by extending inner array
        StringBuffer buffer = new StringBuffer();
        startTime = System.currentTimeMillis();
        for(int i = 0; i<lasting; i++){
            buffer.append(str);
        }
        concatSpendTime = System.currentTimeMillis()-startTime;
        System.out.println("String concatenation time : " + concatSpendTime);

        //If we know string's final length, declaring it as initial capacity. it's more effective because it doesn't extend the array.
        int bufferSize = str.length()+lasting;
        StringBuffer buffer2 = new StringBuffer(bufferSize);
        startTime = System.currentTimeMillis();
        for(int i = 0; i<lasting; i++){
            buffer.append(str);
        }
        concatSpendTime = System.currentTimeMillis()-startTime;
        System.out.println("String concatenation time : " + concatSpendTime);

    }
}
