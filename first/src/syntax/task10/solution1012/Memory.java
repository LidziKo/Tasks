package syntax.task10.solution1012;

import java.util.Arrays;

/* 
Дефрагментация памяти
*/

public class Memory {

    public static void main(String[] args) {
        String[] memory = {"object15", null, null, "object2", null, null, null, "object32", null, "object4"};
        executeDefragmentation(memory);
        System.out.println(Arrays.toString(memory));
    }

    public static void executeDefragmentation(String[] array) {
        String[] tempArray = new String[array.length];
        int j = 0;

        for (String s : array) {
            if (s != null) {
                tempArray[j] = s;
                j++;
            }
        }

        // System.arraycopy(tempArray, 0, array, 0, tempArray.length);
        for (int i = 0; i < tempArray.length; i++) {
            array[i] = tempArray[i];
        }
    }
}
