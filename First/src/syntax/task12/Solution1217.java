package syntax.task12;

/* 
Requirements:
1. Замени типы переменных c var на конкретный тип объекта.
2. Почини геттер и сеттер для поля intArray.
*/

public class Solution1217 {
    private int[] intArray = new int[4];

    public int[] getIntArray() {
        return intArray;
    }

    public void setIntArray(int[] intArray) {
        this.intArray = intArray;
    }

    public static void main(String[] args) {
        //Solution solution = new Solution();
        String string = new String("Hello");
        StringBuilder stringBuilder = new StringBuilder();
    }
}
