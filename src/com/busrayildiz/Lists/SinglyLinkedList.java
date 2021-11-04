package com.busrayildiz.Lists;

public class SinglyLinkedList<T>{

    private Node<T> head = null;
    private Node<T> tail = null;
    private int size = 0;

    public SinglyLinkedList() {
    }

    public int size() {
        return size;
    }

    public boolean isEmpty(){
        return size == 0;
    }

    public T first(){
        if(isEmpty()){
            return null;
        }
        return head.getElement();
    }


    public T last(){
        if(isEmpty()){
            return null;
        }
        return tail.getElement();
    }

    public void addFirst(T e){
        head = new Node<> (e, head);

        if(size==0){
            tail = head;
        }
        size++;
    }


    public void addLast(T e){
        Node<T> newNode = new Node<> (e, null);

        if(isEmpty()){
            head = newNode;
        }
        else{
            tail.setNext(newNode);
        }
        size++;
    }

    public T removeFirst(){
        if(isEmpty()){
            return null;
        }

        T t = head.getElement();
        head = head.getNext();
        size--;

        if(size==0){
            tail = null;
        }
        return t;
    }

    public void reverseList(){

    }

    @Override
    public String toString() {
        return "SinglyLinkedList{" +
                "head=" + head +
                ", tail=" + tail +
                ", size=" + size +
                '}';
    }
}
