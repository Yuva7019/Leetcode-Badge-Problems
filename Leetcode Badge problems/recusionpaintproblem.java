lass recusionpaintproblem {
    //given two options close eyestry to draw **tree diagram** recusrion
        int n;
        int t[][];
    public int solve(int idx,int remain,int[] cost,int[] time)
    {
        if(remain<=0)
        {
            return 0;//base case(no walls means all wall painted return 0) 
        }

        if(idx>=n)
        {
            return 999999999;
            //base case(out of bounds return max due to we have to find min value)
        }
        if(t[idx][remain]!=-1)
        {
            return t[idx][remain];
        }
        
        int paint=cost[idx]+solve(idx+1,remain-1-time[idx],cost,time);
        //**paid add cost+move next reduce wall count */
        int unpaint=solve(idx+1,remain,cost,time);
        //while return *frepaintcall* executed to check every options

        return t[idx][remain]= Math.min(paint,unpaint);


    }
    public int paintWalls(int[] cost, int[] time) {
        n=cost.length;
        t=new int[501][501];
        for(int i=0;i<t.length;i++)
        {
            for(int j=0;j<t[i].length;j++)
            {
                t[i][j]=-1;
            }
        }
 
        return solve(0,n,cost,time);
    }
}