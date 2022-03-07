package syntax.task05;

// Реализуй метод main(String[]), который выводит массивы strings и ints в консоли с помощью метода Arrays.toString().

import java.util.Arrays;

public class Solution0513 {
    public static String[] strings = new String[]{"I", "love", "Java"};
    public static int[] ints = new int[]{1, 2, 3, 4, 5, 6, 7, 8};

    public static void main(String[] args) {
        System.out.println(Arrays.toString(strings));
        System.out.println(Arrays.toString(ints));
    }
}
