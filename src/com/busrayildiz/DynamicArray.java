package com.busrayildiz;

import java.net.StandardSocketOptions;

public class DynamicArray {

    private int arr[];
    private int capacity;
    private int current;

    public DynamicArray() {
        this.arr = new int[1];
        this.capacity = 1;
        this.current = 0;
    }

    public void push(int data){
        if(current == capacity){
            int temp[] = new int[2 * capacity];

            for( int i=0 ; i < capacity ; i++)
                temp[i] = arr[i];

            capacity *= 2;
            arr = temp;
        }

        arr[current] = data;
        current++;
    }

    void push(int data, int index){
        if(index == capacity)
            push(data);
        else
            arr[index] = data;

    }

    // to extract an element at any index
    int get(int index){
        if(index < current)
            return arr[index];

        return -1;
    }

    void pop(){
        current--;
    }

    int size(){
        return current;
    }

    int getCapacity(){
        return capacity;
    }

    void print(){
        for (int i=0 ; i<current ; i++){
            System.out.println(arr[i] + " ");
        }
        System.out.println();
    }

}
