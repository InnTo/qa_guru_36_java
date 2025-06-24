public class Main{

    public static void main(String[] args){
        int a = 10;
        int b = 3;

        int sum = a + b;
        int diff = a - b;
        int prod = a * b;
        int div = a / b;      // целочисленное деление
        int mod = a % b;      // остаток от деления

        System.out.println("Sum: " + sum);           // 13
        System.out.println("Diff: " + diff);   // 7
        System.out.println("Prod: " + prod);      // 30
        System.out.println("Div: " + div);      // 3
        System.out.println("Mod: " + mod);

        int c = 5;
        double d = 2.5;


        double result = c * d + (c - d) / 2;

        System.out.println("Result: " + result);

        int x = 10;
        int y = 20;

        boolean less = x < y;        // true
        boolean greater = x > y;     // false
        boolean greaterOrEqual = x >= 10; // true
        boolean lessOrEqual = y <= 20;    // true

        System.out.println("x < y: " + less);
        System.out.println("x > y: " + greater);
        System.out.println("x >= 10: " + greaterOrEqual);
        System.out.println("y <= 20: " + lessOrEqual);

        int max = Integer.MAX_VALUE;
        System.out.println("Integer.MAX_VALUE: " + max);

        int overflow = max + 1; // переполнение
        System.out.println("Integer.MAX_VALUE + 1: " + overflow);

        int min = Integer.MIN_VALUE;
        System.out.println("Integer.MIN_VALUE: " + min);

        int underflow = min - 1;
        System.out.println("Integer.MIN_VALUE - 1: " + underflow);
    }

}
