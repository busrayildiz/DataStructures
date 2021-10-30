package com.busrayildiz;

public class Main {

    public static void main(String[] args) {
        DynamicArray da = new DynamicArray();
        da.push(10);
        da.push(20);
        da.push(30);
        da.push(40);
        da.push(50);

        System.out.println("ArrayList size: " + da.size());
        System.out.println("ArrayList capacity: "  + da.getCapacity());
        System.out.println( "ArrayList elements: ");
        da.print();

        da.push(100, 1);

        System.out.println("\nAfter updating 1st index");

        System.out.println("ArrayList elements: ");
        da.print();
        System.out.println("Element at 1st index: " + da.get(1));

        da.pop();

        System.out.println("\nAfter deleting the" + " last element");

        System.out.println("ArrayList size: " + da.size());
        System.out.println("ArrayList capacity: " + da.getCapacity());

        System.out.println("ArrayList elements: ");
        da.print();
    }
}
