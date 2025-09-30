package day16.string;

public class StringMethodsDemo {
    public static void main(String[] args) {

        // 1. length() - Get string length
        String str = "Hello World";
        System.out.println("Length: " + str.length()); // 11

        // 2. charAt() - Get character at index
        System.out.println("Char at index 0: " + str.charAt(0)); // H

        // 3. substring() - Extract part of string
        System.out.println("Substring(0,5): " + str.substring(0, 5)); // Hello
        System.out.println("Substring(6): " + str.substring(6)); // World

        // 4. toLowerCase() & toUpperCase()
        System.out.println("Lowercase: " + str.toLowerCase()); // hello world
        System.out.println("Uppercase: " + str.toUpperCase()); // HELLO WORLD

        // 5. trim() - Remove leading/trailing whitespace
        String messy = "  spaces  ";
        System.out.println("Trimmed: '" + messy.trim() + "'"); // 'spaces'

        // 6. replace() - Replace characters
        System.out.println("Replace: " + str.replace("World", "Java")); // Hello Java
        System.out.println("Replace char: " + str.replace('o', '0')); // Hell0 W0rld

        // 7. contains() - Check if string contains substring
        System.out.println("Contains 'World': " + str.contains("World")); // true

        // 8. startsWith() & endsWith()
        System.out.println("Starts with 'Hello': " + str.startsWith("Hello")); // true
        System.out.println("Ends with 'World': " + str.endsWith("World")); // true

        // 9. indexOf() & lastIndexOf() - Find position of substring
        System.out.println("Index of 'o': " + str.indexOf('o')); // 4
        System.out.println("Last index of 'o': " + str.lastIndexOf('o')); // 7

        // 10. equals() & equalsIgnoreCase()
        String str2 = "hello world";
        System.out.println("Equals: " + str.equals(str2)); // false
        System.out.println("Equals ignore case: " + str.equalsIgnoreCase(str2)); // true

        // 11. split() - Split string into array
        String csv = "apple,banana,orange";
        String[] fruits = csv.split(",");
        System.out.println("Split result: " + java.util.Arrays.toString(fruits));

        // 12. join() - Join strings with delimiter
        String joined = String.join(" | ", fruits);
        System.out.println("Joined: " + joined); // apple | banana | orange

        // 13. isEmpty() & isBlank() (Java 11+)
        String empty = "";
        String blank = "   ";
        System.out.println("Is empty: " + empty.isEmpty()); // true
        System.out.println("Is blank: " + blank.isBlank()); // true (Java 11+)

        // 14. concat() - Concatenate strings
        String first = "Hello";
        String last = "World";
        System.out.println("Concat: " + first.concat(" ").concat(last));

        // 15. compareTo() - Compare strings lexicographically
        System.out.println("Compare to: " + "abc".compareTo("abd")); // -1 (negative)

        // 16. valueOf() - Convert other types to string
        int num = 100;
        String numStr = String.valueOf(num);
        System.out.println("Value of: " + numStr + " (type: String)");

        // 17. format() - Format strings
        String formatted = String.format("Name: %s, Age: %d", "John", 25);
        System.out.println("Formatted: " + formatted);

        // 18. matches() - Check if matches regex
        String email = "test@example.com";
        System.out.println("Email matches: " +
                email.matches("^[A-Za-z0-9+_.-]+@(.+)$")); // true

        // 19. replaceAll() & replaceFirst() - Regex replacement
        String text = "cat bat rat";
        System.out.println("Replace all: " + text.replaceAll("at", "ot")); // cot bot rot
        System.out.println("Replace first: " + text.replaceFirst("at", "ot")); // cot bat rat

        // 20. toCharArray() - Convert to char array
        char[] chars = "ABC".toCharArray();
        System.out.println("Char array: " + java.util.Arrays.toString(chars));

        // 21. repeat() - Repeat string (Java 11+)
        System.out.println("Repeat: " + "Ha".repeat(3)); // HaHaHa

        // 22. strip(), stripLeading(), stripTrailing() (Java 11+)
        String unicode = "  \u2000 text \u2000  ";
        System.out.println("Strip: '" + unicode.strip() + "'");

        // 23. intern() - Get canonical representation
        String s1 = new String("hello").intern();
        String s2 = "hello";
        System.out.println("Intern same reference: " + (s1 == s2)); // true
    }
}