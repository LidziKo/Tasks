package syntax.task12;

/* 
Метод деления
*/

public class Solution1205 {

    public static void main(String[] args) {
        divide(1, 0);
        divide(-1, 0);
        divide(0, 0);
        divide(100, 20);
        divide(200, 20);
    }

    public static void divide(double a, double b) {
        double posInfinity = Double.POSITIVE_INFINITY;
        double negInfinity = Double.NEGATIVE_INFINITY;
        double nan = Double.NaN;

        if (a == posInfinity) {
            if (b >= 0 && (b != posInfinity)) {
                System.out.println(posInfinity);
            }
            if ((b < 0) && (b != negInfinity)) {
                System.out.println(negInfinity);
            }
            if ((b == posInfinity) || (b == negInfinity)) {
                System.out.println(nan);
            }
        } else if (a == negInfinity) {
            if ((b < 0) && (b != negInfinity)) {
                System.out.println(posInfinity);
            }
            if ((b >= 0) && (b != posInfinity)) {
                System.out.println(negInfinity);
            }
            if (b == negInfinity || b == posInfinity) {
                System.out.println(nan);
            }
        } else if (a > 0 && b == 0) {
            System.out.println(posInfinity);
        } else if (a < 0 && b == 0) {
            System.out.println(negInfinity);
        } else if (a == 0 && b == 0) {
            System.out.println(nan);
        } else if (a == nan || b == nan) {
            System.out.println(nan);
        } else {
            System.out.println(a / b);
        }
    }
}
