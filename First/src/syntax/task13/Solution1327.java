package syntax.task13;

import java.util.Arrays;
import java.util.PriorityQueue;

public class Solution1327 {

    public static PriorityQueue<Character> queue = new PriorityQueue<>();

    public static void main(String[] args) {
        queue.addAll(Arrays.asList('Я', 'М', 'Ч', 'Р', 'Ж', 'Ц', 'В', 'С', 'А', 'Ф', 'Н', 'З', 'Б', 'Ш', 'К', 'О', 'У', 'Г', 'П', 'И', 'Е', 'Т', 'Х', 'Л'));

        while (queue.size() > 0) {
            System.out.println(queue.poll());
        }
    }
}
