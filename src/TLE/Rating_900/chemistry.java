package TLE.Rating_900;

import java.util.*;

public class chemistry {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            String s = sc.next();

            int[] freq = new int[26];
            for (char c : s.toCharArray()) {
                freq[c - 'a']++;
            }

            int odd = 0;
            for (int i = 0; i < 26; i++) {
                if (freq[i] % 2 != 0) {
                    odd++;
                }
            }

            int remainingLength = n - k;
            int allowedOdd = remainingLength % 2;

            if (odd <= k + allowedOdd) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
        sc.close();
    }
}