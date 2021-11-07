package com.bridgelabz;

/**
 * Author : jananiVijayakumar
 * Date : 01/11/2021
 * Desc : to create a linked list by adding 30, 56 and 70
 */

public class SortedLinkedList {
    private static Node head;
    private static Node tail;
    public static class Node {
        private int data;
        private Node next;
        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    //Create a new node to add the data in list and Checks if the list is empty
    public void createNode(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
        tail = newNode;
    }

    //display all the nodes
    public void display() {
        Node temp = head;
        if (head == null) {
            System.out.println("Linked List is Empty");
            return;
        }
        System.out.println("..........................................");
        while (temp != null) {
            System.out.println(temp.data + "-> ");
            temp = temp.next;
        }
        System.out.println("NULL");
    }
    //display the ordered linked list in Ascending order
    public void ascendingOrder(){
        for (Node i = head; i.next != null; i = i.next){
            for (Node j = head; j.next != null; j = j.next){
                if (j.data > i.next.data){
                    int temp = j.data;
                    j.data = j.next.data;
                    j.next.data = temp;
                }
            }
        }
    }


    public static void main(String[] args) {
        SortedLinkedList sl = new SortedLinkedList();
        //Add nodes to the list
        sl.createNode(56);
        sl.createNode(30);
        sl.createNode(40);
        sl.createNode(70);
        System.out.println("............................................");
        System.out.println("Sorted Linked list :");
        sl.display();
        sl.ascendingOrder();
        System.out.println("............................................");
        System.out.println("Ordered Linked list in Ascending order : ");
        sl.display();
    }
}
