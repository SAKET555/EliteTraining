class PowerOfTwo {
    public boolean isPowerOfTwo(int n) {
        int i = 0;
        while(i<=30)
        {
            int value = 1 << i;
            if(value  <=n)
            {
                if(value ==n)
                {
                    return true;
                }
                i++;
            }
            else
            {
                return false;
            }
        }
        return false;
    }



}