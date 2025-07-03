package test19THJune;

public class Test19_04 {
    public static void main(String[] args) {
        // PART 1: Operator Precedence
        System.out.println("== Operator Precedence Demo ==\n");

        int a = 10, b = 5, c = 2;
        int result1 = a + b * c;
        // Multiplication has higher precedence than addition
        // So, result = 10 + (5 * 2) = 10 + 10 = 20
        System.out.println("a + b * c = " + result1 + " (Multiplication before addition)");

        int result2 = (a + b) * c;
        // Parentheses alter precedence: (10 + 5) * 2 = 15 * 2 = 30
        System.out.println("(a + b) * c = " + result2 + " (Parentheses override default precedence)");

        int result3 = a + b - c * a / b;
        // Follows precedence: *, / > +, -
        // = 10 + 5 - (2*10)/5 = 10 + 5 - 20/5 = 10 + 5 - 4 = 11
        System.out.println("a + b - c * a / b = " + result3);

        // PART 2: Type Casting
        System.out.println("\n== Type Casting Demo ==\n");

        // Implicit casting (Widening)
        int intVal = 100;
        double doubleVal = intVal; // int to double is implicit
        System.out.println("Implicit casting (int to double): " + doubleVal);

        // Explicit casting (Narrowing)
        double originalDouble = 123.456;
        int castedInt = (int) originalDouble; // Loses decimal part
        System.out.println("Explicit casting (double to int): " + castedInt + " (Decimal part lost)");

        // Mixed type expression with casting
        int x = 7;
        int y = 2;
        double result = (double)x / y; // Casting to get accurate division
        System.out.println("Casting in expression: (double)x / y = " + result);

        // Without casting
        System.out.println("Without casting: x / y = " + (x / y) + " (Integer division)");
    }



    }

