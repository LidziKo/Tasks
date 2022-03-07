package codeWars;

// Complete the method that takes a boolean value and return a "Yes" string for true, or a "No" string for false.

public class YesOrNo {
    public static void main(String[] args) {
        System.out.println(boolToWord(true));
        System.out.println(boolToWord(false));
    }

    public static String boolToWord(boolean b) {
        // return b ? "Yes" : "No";

        if (b) {
            return "Yes";
        } else {
            return "No";
        }
    }
}
