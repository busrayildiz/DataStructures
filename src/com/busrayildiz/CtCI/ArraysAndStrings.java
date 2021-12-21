package com.busrayildiz.CtCI;

import java.sql.Array;
import java.util.Arrays;

public class ArraysAndStrings {

    public static String sort(String str){
        char[] s = str.toCharArray();
        Arrays.sort(s);
        return new String(s);
    }

    public static boolean checkPermutation(String s1, String s2){
        if(s1.length() != s2.length()){
            return false;
        }
        return sort(s1).equals(sort(s2));

    }

    public static boolean isUnique(String str){
        if(str.length() > 128)
            return false;

        boolean[] charArr = new boolean[128];

        for (int i = 0; i < str.length() ; i++) {
            int val = str.charAt(i);

            if(charArr[val]){
                return false;
            }
            charArr[val]=true;
        }
        return true;
    }

    public static void main(String[] args) {
        //System.out.println("isUnique(\"abcda\") = " + isUnique("abcd"));
        System.out.println(checkPermutation("abla", "bal"));
    }
}
