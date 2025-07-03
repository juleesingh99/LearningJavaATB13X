package test19THJune;

public class Test19_03 {

    public static void main(String[] args) {
        // PART 1: Comparison and Logical Operators
        int a = 10;
        int b = 20;

        System.out.println("== Comparison and Logical Operators Demo ==\n");

        // Comparison Operators
        System.out.println("a == b: " + (a == b)); // false
        System.out.println("a != b: " + (a != b)); // true
        System.out.println("a < b: " + (a < b));   // true
        System.out.println("a > b: " + (a > b));   // false
        System.out.println("a <= b: " + (a <= b)); // true
        System.out.println("a >= b: " + (a >= b)); // false

        // Logical Operators
        boolean x = true;
        boolean y = false;

        System.out.println("\nx && y: " + (x && y)); // false
        System.out.println("x || y: " + (x || y));   // true
        System.out.println("!x: " + (!x));           // false
        System.out.println("!y: " + (!y));           // true

        // Combined logic
        System.out.println("\n(a < b) && (x == true): " + ((a < b) && (x == true))); // true

        // PART 2: Increment and Decrement Operators
        System.out.println("\n== Increment and Decrement Demo ==\n");

        int i = 5;
        System.out.println("Initial i = " + i);

        System.out.println("Post-increment (i++): " + (i++)); // prints 5, then i becomes 6
        System.out.println("After post-increment, i = " + i); // 6

        System.out.println("Pre-increment (++i): " + (++i));  // i becomes 7, then prints 7

        System.out.println("Post-decrement (i--): " + (i--)); // prints 7, then i becomes 6
        System.out.println("After post-decrement, i = " + i); // 6

        System.out.println("Pre-decrement (--i): " + (--i));  // i becomes 5, then prints 5
    }

}
