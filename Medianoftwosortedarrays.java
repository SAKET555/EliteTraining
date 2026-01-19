import java.util.*;



class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] result = new int[nums1.length+nums2.length];
        System.arraycopy(nums1,0,result,0,nums1.length);
        System.arraycopy(nums2,0,result,nums1.length,nums2.length);
        Arrays.sort(result);
        int NewArraylen = result.length;
        if(NewArraylen%2==0)
        {
            int temp1 = NewArraylen/2;
            int temp2 = temp1 - 1;
            int val1 = result[temp1];
            int val2 = result[temp2];
            return (double)(val1+val2)/2;
        }
        else
        {
            return (double)result[NewArraylen/2];
        }
    }
}

//correctly verified on leetcode