package com.busrayildiz.CtCI;

import java.util.ArrayList;
import java.util.EmptyStackException;

public class StackOfPlates {
    ArrayList<Stack> stacks = new ArrayList<Stack>();
    public int capacity;
    public StackOfPlates(int capacity){
        this.capacity=capacity;
    }

    public Stack getLastStack(){
        if(stacks.size()==0) return null;
        return stacks.get(stacks.size()-1);
    }

    public void push(int v){
        Stack last = getLastStack();
        if(last != null && !last.isFull()){
            last.push(v);
        }else{
            Stack stack = new Stack(capacity);
            stack.push(v);
            stacks.add(stack);
        }
    }
    public int pop(){
        Stack last = getLastStack();
        if(last == null) throw new EmptyStackException();
        int v = last.pop();
        if(last.size==0) stacks.remove(stacks.size()-1);
        return v;
    }

    public boolean isEmpty(){
        Stack last = getLastStack();
        return last == null || last.isEmpty();
    }

    public int popAt(int index){
        return leftShift(index,true);
    }

    public int leftShift(int index, boolean removeTop){
        Stack stack = stacks.get(index);
        int removedItem;
        if(removeTop) removedItem = stack.pop();
        else removedItem = stack.removeBottom();
        if(stack.isEmpty()){
            stack.remove(index);
        }
        else if (stack.size > index+1){
            int v = leftShift(index+1,false);
            stack.push(v);
        }
        return removedItem;
    }
}

class Stack{
    private int capacity;
    public Nodee top, bottom;
    public int size = 0;

    public Stack(int capacity) {this.capacity = capacity;}
    public boolean isFull() {return capacity == size;}
    public boolean isEmpty() {return size == 0;}

    public void join(Nodee above, Nodee below){
        if(below != null) below.above = above;
        if(above != null) above.below = below;
    }

    public boolean push(int v){
        if(size >= capacity) return false;
        size++;
        Nodee n = new Nodee(v);
        if ( size == 1) bottom = n;
        join(n, top);
        top = n;
        return true;
    }

    public int pop(){
        Nodee t = top;
        top = top.below;
        size--;
        return t.value;
    }

    public int removeBottom(){
        Nodee b = bottom;
        bottom = bottom.above;
        if(bottom!=null) bottom.below = null;
        size--;
        return b.value;
    }

    public void remove(int index) {
    }
}

 class Nodee {
    public Nodee above,below;
    public int value;
    public Nodee(int value){
        this.value = value;
    }
}