package com.busrayildiz.Challenges;


import java.util.LinkedList;
import java.util.Locale;


public class Palindrome {

    public static boolean checkForPalindrome(String string){

        LinkedList<Character> stack = new LinkedList<Character>();
        LinkedList<Character> queue = new LinkedList<Character>();

        String lowerCase = string.toLowerCase();

        for (int i = 0; i < lowerCase.length(); i++) {
            char c  = lowerCase.charAt(i);
            if(c>='a' && c<='z'){
                queue.addLast(c);
                stack.push(c);
            }
        }

       while(!stack.isEmpty()){
           if(!stack.pop().equals(queue.removeFirst())){
               return false;
           }
       }
        return true;
    }
}
