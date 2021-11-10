package com.busrayildiz.LeetCode;

import java.util.Stack;

public class MyQueueWithStack {

    Stack in = new  Stack();
    Stack out = new Stack();

    public MyQueueWithStack() {
    }

    public void push(int x) {
        in.push(x);
    }

    public int pop() {
        if(out.size()==0){
            while(in.size()!=0){
                out.push(in.pop());
            }
        }
        return (int) out.pop();
    }

    public int peek() {
        if(out.size()==0){
            while(in.size()!=0){
                out.push(in.pop());
            }
        }
        return (int) out.get(out.size()-1);
    }

    public boolean empty() {
        return in.isEmpty() && out.isEmpty();
    }
}
