class Solution {

              
    public int maximumScore(int[] A, int k) {
        //****Greddy approach */
        //the sub array must include k value inbetween(eg:{})
//{3,7,4}{4,3,7,4}{4,3,7,4,5} {3,7}{7,4} from this get min then *(j-i+1)
//***while iterating check cond(i<kandj<n)** */
         int n=A.length;
         int K=k;
         int currmin=A[k];
         int res=A[k];
         int i=k,j=k;
          //**Good array(i^th index <=k value and j^idx<=K starting )

            while(i>0||j<n-1)
            {
                int leftval=(i>0)?A[i-1]:0; //if i=0 then set=0 
                int rightval=(j<n-1)?A[j+1]:0;//similar to i butval diff
                if(leftval<rightval)
                {
                    j++;
                    currmin=Math.min(currmin,A[j]);
                }
                else
                {
                    i--;
                    currmin=Math.min(currmin,A[i]);
                }

                  res=Math.max(res,currmin*(j-i+1));
            }
          
        return res;
    }
}
