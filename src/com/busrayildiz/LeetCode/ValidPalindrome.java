package com.busrayildiz.LeetCode;

public class ValidPalindrome {

    public boolean isPalindrome(String s) {

        s = s.replaceAll("[^a-zA-Z0-9]", "").trim().toLowerCase();

        int l = 0;
        int r = s.length();

        for (int i = 0; i < s.length() / 2; i++) {
            if (s.charAt(l) == s.charAt(r)) {
                l++;
                r--;
            } else
                return false;
        }
        return true;
    }

    public String reverse(String s) {
        String str = "";

        for (int i = s.length() - 1; i >= 0; --i) {
            str += s.charAt(i);
        }
        return str;
    }

    public boolean isPalindromeOptimal(String s) {

        s = s.replaceAll("[^a-zA-Z0-9]", "").trim().toLowerCase();

        int l = 0;
        int r = s.length() - 1;

        for (int i = 0; i < s.length() / 2; i++) {
            if (s.charAt(l) == s.charAt(r)) {
                l++;
                r--;
            } else
                return false;
        }
        return true;
    }
}
