package Syntax.Task06;

/*Калькулятором, который умеет возводить число в третью степень, никого не удивишь.
        Калькулятор, который может возвести число в девятую степень — другое дело! Так давай реализуем его!
        Для этого создай метод public static long ninthDegree(long).
        В качестве аргумента он должен принимать целочисленное значение типа long.
        Метод должен возводить полученное значение в девятую степень и возвращать его как результат работы метода.*/

public class Solution0609 {
    public static void main(String[] args) {
    }

    public static long cube(long a) {
        return a * a * a;
    }

    public static long ninthDegree(long b) {
        return cube(cube(b));
    }

}
