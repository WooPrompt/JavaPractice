package day16.string;

public class StringTest {

    public static void main(String[] args) {
        String str1 = new String("abc");
        String str2 = new String("abc");
        System.out.println(str2 == str1);//false
        System.out.println(str1.equals(str2));//true

// equals() method in String:
// public boolean equals(Object anObject) {
//     if (this == anObject) { // checks if references are the same
//         return true;
//     }
//     return (anObject instanceof String aString) // if the object is a String
//             && (!COMPACT_STRINGS || this.coder == aString.coder)
//             && StringLatin1.equals(value, aString.value); // compares the contents
// }

        System.out.println(str2 == str1); // false: compares memory addresses (two different objects)
        System.out.println(str1.equals(str2)); // true: compares values, both are "abc"


// String pool
        String str3 = "abc"; // Java checks if "abc" already exists in the string pool.
        String str4 = "abc";

        System.out.println(str3 == str4); // true: both point to the same pooled string
        System.out.println(str3.equals(str4)); // true: contents are the same

// String formatting with formatted()
        String studentInfo = "%s is \n%d grade \nscore is %.1f.".formatted("Alex", 2, 3.5);
        System.out.println(studentInfo);

// Text Block (Java 15+)
        String studentInfo2 = """
                %s is 
                %d grade 
                score is %.1f.""".formatted("Alex", 2, 3.5);
        System.out.println(studentInfo2);

//concat method
        String hello = "hello";
        String world = "world";
        String message = hello.concat(world);
        System.out.println(message);

//        System.identityHashCode()
        System.out.println(System.identityHashCode(hello));
        System.out.println(System.identityHashCode(world));
        //you can check the memory address is different . it creates new String object every time. so, it is waste of memory. String object is immutable, but StringBuffer and Builder are mutable.
        System.out.println(System.identityHashCode(message));
    }
}
