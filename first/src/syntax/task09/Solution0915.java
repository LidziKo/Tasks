package syntax.task09;

/*StringTokenizer
        Используя StringTokenizer раздели query на части по разделителю delimiter.*/

import java.util.Arrays;
import java.util.StringTokenizer;

public class Solution0915 {
    public static void main(String[] args) {
        String packagePath = "java.util.stream";
        String[] tokens = getTokens(packagePath, "\\.");
        System.out.println(Arrays.toString(tokens));
    }

    public static String[] getTokens(String query, String delimiter) {
        StringTokenizer tokenizer = new StringTokenizer(query, delimiter);
        String[] temp = new String[tokenizer.countTokens()];

        for (int i = 0; i < temp.length; i++) {
            temp[i] = tokenizer.nextToken();
        }

        return temp;
    }
}
