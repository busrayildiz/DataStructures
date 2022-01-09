package com.busrayildiz.Stack;

import java.util.EmptyStackException;
import java.util.Stack;

public class SortStack {



    public static Stack<Integer> sort(Stack<Integer> s ){
        Stack<Integer> r = new Stack();

        while(!s.isEmpty()){
            int temp = s.pop();
            while(!r.isEmpty() && r.peek() > temp){
                s.push(r.pop());
            }
            r.push(temp);
        }

        while(!r.isEmpty()){
            s.push(r.pop());
        }
        return s;

    }


    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6,7,8};

        for (int i = 0; i < nums.length; i++) {

        }

    }

}
