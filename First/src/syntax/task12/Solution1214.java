package syntax.task12;

import java.util.ArrayList;
import java.util.Arrays;

/* 
Requirements:
1. В методе main должен удаляться Pascal из списка programmingLanguages.
*/

public class Solution1214 {
    public static ArrayList<String> programmingLanguages = new ArrayList<>(Arrays.asList("C", "C++", "Python", "JavaScript", "Ruby", "Java", "Pascal"));

    public static void main(String[] args) {
        programmingLanguages.remove("Pascal");

    }
}
