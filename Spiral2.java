
class Spiral2 {
    public int[][] generateMatrix(int n) {
        int[][] array = new int[n][n];
        int t = 0;
        int b = n-1;
        int l = 0;
        int r = n-1;
        int c = 1;
        while(t<=b && l<=r)
        {
            for(int i=l;i<=r;i++)
            {
                array[t][i] = c;
                c++;
            }
            t++;
            for(int i=t;i<=b;i++)
            {
                array[i][r] = c;
                c++;
            }
            r--;
            if(t<=b)
            {
                for(int i=r;i>=l;i--)
                {
                    array[b][i] = c;
                    c++;
                }
                b--;
            }
            if(l<=r){
                for(int i=b;i>=t;i--)
                {
                    array[i][l] = c;
                    c++;
                }
                l++;
            }
        }
        return array;
    }
}