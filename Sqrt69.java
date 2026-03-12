class Sqrt69 {
    public int mySqrt(int x) {
        int left = 1;
        int right = x;
        int mid = 0;
        if(x==1)
        {
            return 1;
        }
        while(left<=right)
        {
            mid = (left+right)/2;
            if(mid < x/mid)
            {
                left = mid+1;
            }
            else if(mid>x/mid)
            {
                right = mid - 1;
            }
            else
            {
                return mid;
            }
        }
        return right;
    }
}