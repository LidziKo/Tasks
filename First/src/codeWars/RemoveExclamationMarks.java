package codeWars;

// Write function RemoveExclamationMarks which removes all exclamation marks from a given string.

public class RemoveExclamationMarks {
    public static void main(String[] args) {
        String s = "Hello! world!";

        System.out.println(removeExclamationMarks(s));
    }

    static String removeExclamationMarks(String s) {
        return s.replaceAll("!", "");
    }
}
