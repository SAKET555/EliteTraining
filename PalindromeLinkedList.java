import java.util.*;


class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

public class PalindromeLinkedList {
    public boolean isPalindrome(ListNode head) {
        ArrayList<Integer> a = new ArrayList<>();
        ListNode curr = head;
        while(curr!=null)
        {
            a.add(curr.val);
            curr = curr.next;
        }

        curr = head;
        while(curr!=null)
        {
            int l = a.remove(a.size()-1);
            if(curr.val!=l)
            {
                return false;
            }
            curr = curr.next;
        }

        return true;
    }
} 