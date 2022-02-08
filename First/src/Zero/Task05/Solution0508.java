package Zero.Task05;
import java.util.Arrays;
import java.util.Scanner;

/*Удаляем одинаковые строки
        В этой задаче тебе нужно:

        Считать 6 строк и заполнить ими массив strings.
        Удалить повторяющиеся строки из массива strings, заменив их на null (null должны быть не строками "null").*/

public class Solution0508 {
    public static String[] strings;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        strings = new String[6];

        for (int i = 0; i < strings.length; i++) {
            strings[i] = scanner.nextLine();
        }

        for (int i = 0; i < strings.length; i++) {
            String checkString = strings[i];
            for (int j = i + 1; j < strings.length; j++) {
                if ((strings[j] == null) || (checkString == null)) {
                    continue;
                }
                if (checkString.equals(strings[j])) {
                    strings[i] = null;
                    strings[j] = null;
                }
            }
        }
        System.out.println(Arrays.toString(strings));
    }
}
