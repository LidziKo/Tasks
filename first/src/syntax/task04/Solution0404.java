package syntax.task04;

/*Используя вложенные циклы while (цикл в цикле) выведи на экран незаполненный прямоугольник (его контур)
        размером 10 (высота height) на 20 (ширина width) из букв 'Б'.
        Незаполненная часть состоит из пробелов.*/

public class Solution0404 {
    public static void main(String[] args) {
        int height = 1;

        while (height <= 10) {
            int width = 1;
            while (width <= 20) {
                if ((height == 1) || (height == 10)) {
                    System.out.print("Б");
                    }
                else {
                    if ((width == 1) || (width == 20)) {
                        System.out.print("Б");
                    }
                    else {
                        System.out.print(" ");
                    }
                }
                width++;
            }
            System.out.println();
            height++;

        }

    }
}
