package Linked List;

import java.util.*;
class Node {
        int num;
        Node next;
        Node(int a) {
            num = a;
            next = null;
        }
}

public class deletenode {
    static Node insertNode(Node head,int val) {
        Node newNode = new Node(val);
        if(head == null) {
            head = newNode;
            return head;
        }
        Node temp = head;
        while(temp.next != null) temp = temp.next;
        temp.next = newNode;
        return head;
    }
    //function to get reference of the node to delete
    static Node getNode(Node head,int val) {
        if(head==null)
        return null;
        while(head.num != val) head = head.next;
        
        return head;
    }
    //delete function as per the question
    static void deleteNode(Node t) {
        if(t==null)
        return;
        t.num = t.next.num;
        t.next = t.next.next;
        return;
    }
    //printing the list function
    static void printList(Node head) {
        if(head==null)
        return;
        while(head.next!=null ) {
            System.out.print(head.num+"->");
            head = head.next;
        }
        System.out.println(head.num);
    }
}
