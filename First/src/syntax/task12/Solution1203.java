package syntax.task12;

/* 
Requirements:
1. Поля класса Solution изменять нельзя.
2. Вывод должен соответствовать условию.
3. Добавь использование метода equals() минимальное количество раз.
*/

public class Solution1203 {
    static Integer first = 1000;
    static Integer second = 1000;
    static int third = 1000;

    public static void main(String[] args) {
        System.out.println(first.equals(second));
        System.out.println(third == second);
        System.out.println(third == first);
    }
}
