package syntax.task12;

import java.util.ArrayList;

/* 
Requirements:
1. Поле numbers должно быть типа ArrayList<Integer>.
2. Метод init() должен заполнять список numbers числами от 0 до 9.
3. Метод reverse() должен переставить значения списка numbers в обратном порядке.
*/

public class Solution1210 {
    public static ArrayList<Integer> numbers = new ArrayList<>();

    public static void main(String[] args) {
        init();
        print();

        reverse();
        print();
    }

    public static void init() {
        for (int i = 0; i < 10; i++) {
            numbers.add(i);
        }
    }

    public static void reverse() {
        int n = numbers.size() - 1;
        for (int i = 0; i < numbers.size() / 2; i++) {
            int temp = numbers.get(i);
            numbers.set(i, numbers.get(n));
            numbers.set(n, temp);
            n--;
        }
    }

    private static void print() {
        for (int number : numbers) {
            System.out.print(number);
        }
    }
}
