package syntax.task03;

/*Используя цикл while вывести на экран сто раз цитату (переменная quote):
        «Я никогда не буду работать за копейки»

        Каждое значение вывести с новой строки.*/

public class Solution0301 {
    public static void main(String[] args) {
        String quote = "Я никогда не буду работать за копейки";
        int i = 0;
        while (i < 100) {
            System.out.println(quote);
            i++;
        }
    }
}
