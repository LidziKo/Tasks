package syntax.task12;

/* 
Requirements:
1. Метод countDigits(String) должен возвращать количество цифр в переданной строке.
2. Метод countLetters(String) должен возвращать количество букв в переданной строке.
3. Метод countSpaces(String) должен возвращать количество пробелов в переданной строке.
*/

public class Solution1206 {
    public static void main(String[] args) {
        String string = "Думаю, это будет новой фичей." +
                "Только не говорите никому, что она возникла случайно.";

        System.out.println("Количество цифр в строке : " + countDigits(string));
        System.out.println("Количество букв в строке : " + countLetters(string));
        System.out.println("Количество пробелов в строке : " + countSpaces(string));
    }

    public static int countDigits(String string) {
        int i = 0;

        for (int j = 0; j < string.length(); j++) {
            if (Character.isDigit(string.charAt(j))) {
                i++;
            }
        }
        return i;
    }

    public static int countLetters(String string) {
        int i = 0;

        for (int j = 0; j < string.length(); j++) {
            if (Character.isLetter(string.charAt(j))) {
                i++;
            }
        }
        return i;
    }

    public static int countSpaces(String string) {
        int i = 0;

        for (int j = 0; j < string.length(); j++) {
            if (Character.isSpaceChar(string.charAt(j)) && Character.isWhitespace(string.charAt(j))) {
                i++;
            }
        }
        return i;
    }
}

