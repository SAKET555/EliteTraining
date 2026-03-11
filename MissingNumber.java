




import java.util.HashSet;

public class MissingNumber {
    public int missingNumber(int[] nums) {
        int size = nums.length;
        int number = 0;
        HashSet<Integer> set = new HashSet<>();
        for(int i=0;i<size;i++)
        {
            set.add(nums[i]);
        }
        for(int i=0;i<size+1;i++)
        {
            if(!set.contains(i))
            {
                number = i;
            }
        }
        return number;
    }
}
