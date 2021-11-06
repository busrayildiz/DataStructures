package com.busrayildiz.HackerrankQuestions;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

public class TwoDimArr {

    /*
     * Complete the 'hourglassSum' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts 2D_INTEGER_ARRAY arr as parameter.
     */

    public static int hourglassSum(List<List<Integer>> arr) {
        // Write your code here

        Integer[][] array = new Integer[arr.size()][];

        array = arr.stream()
                .map(l -> l.stream().toArray(Integer[]::new))
                .toArray(Integer[][]::new);



        int max_hourglass_sum=Integer.MIN_VALUE;

        for(int i=0; i<4; i++){
            for(int j=0; j<4; j++){
                int current_hourglass_sum = array[i][j] + array[i][j+1]
                        + array[i][j+2] + array[i+1][j+1] + array[i+2][j]
                        +array[i+2][j+1]+array[i+2][j+2];
                max_hourglass_sum = Math.max(max_hourglass_sum, current_hourglass_sum);
            }
        }
        return max_hourglass_sum;
    }

}


