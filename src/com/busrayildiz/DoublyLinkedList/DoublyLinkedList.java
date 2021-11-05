package com.busrayildiz.DoublyLinkedList;

import com.busrayildiz.SinglyLinkedList.LinkedList;

public class DoublyLinkedList {

    Node head;

    public static class Node{
        int data;
        Node prev;
        Node next;

        public Node(int data) {
            this.data = data;
        }
    }

    public DoublyLinkedList() {}

    public DoublyLinkedList(Node head) {
        this.head = head;
    }

    public void append (int data){
        Node node = new Node(data);

        if(head==null){
            head=node;
            return;
        }
        else{
            Node current = head;
            while(current.next!=null){
                current = current.next;
            }
            current.next=node;
            node.prev=current;
        }
    }

    public void prepend(int data){
        Node node = new Node(data);
        if(head == null)
            head = node;
        else{
            node.next = head;
            head.prev =node;
            head = node;
        }
    }

    public void deleteWithValue(int data){
        if (head == null)
            return;
        if(head.data == data){
            head = head.next;
            return;
        }

        Node current = head;
        while(current.next != null){
            if(current.next.data == data){
                current.next = current.next.next;
                current.next.next.prev = current;
                return;
            }
            current = current.next;
        }

    }

    public void printList() {
        Node n = head;
        while (n != null) {
            System.out.print(n.data + " ");
            n = n.next;
        }
    }
}
