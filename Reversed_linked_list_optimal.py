def reverse_list_optimal(head):
    prev = None
    curr = head
    while curr:
        temp = curr.next     
        curr.next = prev     
        prev = curr          
        curr = temp          
    return prev              