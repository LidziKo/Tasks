package codeWars;

/*Given an array of integers your solution should find the smallest integer.*/

public class SmallestIntegerFinder {
    public static void main(String[] args) {
        int[] array = new int[] {1, -233, -45, 34, 0, 19};
        System.out.println(findSmallestInt(array));
    }
    public static int findSmallestInt(int[] args) {
        int min = args[0];

        for (int i = 0; i < args.length; i++) {
            if (args[i] < min) {
                min = args[i];
            }
        }
        return min;
    }
}
