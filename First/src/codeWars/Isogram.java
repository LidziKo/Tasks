package codeWars;

/*
An isogram is a word that has no repeating letters, consecutive or non-consecutive. Implement a function that
        determines whether a string that contains only letters is an isogram. Assume the empty string is an isogram.
        Ignore letter case.
*/

import java.util.Arrays;
import java.util.Locale;

public class Isogram {
    public static void main(String[] args) {
        System.out.println(isIsogram("Dermatoglyphics"));
        System.out.println(isIsogram("isogram"));
        System.out.println(isIsogram("moose"));
        System.out.println(isIsogram("isIsogram"));
        System.out.println(isIsogram("moOse"));
        System.out.println(isIsogram("thumbscrewjapingly"));
        System.out.println(isIsogram(""));

    }

    public static boolean isIsogram(String str) {
        char[] temp = str.toLowerCase().toCharArray();

        for (int i = 0; i < temp.length - 1; i++) {
            for (int j = i + 1; j < temp.length; j++) {
                if (temp[i] == temp[j]) {
                    return false;
                }
            }
        }
        return true;
    }
}
