class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] newArr = new int[nums.length];
        int[] a = new int[nums.length/2];
        int[] b = new int[nums.length/2];
        for(int i=0;i<(nums.length/2);i++)
        {
            a[i] = nums[i];
        }
        for(int i=(nums.length/2);i < nums.length;i++)
        {
            b[i-n] = nums[i];
        }
        for(int i=0;i<nums.length;i+=2)
        {
            newArr[i] = a[i/2];
        }

        for(int i=1;i<nums.length;i+=2)
        {
            newArr[i] = b[i/2];
        }


        return newArr;
    }
}