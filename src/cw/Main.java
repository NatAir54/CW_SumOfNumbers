package cw;

import java.util.Arrays;

/* Given two integers a and b, which can be positive or negative,
 * find the sum of all the integers between and including them and return it.
 * If the two numbers are equal return a or b.
 * Note: a and b are not ordered!
 */

public class Main {
    public static void main(String[] args) {
        System.out.println((getSum(0, -1)));
        System.out.println(getSum(0, 1));
        System.out.println(getSum(-5, 1));
        System.out.println(getSum(5, -1));
        System.out.println(getSum(5, 5));
    }

    public static int getSum(int a, int b) {
        if (a == b) {
            return a;
        }
        int[] arr = {a, b};
        Arrays.sort(arr);
        int sum = 0;
        for (int i = arr[0]; i <= arr[arr.length - 1]; i++) {
            sum += i;
        }
        return sum;
    }
}
