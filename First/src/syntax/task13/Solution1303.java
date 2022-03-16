package syntax.task13;

import java.util.ArrayList;
import java.util.HashSet;

import static java.util.Arrays.asList;

/* 
Requirements:
1. Сигнатуру и тип возвращаемого значения метода listToSet(ArrayList<String>) не изменяй.
2. Метод listToSet должен преобразовывать полученный список строк (ArrayList<String>) во множество (HashSet<String>).
*/

public class Solution1303 {

    public static void main(String[] args) {
        ArrayList<String> listOfWords = new ArrayList<>(asList(
                "В свет вышла новая серия книг по программированию на Java: \"Java для начинающих\", \"Java для продолжающих\", \"Java для заканчивающих\""
                        .split(" ")));
        System.out.println("Количество слов в списке: " + listOfWords.size());
        HashSet<String> setOfWords = listToSet(listOfWords);
        System.out.println("Количество слов во множестве: " + setOfWords.size());
    }

    public static HashSet<String> listToSet(ArrayList<String> listOfWords) {
        return new HashSet<>(listOfWords);
    }
}