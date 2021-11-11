package com.busrayildiz;

public class Recursion {

    public static int recursiveFactorial(int num) {

        if (num == 0) {
            return 1;
        }

        return num * recursiveFactorial(num - 1);
    }


    //space = O(1)
    public static int tailRecursiveFactorial(int x , int totalSoFar) {

        totalSoFar = 1;

       if(x == 0)
           return totalSoFar;
       else
           return tailRecursiveFactorial(x-1 , totalSoFar * x);
    }
}
