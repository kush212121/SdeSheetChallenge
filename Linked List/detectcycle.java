package Linked List;

public class detectcycle {
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
    
    //utility function to create cycle
    static void createCycle(Node head,int a,int b) {
        int cnta = 0,cntb = 0;
        Node p1 = head;
        Node p2 = head;
        while(cnta != a || cntb != b) {
            if(cnta != a) 
            {p1 = p1.next; ++cnta;}
            if(cntb != b) 
            {p2 = p2.next; ++cntb;}
        }
        p2.next = p1;
    }
    
    //utility function to detect cycle
    static boolean cycleDetect(Node head) {
        if(head == null) return false;
        Node fast = head;
        Node slow = head;
            
        while(fast.next != null && fast.next.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if(fast == slow) return true;
        }
        return false;
    }
}
