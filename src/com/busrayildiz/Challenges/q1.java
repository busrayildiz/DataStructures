package com.busrayildiz.Challenges;

public class q1 {
    private static int q1(String str) {
        int index = 0;
        int result = 0;
        while (index < str.length()) {
            int p1 = index;
            int p2 = 0;
            while (p1 < str.length() && p2 < str.length() && str.charAt(p1) == str.charAt(p2)) {
                result++;
                p1++;
                p2++;
            }
            index++;
        }
        return result;
    }

    private static int q1Optimal(String str) {
        if (str.length() == 0) return 0;
        int p1 = 0, p2 = 1, increment = 0, result = str.length();
        char first = str.charAt(0);
        while (p2 < str.length()) {
            if (str.charAt(p2) == first) {
                increment++;
            }
            if (str.charAt(p1) == str.charAt(p2)) {
                result += increment;
                p1++;
            }
            p2++;
        }
        return result;
    }
}
