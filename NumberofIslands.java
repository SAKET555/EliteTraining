class NumberofIslands {
    public static void fun(int i,int j,char[][] grid)
    {
        if(i<0 || j<0 || i>=grid.length || j>=grid[0].length || grid[i][j]=='0')
        {
            return;
        }
        grid[i][j]='0';

        fun(i+1,j,grid);
        fun(i,j+1,grid);
        fun(i-1,j,grid);
        fun(i,j-1,grid);
    }

    public int numIslands(char[][] grid) {
        int c = 0;
        for(int i=0;i<grid.length;i++)
        {
            for(int j=0;j<grid[0].length;j++)
            {
                if(grid[i][j]=='1')
                {
                    c++;
                    fun(i,j,grid);
                }
            }
        }
        return c;
    }
}