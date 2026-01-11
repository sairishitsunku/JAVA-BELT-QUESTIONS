// Write a program to generate and print the given number pattern.
/* 
1
2 3
4 5 6
7 8 9 10
11 12 13 14 15
*/
import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}
