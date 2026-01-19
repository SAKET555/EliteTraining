def reverse_list_naive(head):
    vals = []
    curr = head
    while curr:
        vals.append(curr.val)
        curr = curr.next
        
    vals.reverse()
    
    curr = head
    for v in vals:
        curr.val = v
        curr = curr.next
        
    return head