package lessons;

import java.math.BigInteger;
import java.util.Arrays;

public class Cube {
    public static void main(String[] args) {
        int[] array = {2, 1, 3, 4};
        //int[] array = {6, 6, 6, 6};
        //int[] array = {4, 3, 4, 2, 4, 5, 5, 9};
        //int[] array = {7, 6, 6, 4, 9, 2, 6, 2, 4, 7, 4, 9, 8, 6, 8, 3};
        //int[] array = {3, 2, 9, 9, 3, 6, 8, 7, 5, 2, 4, 9, 3, 9, 8, 4, 2, 3, 3, 6};
        //int[] array = {3, 2, 5, 5, 4, 2, 6, 6, 9, 3, 3, 2, 3, 7, 2, 3, 4, 9, 6, 7, 3, 8, 8, 7, 6, 3, 6, 6, 4, 4, 5, 3, 9, 8, 3, 9, 2, 2, 6, 6};
        //int[] array = {4, 3, 8, 2, 6, 7, 9, 3, 6, 3, 7, 5, 4, 5, 5, 4, 6, 8, 9, 4, 9, 3, 3, 6, 3, 5, 9, 9, 7, 8, 8, 6, 9, 6, 6, 7, 3, 4, 2, 6};
        //int[] array = {8, 6, 5, 3, 2, 8, 6, 8, 2, 7, 9, 3, 3, 7, 5, 2, 5, 2, 3, 6, 2, 4, 4, 7, 4, 7, 4, 7, 6, 6, 7, 2, 3, 7, 5, 9, 8, 8, 6, 4};
        //int[] array = {5, 4, 4, 5, 5, 4, 2, 4, 7, 6, 5, 9, 8, 7, 6, 5, 4, 9, 6, 5, 7, 9, 5, 8, 9, 6, 8, 4, 9, 2, 5, 5, 3, 9, 7, 9, 2, 6, 3, 2};
        long start = System.currentTimeMillis();
        System.out.println(Arrays.toString(solve(array)));
        long end = System.currentTimeMillis();
        System.out.println("time: " + (end - start) + "ms");

    }

    public static BigInteger[] solve(int[] arr) {
        BigInteger temp1, temp2, temp3;
        BigInteger left = BigInteger.valueOf(arr[0])
                .multiply(BigInteger.valueOf(arr[2]))
                .add(BigInteger.valueOf(arr[1])
                        .multiply(BigInteger.valueOf(arr[3])));
        System.out.println(left);
        BigInteger right = BigInteger.valueOf(arr[0])
                .multiply(BigInteger.valueOf(arr[3]))
                .subtract(BigInteger.valueOf(arr[2])
                        .multiply(BigInteger.valueOf(arr[1]))).abs();
        System.out.println(right);
        for (int i = 4; i < arr.length; i += 4) {
            temp1 = BigInteger.valueOf(arr[i])
                    .multiply(BigInteger.valueOf(arr[i + 2]))
                    .add(BigInteger.valueOf(arr[i + 1])
                            .multiply(BigInteger.valueOf(arr[i + 3])));
            temp2 = BigInteger.valueOf(arr[i])
                    .multiply(BigInteger.valueOf(arr[i + 3]))
                    .subtract(BigInteger.valueOf(arr[i + 2])
                            .multiply(BigInteger.valueOf(arr[i + 1]))).abs();
            temp3 = left;
            left = left.multiply(temp1)
                    .add(right.multiply(temp2));
            right = (temp3.multiply(temp2).subtract(right.multiply(temp1))).abs();
        }

        return new BigInteger[]{left, right};
    }
}
