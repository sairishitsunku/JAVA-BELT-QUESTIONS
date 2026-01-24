//In a town, there are n people labeled from 1 to n. There is a rumor that one of these people is secretly the town judge.
//If the town judge exists, then: The town judge trusts nobody. Everybody (except for the town judge) trusts the town judge. 
//There is exactly one person that satisfies properties 1 and 2. You are given an array trust where trust[i] = [ai, bi]
//representing that the person labeled ai trusts the person labeled bi. If a trust relationship does not exist in trust array,
//then such a trust relationship does not exist.
import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int m = sc.nextInt();   // number of trust pairs
        int n = sc.nextInt();   // number of people

        int[] score = new int[n + 1];

        for (int i = 0; i < m; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            score[a]--;
            score[b]++;
        }

        for (int i = 1; i <= n; i++) {
            if (score[i] == n - 1) {
                System.out.println(i);
                return;
            }
        }

        System.out.println(-1);
    }
}
