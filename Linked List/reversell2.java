package Linked List;

public class reversell2 {
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
    
    static int lengthOfLinkedList(Node head) {
        int length = 0;
        while(head != null) {
            ++length;
            head = head.next;
        }
        return length;
    }
  
    static Node reverseKNodes(Node head,int k) {
        if(head == null||head.next == null) return head;
        
        int length = lengthOfLinkedList(head);
        
        Node dummyHead = new Node(0);
        dummyHead.next = head;
        
        Node pre = dummyHead;
        Node cur;
        Node nex;
        
        while(length >= k) {
            cur = pre.next;
            nex = cur.next;
            for(int i=1;i<k;i++) {
                cur.next = nex.next;
                nex.next = pre.next;
                pre.next = nex;
                nex = cur.next;
            }
            pre = cur;
            length -= k;
        }
        return dummyHead.next;
    }
    
    static void printLinkedList(Node head) {
        while(head.next != null) {
            System.out.print(head.num+"->");
            head = head.next;
        }
        System.out.println(head.num);
    }
}
