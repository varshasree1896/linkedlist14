package com.blz.generics;

import org.w3c.dom.*;

public class LinkedlistMain {

    public static void main(String[] args) {
        LinkedlistMain List = new LinkedlistMain();

        //Add nodes to the list
        List.addNode(56);
        List.addNode(30);
        List.addNode(70);

        //Displays the nodes present in the list
        List.display();
    }

    //Represent the head and tail of the singly linked list
    public Node head = null;
    public Node tail = null;

    //addNode() will add a new node to the list
    public void addNode(int data) {



        //Checks if the list is empty
        if (head == null) {
            //If list is empty, both head and tail will point to new node
            head = new node();
            tail = new node();
        } else {
            //newNode will be added after tail such that tail's next will point to newNode
            tail.next = new node;
            //newNode will become new tail of the list
            tail = new node;
        }
    }

    //display() will display all the nodes present in the list
    public void display() {
        //Node current will point to head
        Node current = head;

        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        System.out.println("Nodes of singly linked list: ");
        while (current != null) {
            //Prints each node by incrementing pointer
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
}


