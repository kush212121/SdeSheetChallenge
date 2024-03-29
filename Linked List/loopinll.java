package Linked List;

public class loopinll {
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
    
    static void createCycle(Node head,int pos) {
        Node ptr = head;
        Node temp = head;
        int cnt = 0;
        while(temp.next != null) {
            if(cnt != pos) {
                ++cnt;
                ptr = ptr.next;
            } 
            temp = temp.next;
        }
        temp.next = ptr;
    }
    //process as per mentioned in solution
    static Node detectCycle(Node head) {
        if(head == null||head.next == null) return null;
            
        Node fast = head;
        Node slow = head;
        Node entry = head;
            
        while(fast.next != null&&fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
                
            if(slow == fast) {
                while(slow != entry) {
                    slow = slow.next;
                    entry = entry.next;
                }
                return slow;
            }
        }
        return null;
    }
    
}
