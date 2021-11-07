package com.bridgelabz;

/**
 * Author : jananiVijayakumar
 * Date : 01/11/2021
 * Desc : to create a linked list by adding 30, 56 and 70
 */

public class SimpleLinkedList {
    private static Node head;
    private static Node tail;

    public static class Node {
        private int data;
        private Node next;
        private Node prev;
        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public int size;
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
        size++;
    }

    //display all the nodes
    public void display() {
        Node temp = head;
        if (head == null) {
            System.out.println("Linked List is Empty");
            return;
        }
        System.out.println("Simple Linked List :");
        while (temp != null) {
            System.out.println(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("NULL");
    }

    //Add nodes at the Beginning of the list
    public void addNodeAtBeginning(int data) {
        Node node = new Node(data);
        if (head == null) {
            this.head = node;
        } else {
            node.next = head;
            head = node;
        }
    }

    //Add nodes at the end of the list
    public void addNodeAtEnd(int data) {
        Node node = new Node(data);
        if (head == null) {
            this.head = new Node(data);
            this.head = node;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = node;
        }
    }

    public void addNodeATMiddle(int data){
        //Create a new node
        Node newNode = new Node(data);
        //Checks if the list is empty
        if(head == null) {
            //If list is empty, both head and tail would point to new node
            head = newNode;
        }
        else {
            newNode = new Node(data);
            Node temp = head;
            int size = 0;
            while (temp != null){
                size++;
                temp = temp.next;
            }
            //Store the mid position of the list
            int count = ((size % 2) == 0) ? (size/2) : ((size+1)/2);
            //Node temp will point to head
            temp = head;
            while (count--> 1)
                temp = temp.next;
                newNode.next = temp.next;
            temp.next = newNode;
            //new node will point to temp
        }
        size++;
    }

    public void deleteNode(int key){
        Node node = head;
        Node temp = null;
        if (node != null && node.data == key){
            head = node.next;
            return;
        }
        while(node != null && node.data != key){
            temp = node;
            node = node.next;
        }
        if (node == null){
            return;
        }
        temp.next = node.next;
    }
    public static void main(String[] args) {
        SimpleLinkedList sl = new SimpleLinkedList();
        //Add nodes to the list
        sl.addNodeAtBeginning(70);
        sl.addNodeAtBeginning(40);
        sl.addNodeAtBeginning(30);
        sl.addNodeAtBeginning(56);
        sl.deleteNode(40);
        sl.display();
    }
}
