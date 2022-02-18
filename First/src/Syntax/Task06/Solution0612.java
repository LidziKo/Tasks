package Syntax.Task06;

/*Метод printSqrt(int[] array) должен выводить корень квадратный для каждого элемента переданного массива.
        Но этого не происходит из-за конфликта имен переменных. Исправь имена переменных так, чтобы код компилировался.
        В результате работы программа должна выводить в консоли соответствующую строку для каждого элемента массива.*/

public class Solution0612 {
    public static void main(String[] args) {
        int[] array = {15, 64, 9, 51, 42};
        printSqrt(array);
    }

    public static void printSqrt(int[] array) {
        String elementSqrt = "Корень квадратный для числа ";
        for (int i = 0; i < array.length; i++) {
            int element = array[i];
            double sqrtThis = Math.sqrt(element);
            System.out.println(elementSqrt + element + " равен " + sqrtThis);
        }
    }
}

