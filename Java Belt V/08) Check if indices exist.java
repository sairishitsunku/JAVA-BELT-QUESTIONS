//Given an array 'arr' of sorted integers and another non-negative integer k, write a program to find if 
//there exist 2 indices i and j such that arr[i] - arr[j] = k and i != j. Return 0 or 1
import java.util.Scanner;

class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int k = sc.nextInt();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i != j && arr[i] - arr[j] == k) {
                    System.out.println(1);
                    return;
                }
            }
        }

        System.out.println(0);
    }
}
