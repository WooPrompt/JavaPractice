package day16.object;

public class MyDateTest {
    public static void main(String[] args) {
        MyDate d1 = new MyDate(2025, 9, 30);
        MyDate d2 = new MyDate(2025, 9, 30);

        System.out.println(d1 == d2); // Checks if both references point to the same object -> false
        System.out.println(d1); // Uses toString(). Without override: className@hashcode(hex)
        System.out.println(d1.toString()); // MyDate overrides toString(), so it prints meaningful info.
        System.out.println(d2.toString()); // Same result as d1, since values are equal.
        System.out.println(d1.equals(d2)); // true, because equals() compares values, not memory addresses.
        // Rule: equals() true ⇒ hashCode() must be the same.
        // But: same hashCode() doesn’t always mean equals() true (possible collision).

        //actual memory address
        System.out.println(System.identityHashCode(d1));
        System.out.println(System.identityHashCode(d2));
    }
}
