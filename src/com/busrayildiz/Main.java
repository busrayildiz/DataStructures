package com.busrayildiz;

import com.busrayildiz.Lists.SinglyLinkedList;

import java.util.ArrayList;
import java.util.List;


public class Main {

    public static void main(String[] args) {
        SinglyLinkedList<String> list = new SinglyLinkedList<>();

        list.addFirst("a");
        list.addLast("b");
        list.addLast("c");
        list.addLast("ç");
        list.removeFirst();

        System.out.println(list.toString());



    }




}
