class Solution {
    //***DP using top down approach(Memorization)***/
    //breaking big problem into sub problems
    //***Question they given search cost finding using max value***/
    //for 1=(1,1),(1,2),(1,3)->Each pos has *options*(Tree Structure use for loop)
    //for 2=(2,1),(2,2)...till 3
    //LIS length ==k when it reaches last index then we get "1" array set
    int N,M,K;
    final int mod=1000000007;
    int [][][]dp;
    //given constraints
    public int solve(int idx,int search_cost,int maxsofar)
    {
        if(idx==N) //if con using recursion for each value till last index
        {
            if(search_cost==K)
            {
                return 1; //"1" arr set so return 1
            }
            return 0; // no arrya set so return 0
        }
        if((dp[idx][search_cost][maxsofar]) !=-1)
         //already calculated value to avoid overlapping subproblems or duplicate
        {
            return dp[idx][search_cost][maxsofar];
        }

        int result=0;
        for(int i=1;i<=M;i++) //for loop for (1,2,3) values
        {
          if(i>maxsofar)
          {
              result=(result+solve(idx+1,search_cost+1,i))%mod;
              //**For first  call i=1->calls i=1 to i=3 using recusrion*/
              //**Mod given in question */
              //due to given algo searchcost++&currmax=i and avoi dout of bounds using mod
          }
          else
          {
              result=(result+solve(idx+1,search_cost,maxsofar))%mod;
          }
        }
        return dp[idx][search_cost][maxsofar]=result%mod;//mod to keep under specifi length
    }
    public int numOfArrays(int n, int m, int k) {
        N=n;
        M=m;
        K=k;
        dp=new int[51][51][101];
        //**Unlike c++ java does not have memeset fill so use arrays.fill */
        for (int i = 0; i < 51; i++) {
            for (int j = 0; j < 51; j++) {
                Arrays.fill(dp[i][j], -1);
            }
        }
        //2d array gets filled[][].**doubt because 3 var cahnges but -1 for 2 var**
      
        return solve(0,0,0); //Intial call 
    }
}