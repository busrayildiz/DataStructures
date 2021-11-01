package com.busrayildiz;

import com.busrayildiz.LinkedList.LinkedList;

public class Main {

    public static void main(String[] args) {

        LinkedList l = new LinkedList();
        l.insert(18);
        l.insert(45);
        l.insert(12);

        l.insertFirst(50);
        l.insertAt(2,55);
        l.deleteAt(1);

        l.print();

    }
}
