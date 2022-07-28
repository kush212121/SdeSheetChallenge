package Linked List;

public class intersection {
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
    
    static Node intersectionPresent(Node head1,Node head2) {
        Node d1 = head1;
        Node d2 = head2;
        
        while(d1 != d2) {
            d1 = d1 == null? head2:d1.next;
            d2 = d2 == null? head1:d2.next;
        }
        
        return d1;
    }
    
   
    static void printList(Node head) {
        while(head.next != null) {
        System.out.print(head.num+"->");
            head = head.next;
        }
        System.out.println(head.num);
    }
    
}
