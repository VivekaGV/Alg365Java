public class Operators{

    // Arithmetic Operators
    public static void arithmeticOperators(int a, int b) {
        System.out.println("Arithmetic Operators:");
        System.out.println("a + b = " + (a + b));
        System.out.println("a - b = " + (a - b));
        System.out.println("a * b = " + (a * b));
        System.out.println("a / b = " + (a / b));
        System.out.println("a % b = " + (a % b));
        System.out.println();
    }

    // Relational Operators
    public static void relationalOperators(int a, int b) {
        System.out.println("Relational Operators:");
        System.out.println("a == b : " + (a == b));
        System.out.println("a != b : " + (a != b));
        System.out.println("a > b  : " + (a > b));
        System.out.println("a < b  : " + (a < b));
        System.out.println("a >= b : " + (a >= b));
        System.out.println("a <= b : " + (a <= b));
        System.out.println();
    }

    // Logical Operators
  public static void logicalOperators() {
    System.out.println("Logical Operators:");
    System.out.println("true && false : " + (true && false));
    System.out.println("true || false : " + (true || false));
    System.out.println("!true         : " + (!true));
    System.out.println("!false        : " + (!false));
    System.out.println();
}

    // Bitwise Operators
    public static void bitwiseOperators(int a, int b) {
        System.out.println("Bitwise Operators:");
        System.out.println("a & b  = " + (a & b));
        System.out.println("a | b  = " + (a | b));
        System.out.println("a ^ b  = " + (a ^ b));
        System.out.println("~a     = " + (~a));
        System.out.println("a << 1 = " + (a << 1));
        System.out.println("a >> 1 = " + (a >> 1));
        System.out.println("a >>> 1= " + (a >>> 1));
        System.out.println();
    }

    // Assignment Operators
    public static void assignmentOperators(int a, int b) {
        System.out.println("Assignment Operators:");
        int x = a;
        System.out.println("x = a  -> " + x);
        x += b;
        System.out.println("x += b -> " + x);
        x -= b;
        System.out.println("x -= b -> " + x);
        x *= b;
        System.out.println("x *= b -> " + x);
        x /= b;
        System.out.println("x /= b -> " + x);
        x %= b;
        System.out.println("x %= b -> " + x);
        System.out.println();
    }

    // Unary Operators
    public static void unaryOperators(int a) {
        System.out.println("Unary Operators:");
        System.out.println("a   = " + a);
        System.out.println("++a = " + (++a));
        System.out.println("--a = " + (--a));
        System.out.println("a++ = " + (a++));
        System.out.println("a-- = " + (a--));
        System.out.println("+a  = " + (+a));
        System.out.println("-a  = " + (-a));
        System.out.println();
    }

    // Ternary Operator
    public static void ternaryOperator(int a, int b) {
        System.out.println("Ternary Operator:");
        int max = (a > b) ? a : b;
        System.out.println("Max of a and b = " + max);
        System.out.println();
    }

    public static void main(String[] args) {
        int a = 10, b = 5;

        arithmeticOperators(a, b);
        relationalOperators(a, b);
        logicalOperators();
        bitwiseOperators(a, b);
        assignmentOperators(a, b);
        unaryOperators(a);
        ternaryOperator(a, b);
    }
}

