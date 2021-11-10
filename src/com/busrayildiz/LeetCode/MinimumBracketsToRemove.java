package com.busrayildiz.LeetCode;

import java.util.Stack;

public class MinimumBracketsToRemove {
    public static String minRemoveToMakeValid(String s) {
        char[] chars = s.toCharArray();
        Stack stack = new Stack();

        for (int i = 0; i < chars.length; i++) {
            if(chars[i] == '('){
                stack.push(i);
            }
            else if(chars[i] == ')' && !stack.empty()){
                stack.pop();
            }
            else if(chars[i] == ')'){
                chars[i]= '!';
            }
        }
        while (!stack.empty()){
            chars[(int) stack.pop()] = '!';
        }
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<chars.length;i++){
            if(chars[i]!='!')
                sb.append(chars[i]);
        }
        return sb.toString();
    }
}
