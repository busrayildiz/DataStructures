package com.busrayildiz;


import java.util.*;

import static com.busrayildiz.SearchAlgorithms.BinarySearch.iterativeBinarySearch;

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

 int [] array = {20 ,35, -15, 7, 55, 1 , -22};

        int [] sortedarray = new int[array.length];
        Arrays.sort(array);
        for(int i = 0 ; i < array.length; i++ ) {
           sortedarray[i] = i;
        }

 System.out.println(iterativeBinarySearch(sortedarray,1));


    }
}
