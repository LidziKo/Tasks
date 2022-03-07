package codeWars;

/*Complete the solution so that it reverses the string passed into it.*/

public class ReverseString {
    public static String solution(String str) {
        char[] reverse = str.toCharArray();
        String result = "";

        for (int i = reverse.length - 1; i >= 0 ; i--) {
            result += reverse[i];
        }
        return result;
    }
}
