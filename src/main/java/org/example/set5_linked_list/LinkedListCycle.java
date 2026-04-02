package org.example.set5_linked_list;
class ListNode1 {
    int val;
    ListNode1 next;
    ListNode1(int x) {
        val = x;
        next = null;
    }
}

public class LinkedListCycle
{

    public boolean hasCycle(ListNode1 head) {
        if(head == null || head.next == null) return false;
        ListNode1 slow = head;
        ListNode1 fast = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast) return true;
        }
        return false;
    }
}
