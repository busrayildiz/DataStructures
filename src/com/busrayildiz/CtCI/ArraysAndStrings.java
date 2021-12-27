package com.busrayildiz.CtCI;

import java.sql.Array;
import java.util.Arrays;
import java.util.Locale;

public class ArraysAndStrings {

    public static String sort(String str){
        char[] s = str.toCharArray();
        Arrays.sort(s);
        return new String(s);
    }
/*
    public static boolean checkPermutation(String s1, String s2){
        if(s1.length() != s2.length()){
            return false;
        }
        return sort(s1).equals(sort(s2));
    }
*/

    static boolean permutation (String s1, String s2){
        if(s1.length() != s2.length()) return false;

        int[] letters = new int[128];
        for (int i = 0; i < s1.length(); i++) {
            letters[s1.charAt(i)]++;
        }

        for (int i = 0; i < s2.length(); i++) {
            letters[s2.charAt(i)]--;

            if(letters[s2.charAt(i)] < 0){
                return false;
            }
        }
        return true;
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

    public static String URLify(String str){
        char [] charArr = str.toCharArray();

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < charArr.length; i++) {
            if(charArr[i] == ' '){
                sb.append("%20");
            }
            else{
                sb.append(charArr[i]);
            }

        }
        return sb.toString();
    }

    public static boolean canPermutePalindrome(String s) {

        s=s.toLowerCase().trim();
        int[] charCounts = new int[128];

        for(int i=0; i<s.length(); i++){
            charCounts[s.charAt(i)]++;
        }

        int count=0;
        for(int i=0; i<128; i++){
            count += charCounts[i] % 2;
        }

        return count<=1;
    }


        public boolean isOneEditDistance(String s, String t) {

            if(Math.abs(s.length()-t.length())>1)
                return false;

            if(s.length()-1 == t.length()){

                return remove(s,t);
            }
            else if(s.length()+1 == t.length()){
                return insert(t,s);
            }
            else if(s.length() == t.length()){
                return replace(s,t);
            }
            return false;
        }

        public boolean replace(String s, String t){
            int count = 0;
            for(int i=0; i<s.length(); i++){
                if(s.charAt(i) != t.charAt(i)){
                    count++;
                }
            }
            return count==1;
        }

        public boolean insert(String s, String t){
            return remove(t,s);
        }

        public boolean remove( String s, String t){
            int indexS = 0;
            int indexT = 0;
            while(indexT < t.length() && indexS < s.length()){
                if(s.charAt(indexS) != t.charAt(indexT)){
                    indexS++;
                }
                else{
                    indexS++;
                    indexT++;
                }

            }
            return true;
        }


        public static int compression(String s){

        StringBuilder sb = new StringBuilder();
        int count = 1;
            for (int i = 0; i < s.length()-1; i++) {
                if(s.charAt(i) == s.charAt(i+1)){
                    count++;
                }
                else {
                    sb.append(s.charAt(i));
                    sb.append(count);
                    count = 1;
                }

            }
            sb.append(s.charAt(s.length()-1));
            sb.append(count);
        return sb.length();
        }


    public static void main(String[] args) {
        //System.out.println("isUnique(\"abcda\") = " + isUnique("abcd"));
       // System.out.println(checkPermutation("abla", "bal"));
       //  System.out.println(permutation("abla", "bala"));
       // System.out.println("URLify(\"Mr John Smith\") = " + URLify("Mr John Smith"));
       // System.out.println("reverseStr(\"busra\") = " + reverseStr("busra"));
       // System.out.println("canPermutePalindrome(\"Tact coa\") = " + canPermutePalindrome("Tact coa"));

        System.out.println("compression(\"aabcccccaaa\") = " + compression("aabcccccaaa"));
    }
}
