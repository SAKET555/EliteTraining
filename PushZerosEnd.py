class Solution:
    def pushZerosToEnd(self, arr):
        # code here
        index = 0
        for i in range(len(arr)):
            if arr[i] != 0:
                arr[index], arr[i] = arr[i], arr[index]
                index += 1
                