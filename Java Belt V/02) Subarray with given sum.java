// Write a program that takes an array of integers and a target sum k as input,
// and finds the starting and ending indices of a contiguous subarray whose
// elements sum up to k. If such a subarray exists, print its starting and
// ending indices. If no such subarray exists, print "No subarray found".
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] array = new int[n];

        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }

        int k = sc.nextInt();

        for (int start = 0; start < n; start++) {
            int sum = 0;
            for (int end = start; end < n; end++) {
                sum += array[end];

                if (sum == k) {
                    System.out.println(start + " " + end);
                    return;
                }
            }
        }

        System.out.println("No subarray found");
    }
}
