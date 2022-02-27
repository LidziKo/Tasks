package Syntax.Task07;

/*Расставь операторы приведения типов в выражениях таким образом, чтобы код компилировался.*/

public class Solution0709 {
    long a = 109 + 15;
    int b = (int) a * 2;
    short c = (short) (a / b);
    byte d = (byte) (a + b - c);
}
