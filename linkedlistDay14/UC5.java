package com.bridgelabz.linkedlistDay14;

public class UC5 {
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
            newNode.next = head;
            head = newNode;
        }
    }

    // Display the Node with value
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

    // Deleting the FirstNode with Value
    public void pop(){
        Node current = head;
        if(current == head){
            head = head.next;
            current = head;
        }
    }

    public static void main(String[] args) {
        UC5 list = new UC5();

        list.add(70);
        list.add(30);
        list.add(56);
        list.display();
        list.pop();
        list.display();
    }

}
