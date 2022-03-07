package syntax.task09;

/*Используя StringBuilder в методе reverseString(String), разверни строку, полученную как параметр.*/

public class Solution0918 {
    public static void main(String[] args) {
        String string = "Ходит кот задом наперед";
        System.out.println(string);
        System.out.println(reverseString(string));
    }

    public static String reverseString(String string) {
        StringBuilder stringBuilder = new StringBuilder(string);
        stringBuilder.reverse();
        return stringBuilder.toString();
    }
}
