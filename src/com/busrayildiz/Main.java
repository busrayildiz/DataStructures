package com.busrayildiz;

import com.busrayildiz.DoublyLinkedList.DoublyLinkedList;
import com.busrayildiz.LinkedList.LinkedList;
import com.busrayildiz.LinkedList.Node;
import com.busrayildiz.Lists.SinglyLinkedList;
import com.busrayildiz.Stack.Stack;
import com.busrayildiz.Stack.StackAsLinkedList;

import java.util.ArrayList;
import java.util.List;

import static com.busrayildiz.SortAlgorithms.RadixSort.radixSort;


public class Main {

    public static void main(String[] args) {

/*
        final Node node = new Node(1, 2, 3, 4);
        final Node reversed = node.reverseList();
        System.out.println(reversed);

 */
/*
        var list = new DoublyLinkedList<Integer>();

        for (int i = 0; i < 10; ++i)
            list.addItemTail(i);

        list.addItemTail(2);
        list.walk(System.out::println);

 */
/*
        Stack s = new Stack();
        s.push(10);
        s.push(20);
        s.push(30);
        s.pop();
        System.out.println("Top element is :" + s.peek());
        s.print();

    }

        int[] intArray = {4725, 4586, 1330, 8792, 1594, 5729};


        for (int i = 0; i < intArray.length; i++) {
            System.out.print(intArray[i] + ",");
        }
        System.out.println();
        radixSort(intArray);
*/

        StackAsLinkedList sll = new StackAsLinkedList();
        sll.push(12);
        sll.push(23);
        sll.push(34);
        sll.push(45);





        System.out.println("Top element is " + sll.peek());






    }
}
