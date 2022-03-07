package com.bridgelabz.linkedlistDay14;

public class UC9 {
	public Node head;
    public Node tail;
    static class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    }

    // Adding new Node with values
    public void add(int datas){
        Node newNode = new Node(datas);
        if(head == null){
            head = newNode;
            tail = newNode;
        }
        else {
            tail.next = newNode;
            tail = newNode;
        }
    }

    // Display the allNodes with value
    public void display() {
        Node current = head;
        if(head == null) {
            System.out.println("List is empty");
        }
        while (current != null) {
            System.out.println(current.data +" ");
            current = current.next;
        }
    }

    // Delete the Node With value
    public void delete(int key){
        Node prev = null;
        Node current = head;

        while (current != null) {
            if (current.data == key) {
                if (current == head) {
                    head = head.next;
                    current = head;
                } else {
                    prev.next = current.next;
                    current = current.next;
                }
            } else {
                prev = current;
                current = current.next;
            }
        }
    }

    public static void main(String[] args) {
        UC9 uc9 = new UC9();
        uc9.add(56);
        uc9.add(30);
        uc9.add(40);
        uc9.add(70);
        uc9.delete(40);
        uc9.display();

    }

}
