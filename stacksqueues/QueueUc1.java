package com.bridgelabz.stacksqueues;

public class QueueUc1 {
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

    // Append datas One By One
    public void append(int datas){
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

    // Display all the Node with value
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
        QueueUc1 operQueue = new QueueUc1();
        operQueue.append(70);
        operQueue.append(30);
        operQueue.append(56);

        operQueue.display();
    }

}
