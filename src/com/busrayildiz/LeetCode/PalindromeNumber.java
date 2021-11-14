package com.busrayildiz.LeetCode;

public class PalindromeNumber {
    public boolean isPalindrome(int x) {
        return getReverse(Math.abs(x)) == x;
    }


    public int getReverse(int val)
    {
        int result = 0;

        while (val != 0) {
            result = result * 10 + val % 10;
            val /= 10;
        }

        return result;
    }
}
