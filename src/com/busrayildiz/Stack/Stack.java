package com.busrayildiz.Stack;

public class Stack {

    //using array
    static final int MAX = 100;
    int top;
    int a[] = new int[MAX];

    boolean isEmpty()
    {
        return (top < 0);
    }

    public boolean push(int x) {
        if (top >= MAX - 1) {
            System.out.println("Stack overflow");
            return false;
        } else {
            a[++top] = x;
            System.out.println(x + " pushed into stack");
            return true;
        }
    }

    public int pop(){
        if(top<0)
            return 0;
        else{
            int x = a[top--];
            System.out.println(x + " popped into stack");
            return x;
        }
    }

    public int peek(){
        if(top<0){
            return 0;
        }
        else{
            int x = a[top];
            return x;
        }
    }

    public void print() {
        for (int i = top; i > 0; i--) {
            System.out.print(" " + a[i]);
        }
    }
}
