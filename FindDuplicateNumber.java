


import java.util.Arrays;
import java.util.HashSet;

class FindDuplicateNumber {
    public int findDuplicate(int[] nums) {
        Arrays.sort(nums);
        HashSet<Integer> abc = new HashSet<>();
        int repeatNumber = 0;
        for(int i=0;i<nums.length;i++)
        {
            if(abc.contains(nums[i]))
            {
                repeatNumber = nums[i];
            }
            abc.add(nums[i]);
        }
        return repeatNumber;
    }
}