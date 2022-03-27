package codeWars;

/*
Consider an array/list of sheep where some sheep may be missing from their place.
        We need a function that counts the number of sheep present in the array (true means present).
*/

public class CountingSheep {
    public static void main(String[] args) {
        Boolean[] array1 = {true, true, true, false,
                true, true, true, true,
                true, false, true, false,
                true, false, false, true,
                true, true, true, true,
                false, false, true, true};

        System.out.println(countSheeps(array1));
    }

    public static int countSheeps(Boolean[] arrayOfSheeps) {
        int count = 0;

        for (Boolean sheep : arrayOfSheeps) {
            if (sheep) {
                count++;
            }
        }
        return count;
    }
}
