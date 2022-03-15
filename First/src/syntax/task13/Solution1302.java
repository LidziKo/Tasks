package syntax.task13;

import java.util.HashSet;

import static java.util.Arrays.asList;

/* 
Requirements:
1. В классе Solution должно быть публичное статическое поле words типа HashSet<String>.
2. В классе Solution должен быть публичный статический метод checkWords(String) с типом возвращаемого значения void.
3. Метод checkWords(String) должен работать согласно условию.
*/

public class Solution1302 {
    public static HashSet<String> words = new HashSet<>(asList("Если бы меня попросили выбрать язык на замену Java я бы не выбирал".split(" ")));

    public static void checkWords(String word) {
        if (words.contains(word)) {
            System.out.println("Слово " + word + " есть в множестве");
        } else {
            System.out.println("Слова " + word + " нет в множестве");
        }
    }

    public static void main(String[] args) {
        checkWords("JavaScript");
        checkWords("Java");
    }
}
