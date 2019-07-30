package lt.bit.hw;

/**
 * LT Parašykite paprasto skaičiuotuvo programą. Skaičiuotuvas turi mokėti atlikti aritmetines,
 * logines ir bitines operacijas.
 * EN Write a simple calculator program. The calculator must be capable of performing arithmetic,
 * boolean and bitwise operations.
 */

public class OP_008 {
    public static void main(String[] args) {
        // checkArithmeticOperators();
        // checkBooleanOperators();
        checkBitwiseOperators();
    }

    private static void checkArithmeticOperators() {
        int a = 20;
        int b = 30;
        int c = 35;
        int d = 35;
        System.out.println("a + b = " + (a + b));
        System.out.println("a - b = " + (a - b));
        System.out.println("a * b = " + (a * b));
        System.out.println("b / a = " + (b / a));
        System.out.println("b % a = " + (b % a));
        System.out.println("c % a = " + (c % a));
        System.out.println("a++   = " + (a++));
        System.out.println("b--   = " + (a--));
        System.out.println("d++   = " + (d++));
        System.out.println("++d   = " + (++d));
    }

    private static void checkBooleanOperators() {
        boolean a = true;
        boolean b = false;
        System.out.println("a && b = " + (a && b));
        System.out.println("a || b = " + (a || b));
        System.out.println("!(a && b) = " + !(a && b));
    }

    private static void checkBitwiseOperators() {
        int a = 60;
        int b = 13;
        int c = 0;
        System.out.println(Integer.toBinaryString(a));
        System.out.println(Integer.toBinaryString(b));
        c = a & b;
        System.out.println("a & b = " + c);
        System.out.println(Integer.toBinaryString(c));
        c = a | b;
        System.out.println("a | b = " + c);
        System.out.println(Integer.toBinaryString(c));
        c = a ^ b;
        System.out.println("a ^ b = " + c);
        System.out.println(Integer.toBinaryString(c));
        c = ~a;
        System.out.println("~a = " + c);
        System.out.println(Integer.toBinaryString(c));
        c = a << 2;
        System.out.println("a << 2 = " + c);
        System.out.println(Integer.toBinaryString(c));
        c = a >> 2;
        System.out.println("a >> 2  = " + c);
        System.out.println(Integer.toBinaryString(c));
        c = a >>> 2;
        System.out.println("a >>> 2 = " + c);
        System.out.println(Integer.toBinaryString(c));
    }
}


