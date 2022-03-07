package syntax.task05;

/*Таблица умножения
        Проинициализируй массив MULTIPLICATION_TABLE значением new int[10][10], заполни его таблицей умножения и выведи в консоли в следующем виде:
        Числа в строке разделены пробелом.*/

public class Solution0509 {
    public static int[][] MULTIPLICATION_TABLE;

    public static void main(String[] args) {
        MULTIPLICATION_TABLE = new int[10][10];

        for (int i = 1; i <= 10; i++) {
            int count = 1;
            for (int j = count; j <= 10; j++) {
                MULTIPLICATION_TABLE[j - 1][i - 1] = j * i;
                int tmp = MULTIPLICATION_TABLE[j - 1][i - 1];
                System.out.print(tmp + " ");
            }
            System.out.println();

        }
    }
}
