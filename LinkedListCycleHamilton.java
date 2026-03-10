


import java.util.ArrayList;

public class LinkedListCycleHamilton {
    public ListNode deleteDuplicates(ListNode head) {
        ArrayList<Integer> a = new ArrayList<>();
        ListNode curr = head;
        while(curr!=null)
        {
            a.add(curr.val);
            curr = curr.next;
        }
        while(curr!=null)
        {
            int l = curr.next.val;
            if(curr.val == l)
            {

            }
            curr = curr.next;
        }
    }
}