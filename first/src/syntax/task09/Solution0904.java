package syntax.task09;

/*В классе Solution объявлены четыре публичных символьных поля.
        Им присвоены некоторые значения. Но программа не компилируется. Нужно это исправить, не меняя значения символов.*/

public class Solution0904 {
    public static char first = '\u004A';
    public static char second = 'a';
    public static char third = '\u0076';
    public static char fourth = 'a';

    public static void main(String[] args) {
        System.out.print(first);
        System.out.print(second);
        System.out.print(third);
        System.out.print(fourth);
    }
}
