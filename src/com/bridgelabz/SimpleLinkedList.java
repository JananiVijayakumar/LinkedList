package com.bridgelabz;

/**
 * Author : jananiVijayakumar
 * Date : 01/11/2021
 * Desc : to create a linked list by adding 30, 56 and 70
 */

public class SimpleLinkedList {
    public static class Node {
        private int data;
        private Node next;
        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public int size;
    //initialize head and tail
    private Node head = null;
    private Node tail = null;

    //Create a new node to add the data in list and Checks if the list is empty
    public void createNode(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
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
            System.out.println(temp.data + " ");
            temp = temp.next;
        }
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
            this.head = node;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = node;
        }
    }

    public static void main(String[] args) {
        SimpleLinkedList sl = new SimpleLinkedList();
        //Add nodes to the list
        sl.addNodeAtEnd(70);
        sl.addNodeAtBeginning(30);
        sl.addNodeAtBeginning(56);
        sl.display();
    }
}
