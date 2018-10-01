package com.example.android.java;

public class SinglyLinkedList {

    private Node head;

    public boolean isEmpty(){
        return (head==null);
    }
    public  void insertFirst(int data){
        Node newNode = new Node();
        newNode.data = data;
        newNode.next= head;
        head = newNode;

    }
    public Node deleteFirst(){
        Node temp = head;
        head = head.next;
        return temp;
    }
    public  void printLinkedList(){
        System.out.println("Printing Linked List");
        Node current = head;
        while (current!=null){
            current.displayNodeData();
            current= current.next;
        }
    }
    public static void main(String[] args) {
        SinglyLinkedList myLinkedList = new SinglyLinkedList();
        myLinkedList.insertFirst(5);
        myLinkedList.insertFirst(6);
        myLinkedList.insertFirst(7);
        myLinkedList.insertFirst(1);
       // myLinkedList.insertLast(2);
        Node node = new Node();
        node.data =1;
        myLinkedList.deleteFirst();
        myLinkedList.printLinkedList();
    }
}
class Node{
    public int data;
    public Node next;

    public void displayNodeData(){
        System.out.println(data);
    }
}