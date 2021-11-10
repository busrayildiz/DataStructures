package com.busrayildiz.LeetCode;

/***
 * Complexity Analysis
 *
 * Time complexity : O(2n) = O(n)O(2n)=O(n). In the worst case each character will be visited twice by ii and jj.
 *
 * Space complexity : O(min(m, n))O(min(m,n)). Same as the previous approach.
 * We need O(k)O(k) space for the sliding window, where kk is the size of the Set.
 * The size of the Set is upper bounded by the size of the string nn and the size of the charset/alphabet mm.***/

public  class LongestSubstring {
    public static int lengthOfLongestSubstring(String s) {
        int[] chars = new int[128];

        int left = 0;
        int right = 0;

        int res = 0;
        while (right < s.length()) {
            char r = s.charAt(right);
            chars[r]++;

            while (chars[r] > 1) {
                char l = s.charAt(left);
                chars[l]--;
                left++;
            }

            res = Math.max(res, right - left + 1);

            right++;
        }
        return res;
    }
}
