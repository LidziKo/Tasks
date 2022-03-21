package com.javarush.task.pro.task13.task1327;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Solution {

    public static PriorityQueue<Character> queue = new PriorityQueue<>();

    public static void main(String[] args) {
        queue.addAll(Arrays.asList('М', 'Ч', 'Р', 'Ж', 'Ц', 'В', 'С', 'А', 'Ф', 'Н', 'З', 'Б', 'Ш', 'К', 'О', 'У', 'Г', 'П', 'И', 'Е', 'Т', 'Х', 'Л'));

        while (queue.size() > 0) {
            System.out.println(queue.poll());
        }
    }
}
