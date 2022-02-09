package Syntax.Task04;

/*Используя вложенные циклы while (цикл в цикле)
    выведи на экран прямоугольник размером 5 (высота) на 10 (ширина), заполненный буквой 'Q'.*/

public class Solution0403 {
    public static void main(String[] args) {
        int wight = 1;

        while (wight <= 5) {
            int length = 1;
            while (length <= 10) {
                System.out.print("Q");
                length++;
            }
            wight++;
            System.out.println();
        }
    }
}
