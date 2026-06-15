class node:
    def __init__(self,data):
        self.left = None
        self.data = data
        self.right = None
        
def inorder(root):
    if root:
        inorder(root.left)
        print(root.data)
        inorder(root.right)
    
def preorder(root):
    if root:
        print(root.data)
        inorder(root.left)
        inorder(root.right)
        
def postorder(root):
    if root:
        inorder(root.left)
        inorder(root.right)
        print(root.data)
        
a=node(1)
b=node(2)
c=node(3)
a.left=b
a.right=c
print("Inorder")
inorder(a)
print("Preorder")
preorder(a)
print("Postorder")
postorder(a)
print("Printing")
print(a.data,a.right.data,a.left.data)