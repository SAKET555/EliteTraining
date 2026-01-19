from collections import deque

class Node:
    def __init__(self, key):
        self.left = None
        self.right = None
        self.val = key
        
root = Node(1)
root.left = Node(2)
root.right = Node(3)

root.left.left = Node(4)
root.left.right = Node(5)


def inorder(Node):
    if Node is not None:
        inorder(Node.left)
        print(Node.val,end="")
        inorder(Node.right)
        
def preorder(Node):
    if Node is not None:
        print(Node.val,end="")
        preorder(Node.left)
        preorder(Node.right)
        
        
def postorder(Node):
    if Node is not None:
        postorder(Node.left)
        postorder(Node.right)    
        print(Node.val,end="")
        
        
        
        
        
        
        
        
        
        
def levelorder(root):
    if root is None:
        return
    queue = [root]
    while queue:
        Node = queue.pop(0)
        print(Node.val,end="")
        if Node.left:
            queue.append(Node.left)
        if Node.right:
            queue.append(Node.right)
            
            
#You were not paying attention to this function so review it 1!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!1
def insert(root,key):
    if root is None:
        return Node(key)
    queue = deque([root])
    while queue:
        temp = queue.popleft()
        if temp.left is None:
            temp.left = Node(key)
            break
        else:
            queue.append(temp.left)
        if temp.right is None:
            temp.right = Node(key)
            break
        else:
            queue.append(temp.right)
        return root
#You were not paying attention to this function so review it 1!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!1
def search(root, val):
    if root is None:
        return False
    if root.val == val:
        return True
    left_res = search(root.left, val)
    right_res = search(root.right, val)
    return left_res or right_res
            


print("Inorder Sequence: ")
inorder(root)
print("\nPreorder Sequence: ")
preorder(root)
print("\nPostorder Sequence: ")
postorder(root)
print("\nLevel Order Sequence: ")
levelorder(root)  



#You were not paying attention to this function so review it 1!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!1
print("Enter the value to be searched: ")
value = int(input())
if search(root, value):
    print("Value found in the tree")
else:
    print("Value not found in the tree")
    
print("Inserting value 6 in the tree")
insert(root, 6)