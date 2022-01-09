package com.busrayildiz.CtCI;


class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next;
    }

    public int getVal() {
        return val;
    }

    public void setVal(int val) {
        this.val = val;
    }

    public ListNode getNext() {
        return next;
    }

    public void setNext(ListNode next) {
        this.next = next;
    }

    public ListNode getHead() {
        return head;
    }

    public void setHead(ListNode head) {
        this.head = head;
    }

    ListNode head = null;
    public void append(int data) {

        if (head == null) {
            head = new ListNode(data);
            return;
        }

        ListNode current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = new ListNode(data);
    }

    public void prepend(int data){
        ListNode newHead = new ListNode(data);
        newHead.next = head;
        head = newHead;
    }
}



public class SumLists {
    ListNode addLists(ListNode l1, ListNode l2) {
        return addLists(l1, l2, 0);
    }

    ListNode addLists(ListNode l1, ListNode l2, int carry) {
        if (l1 == null && l2 == null && carry == 0) {
            return null;
        }

        ListNode result = new ListNode();
        int value = carry;
        if (l1 != null) {
            value += l1.val;
        }
        if (l2 != null) {
            value += l2.val;
        }

        result.val = value % 10;

        if (l1 != null || l2 != null) {
            ListNode more = addLists(l1 == null ? null : l1.next,
                    l2 == null ? null : l2.next,
                    value >= 10 ? 1 : 0);
            result.setNext(more);
        }
        return result.head;
    }



    public static void main(String[] args) {
        SumLists s = new SumLists();
        ListNode l1 = new ListNode(2);
        l1.prepend(9);

        ListNode l2 = new ListNode(3);
        l2.prepend(2);
        System.out.println("s.addLists(l1,l2) = " + s.addLists(l1, l2).getHead());
    }
}


