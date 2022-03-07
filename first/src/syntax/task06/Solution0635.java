package syntax.task06;

/*Давай напишем программу идентификации псевдо QR-кодов. В программе дан двумерный массив expectedArray размером 3*3.
        В этом массиве хранится псевдо QR-код. Тебе в помощь реализовано рандомное заполнение этого массива —
        при желании можешь заполнить его самостоятельно, это на тесты не влияет.
        Тебе необходимо написать код для заполнения массива actualArray значениями с клавиатуры
        (считываем по одному символу, пустая клетка — пробел, закрашенная — #).
        Далее, используя правильный метод класса Arrays, необходимо сравнить этот массив с массивом expectedArray и вывести на экран результат сравнения:
        true, если массивы одинаковы и false, если они разные.*/

import java.io.IOException;
import java.util.*;

public class Solution0635 {
    public static String[][] expectedArray = new String[3][3];
    public static String[][] actualArray = new String[3][3];

    static {
        Random random = new Random();
        for (int i = 0; i < expectedArray.length; i++) {
            for (int j = 0; j < expectedArray[0].length; j++) {
                OptionalInt optionalInt = random.ints(0, 2).findFirst();
                expectedArray[i][j] = optionalInt.isPresent() && optionalInt.getAsInt() == 1 ? " " : "#";
            }
        }
    }

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < actualArray.length; i++) {
            for (int j = 0; j < actualArray[0].length; j++) {
                String val = scanner.nextLine();
                if (val.equals("")) {
                    actualArray[i][j] = " ";
                } else {
                    actualArray[i][j] = "#";
                }
            }
        }

        if (Arrays.deepEquals(actualArray, expectedArray)) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }

}



