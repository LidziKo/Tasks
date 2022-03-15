package syntax.task13;

import java.util.Arrays;
import java.util.HashSet;

/* 
Requirements:
1. В классе Solution должен быть public static HashSet<String> arrayToHashSet(String[]) метод.
2. Метод arrayToHashSet(String[]) должен быть реализован согласно условию.
*/

public class Solution1301 {
    public static void main(String[] args) {
        String[] array = {"Через", "три", "года", "я", "буду", "Senior", "Java", "Developer"};
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
        System.out.println("___________________________________");

        HashSet<String> hashSet = arrayToHashSet(array);
        for (String s : hashSet) {
            System.out.println(s);
        }
    }

    public static HashSet<String> arrayToHashSet(String[] strings) {

        return new HashSet<>(Arrays.asList(strings));
    }
}
