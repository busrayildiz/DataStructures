package com.busrayildiz.LeetCode;

import java.util.Stack;

/***
 * Given two strings s and t, return true if they are equal when both are typed into empty text editors.
 * '#' means a backspace character.
 *
 * Note that after backspacing an empty text, the text will continue empty.
 * ***/

public class BackspaceStringCompare {
    public boolean backspaceCompare(String s, String t) {
        if(build(s).length()!=build(t).length())
            return false;
        return build(s).equals(build(t));

    }

    public String build(String s){
        Stack<Character> result = new Stack<>();
        for(char c : s.toCharArray()){
            if(c != '#'){
                result.push(c);
            }
            else if(!result.empty()){
                result.pop();
            }
        }
        return String.valueOf(result);
    }


        public boolean optimalBackspaceCompare(String S, String T) {
            int i = S.length() - 1, j = T.length() - 1;
            int skipS = 0, skipT = 0;

            while (i >= 0 || j >= 0) { // While there may be chars in build(S) or build (T)
                while (i >= 0) { // Find position of next possible char in build(S)
                    if (S.charAt(i) == '#') {skipS++; i--;}
                    else if (skipS > 0) {skipS--; i--;}
                    else break;
                }
                while (j >= 0) { // Find position of next possible char in build(T)
                    if (T.charAt(j) == '#') {skipT++; j--;}
                    else if (skipT > 0) {skipT--; j--;}
                    else break;
                }
                // If two actual characters are different
                if (i >= 0 && j >= 0 && S.charAt(i) != T.charAt(j))
                    return false;
                // If expecting to compare char vs nothing
                if ((i >= 0) != (j >= 0))
                    return false;
                i--; j--;
            }
            return true;
        }

}
