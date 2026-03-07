class WaterContainer {
    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length-1;
        int width = 0;
        int length = 0;
        int max = 0;
        int answer = 0;
        while(left<right)
        {
            width = right - left;
            length = Math.min(height[left],height[right]);
            answer = width*length;

            if(max<answer)
            {
                max = answer;
            }

            if(height[left] < height[right])
            {
                left++;
            }
            else
            {
                right--;
            }
            
        }

        return max;
    }
}