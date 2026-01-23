// Develop a program that determines whether a given string can be transformed into a palindrome by rotating it.
import java.util.Scanner;

class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String t = s + s;
        int n = s.length();

        for (int i = 0; i < n; i++) {
            boolean ok = true;
            int l = i, r = i + n - 1;

            while (l < r) {
                if (t.charAt(l) != t.charAt(r)) {
                    ok = false;
                    break;
                }
                l++;
                r--;
            }

            if (ok) {
                System.out.println("Yes");
                return;
            }
        }

        System.out.println("No");
    }
}
