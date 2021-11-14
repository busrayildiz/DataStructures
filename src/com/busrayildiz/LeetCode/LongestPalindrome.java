package com.busrayildiz.LeetCode;

import java.util.Locale;

public class LongestPalindrome {

    public static boolean isPalindrome(String s){
        s=s.trim();
        return reverse(s).equals(s);
    }

    public static String reverse(String s)
    {
        String str = "";
        for (int i = s.length() - 1; i >= 0; --i)
            str += s.charAt(i);

        return str;
    }

    public static String longestPalindrome(String s){
        for (int i = 0; i < s.length(); i++) {
            s=s.toLowerCase();
            char currentChar = s.charAt(i);
            for (int j = s.length(); j > 0 ; j--) {
                if(currentChar == s.charAt(j)){
                    String newStr = s.substring(currentChar,j+1);
                    if(isPalindrome(newStr))
                        return newStr;
                }

            }

        }
        return null;
    }
}
