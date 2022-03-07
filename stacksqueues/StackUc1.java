package com.bridgelabz.stacksqueues;

public class StackUc1 {
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

    // Pushing new datas
    public void push(int datas){
        Node newNode = new Node(datas);
        if(head == null){
            head = newNode;
            tail = newNode;
        }
        else {
            newNode.next = head;
            head = newNode;
        }
    }

    // Display all Node With Value
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

    public static void main(String[] args) {
        StackUc1 operStack = new StackUc1();
        operStack.push(70);
        operStack.push(30);
        operStack.push(56);

        operStack.display();
    }

}
