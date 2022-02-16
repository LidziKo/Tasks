package Syntax.Task05;

/*В методе main(String[]) тебе нужно заполнить массив strings значениями.
        Если индекс массива чётный — присвоить значение "Чётный" (ноль — цифра чётная), иначе присвоить "Нечётный".
        Вывод текста в консоль в тестировании не участвует.*/

public class Solution0502 {
    public static final String ODD = "Нечётный";
    public static final String EVEN = "Чётный";
    public static String[] strings = new String[5];

    public static void main(String[] args) {
        for (int i = 0; i < strings.length; i++) {
            if (i % 2 == 0) {
                strings[i] = EVEN;
            } else {
                strings[i] = ODD;
            }
        }

        System.out.print("index = 0");
        System.out.println(" value = " + strings[0]);
        System.out.print("index = 1");
        System.out.println(" value = " + strings[1]);
        System.out.print("index = 2");
        System.out.println(" value = " + strings[2]);
        System.out.print("index = 3");
        System.out.println(" value = " + strings[3]);
        System.out.print("index = 4");
        System.out.println(" value = " + strings[4]);
    }
}
