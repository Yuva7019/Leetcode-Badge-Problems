class Solution {

        //**similar to longest increasing subsequence concept */
        //**it will work on both 
        //->(topdown)and(bottomup) In leetcode due to constraints topdown wonot work */
    static int n;
    static int K;
      public static  int solve(int prev,int i,int A[])
        {
          if(i>=n)//5>=5(starts at 0 index)
          {
              return 0;
          }
          int result=0;
          while(prev==-1||i-prev<=K)
          {
              int take=A[i]+solve(i,i+1,A); //eg:{-2}-2+0=-2
              int nottake=solve(prev,i+1,A);
    //0 so it return 0 as output wrong to handle this extra line in main
              result=Math.max(take,nottake);

          }
          return result;
        }
    public static int constrainedSubsetSum(int[] A, int k) {
             n=A.length;
             K=k;
            int val= solve(-1,0,A);
            if(val==0) //to handle exception
            {
                int r=Integer.MIN_VALUE;;
                for(int i=0;i<A.length;i++)
                {
                   if(A[i]>A[i+1])
                   {
                       r=A[i];
                   }
                }
                val=r;
            }

            return val;
}


public static void main(String args[])
{
       int A[]={10,2,-10,5,20};
       int k=2;
System.out.println(constrainedSubsetSum(A,k));

}
}

