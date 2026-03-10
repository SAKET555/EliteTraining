class MajorityElements {
    public int majorityElement(int[] nums) {
        int max = 0;
        int count = 0;
        int maxelement = 0;
        Arrays.sort(nums);
        if(nums.length==1)
        {
            return nums[0];
        }
        for(int i=0;i<nums.length-1;i++)
        {
            if(nums[i]!=nums[i+1])
            {
                count++;
                if(max<count)
                {
                    max = count;
                    maxelement = nums[i];
                }
                count=0;
            }
            count++;
            if(max<count)
            {
                max = count;
                maxelement = nums[i];
            }
        }
        return maxelement;
    }
}