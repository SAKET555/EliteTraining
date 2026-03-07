class IslandMaxArea {

    int max=0;
    public static int fun(int i,int j,int[][] grid,int c)
    {
        if(i<0 || j<0 || i>=grid.length || j>=grid[0].length || grid[i][j]==0)
        {
            return c;
        }
        grid[i][j]=0;
        c++;
        c=fun(i+1,j,grid,c);
        c=fun(i,j+1,grid,c);
        c=fun(i-1,j,grid,c);
        c=fun(i,j-1,grid,c);
        return c;
    }

    public int maxAreaOfIsland(int[][] grid) {
        max = 0;
        for(int i=0;i<grid.length;i++)
        {
            for(int j=0;j<grid[0].length;j++)
            {
                if(grid[i][j]==1)
                {
                    int c = 0;
                    int area = fun(i,j,grid,c);
                    if(area>max)
                    {
                        max = area;
                    }
                }
            }
        }
        return max;
    }
}