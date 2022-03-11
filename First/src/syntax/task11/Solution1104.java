package syntax.task11;

/*
Requirements:
        1. В методе main должен вызываться метод parseDouble класса Double.
        2. В методе main должен вызываться метод round класса Math.
*/

public class Solution1104 {
    public static void main(String[] args) {
        String string = "12.84";
        double convertDouble = Double.parseDouble(string);
        System.out.println(Math.round(convertDouble));
    }
}
