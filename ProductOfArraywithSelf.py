from typing import List

class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        n = len(nums)
        # Initialize the result array with 1s
        result = [1] * n
        
        # --- PASS 1: Prefix (Left Side) ---
        # Calculate product of all elements to the left of index i
        prefix = 1
        for i in range(n):
            result[i] = prefix      # Store current left-side product
            prefix *= nums[i]       # Update prefix for the next element
            
        # --- PASS 2: Suffix (Right Side) ---
        # Calculate product of all elements to the right of index i
        suffix = 1
        for i in range(n - 1, -1, -1): # Moving backwards from end to start
            result[i] *= suffix     # Multiply current value by right-side product
            suffix *= nums[i]       # Update suffix for the next element (to the left)
            
        return result