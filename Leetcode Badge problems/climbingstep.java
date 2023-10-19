class climbingstep{
       public int[] M;    
    public int solve(int i,int[] cost)
    {
        int n=cost.length;
        if(i>=n) //it reaches end (top down approca DP recusrse+meme0)
        return 0;
        if(M[i]!=-1)
        {
            return M[i];
        }
        int a=cost[i]+solve(i+1,cost);//given in ques either jump 1 or 2 step
        int b=cost[i]+solve(i+2,cost);//it is for 1 step and above for 2 steo
        return M[i]=Math.min(a,b); //store on M[i] for memeorixzation during each call
    }
    public int minCostClimbingStairs(int[] cost) {
        M=new int[1001];
        for(int i=0;i<M.length;i++)
        {
            M[i]=-1;
        }
        return Math.min(solve(0,cost),solve(1,cost));
        //staring at 0 and once again in 1 comp both and return min
    }
}