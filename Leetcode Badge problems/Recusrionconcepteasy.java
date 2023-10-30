class Solution {
    //**REcusion concept easy just build */
    //k=1 k=2 k=3 k=4
//n=1 0
//n=2 0    1
//n=3 0    1   1   0
//n=4 0    1    1   0  1 0  0 1(length=2^n-1)


    public int kthGrammar(int n, int k) {
       

        if(n==1&&k==1) //base case
        {
            return 0;
        }
        int length=(int)Math.pow(2,n-1;//due to pow fun is double so conversionby using diagram
        int mid=length/2;

        if(k<=mid)
        {
            return kthGrammar(n-1,k);//for first half//it just uses base case to fill first value
        }
        else{
            //second val is taken by else
            return 1-( kthGrammar(n-1,k-1));
            //for second half (due to second half compliment of 1st half so (-1)+call)
        }
       
    }
}