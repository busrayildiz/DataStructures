package com.busrayildiz.HackerrankQuestions;

public class CountingValleys {
    public static int countingValleys(int steps, String path) {
        // Write your code here

        int altitude = 0;
        int num_valleys = 0;

        for (int i = 0; i < steps; i++) {
            if (path.charAt(i) == 'U') {
                if (altitude == -1) {
                    num_valleys++;
                }
                altitude++;
                System.out.print("/");
            }
            if (path.charAt(i) == 'D') {
                altitude--;
                System.out.print("\\");

            }

        }
        return num_valleys;
    }
}
