package com.busrayildiz.HackerrankQuestions;

import java.io.*;
import java.util.*;
import java.util.stream.*;

import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'rotLeft' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts following parameters:
     *  1. INTEGER_ARRAY a
     *  2. INTEGER d
     *
     *
     * Sample Input
       5 4
       1 2 3 4 5

        Sample Output
       5 1 2 3 4
     */

    public static List<Integer> rotLeft(List<Integer> a, int d) {
        d %= a.size();
        if (d < 0) d += a.size();
        List<Integer> newPrefix = a.subList(d, a.size());
        List<Integer> newPostfix = a.subList(0, d);
        List<Integer> result = new ArrayList<>(a.size());
        result.addAll(newPrefix);
        result.addAll(newPostfix);
        return result;
    }


}

public class ArrayLeftRotation {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int n = Integer.parseInt(firstMultipleInput[0]);

        int d = Integer.parseInt(firstMultipleInput[1]);

        List<Integer> a = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        List<Integer> result = Result.rotLeft(a, d);

        bufferedWriter.write(
                result.stream()
                        .map(Object::toString)
                        .collect(joining(" "))
                        + "\n"
        );

        bufferedReader.close();
        bufferedWriter.close();
    }
}

