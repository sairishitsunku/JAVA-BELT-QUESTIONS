//Given an array with n objects colored red, white, or blue, sort them in-place 
// so that objects of the same color are adjacent,with the colors in the order red, white, and blue.
//  We will use the integers 0, 1, and 2 to represent the color red, white, and blue, respectively.
import java.util.Scanner;

class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] nums = new int[n];

        int count0 = 0, count1 = 0, count2 = 0;

        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
            if (nums[i] == 0) count0++;
            else if (nums[i] == 1) count1++;
            else count2++;
        }

        int index = 0;

        for (int i = 0; i < count0; i++) nums[index++] = 0;
        for (int i = 0; i < count1; i++) nums[index++] = 1;
        for (int i = 0; i < count2; i++) nums[index++] = 2;

        for (int i = 0; i < n; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}
