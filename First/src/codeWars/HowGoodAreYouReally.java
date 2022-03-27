package codeWars;

import java.util.Arrays;

/*
There was a test in your class and you passed it. Congratulations!
        But you're an ambitious person. You want to know if you're better than the average student in your class.

        You receive an array with your peers' test scores. Now calculate the average and compare your score!
*/

public class HowGoodAreYouReally {
    public static void main(String[] args) {
        int[] classPoints = new int[]{100, 40, 34, 57, 29, 72, 57, 88};
        int myScore = 100;

        System.out.println(betterThanAverage(classPoints, myScore));
    }

    public static boolean betterThanAverage(int[] classPoints, int yourPoints) {
        int count = classPoints.length;
        int sum = 0;

        for (int grade : classPoints) {
            sum += grade;
        }
        System.out.println();

        return (sum / count) < yourPoints;
    }
}
