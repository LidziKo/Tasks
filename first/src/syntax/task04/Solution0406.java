package syntax.task04;

// Вывести на экран сумму чисел от 1 до 100 включительно, не кратных 3. Для этого используй цикл while.

public class Solution0406 {
    public static void main(String[] args) {
        int count = 1;
        int sum = 0;

        while (count <= 100) {
            if (count % 3 == 0) {
                count++;
                continue;
            }
            else {
                sum += count;
            }
            count++;
        }
        System.out.println(sum);
    }
}
