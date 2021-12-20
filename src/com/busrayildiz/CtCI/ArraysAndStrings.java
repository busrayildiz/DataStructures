package com.busrayildiz.CtCI;

public class ArraysAndStrings {

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
        System.out.println("isUnique(\"abcda\") = " + isUnique("abcd"));
    }
}
