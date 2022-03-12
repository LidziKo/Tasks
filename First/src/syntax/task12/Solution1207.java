package syntax.task12;

/* 
Requirements:
1. Если первое число больше второго, то метод isLess(int, int) должен возвращать false.
2. Если первое число меньше второго, то метод isLess(int, int) должен возвращать true.
*/

public class Solution1207 {
    public static void main(String[] args) {
        int first = 2;
        int second = 1;

        Boolean isLess = isLess(first, second);

        if (isLess) {
            System.out.println("Первое число меньше второго");
        } else {
            System.out.println("Первое число больше или равно второму числу");
        }
    }

    public static Boolean isLess(int first, int second) {
        return first < second;
    }
}
