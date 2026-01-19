#not my code but verified and corrected

class Node:
    def __init__(self, data):
        self.data = data
        self.left = None
        self.right = None

root = None

def append(d):
    global root
    new_node = Node(d)
    
    # If the tree is empty, make new node the root
    if root is None:
        root = new_node
    else:
        temp = root
        while True:
            # If data is less than current node, go left
            if d < temp.data:
                if temp.left is not None:
                    temp = temp.left
                else:
                    temp.left = new_node
                    break
            # If data is greater or equal, go right
            else:
                if temp.right is not None:
                    temp = temp.right
                else:
                    temp.right = new_node
                    break

def search(root, val):
    # Base Case: Not found
    if root is None:
        return False
    
    # Base Case: Found the value
    if root.data == val:
        return True
    
    # Recursively search left or right
    # Because it is a BST, we can optimize this:
    if val < root.data:
        return search(root.left, val)
    else:
        return search(root.right, val)

# Example Usage:
elements = [50, 30, 70, 20, 40]
for e in elements:
    append(e)

print(f"Is 40 in the tree? {search(root, 40)}")
print(f"Is 90 in the tree? {search(root, 90)}")