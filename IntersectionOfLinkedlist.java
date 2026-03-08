public class IntersectionOfLinkedlist {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode a = headA;
        ListNode b = headB;
        int c = 0;
        while(a!=b)
        {
            a=a.next;
            b=b.next;
            if(a==null)
            {
                a=headB;
                c++;
            }
            if(b==null)
            {
                b=headA;
                c++;
            }
            if(c>2) return null;
        }
        return a;
    }
}