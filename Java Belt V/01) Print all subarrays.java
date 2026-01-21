// Write a program that takes an array of integers as input and prints all its subarrays,
// ensuring that they are printed by maintaining the original order of the array.
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }

        for (int start = 0; start < n; start++) {
            for (int end = start; end < n; end++) {
                for (int k = start; k <= end; k++) {
                    System.out.print(array[k] + " ");
                }
                System.out.println();
            }
        }
    }
}
