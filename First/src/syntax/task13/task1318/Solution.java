package syntax.task13.task1318;

/* 
Следующий месяц, пожалуйста
*/

public class Solution {

    public static void main(String[] args) {
        System.out.println(getNextMonth(Month.DECEMBER));
        System.out.println(getNextMonth(Month.JULY));
    }

    public static Month getNextMonth(Month month) {
        int i = month.ordinal();
        Month[] temp = Month.values();
        if (i < 11) {
            return temp[i + 1];
        } else {
            return temp[0];
        }
    }
}
