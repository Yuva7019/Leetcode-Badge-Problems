class Integerbreak{
//***Spilt given int num using +num >=k(numbers)eg:k=2 means split numbers must be >=2(2+3+5=8) splitting.
    public int integerBreak(int n) {
        //****rember by eg:10 greedy approach***
        //***greedy approach
        //condition K>=2 eg:n=10->sum of n by positive integers but it must >= 2 numbers(3+3+4)||(3+5+2)||(4+4+2)||(5+5)||(2+2+2+2+2) etc..
        // but here sum of minimum pos integers
       // but product should be maximum so greedy approach
        if(n==1)
            return 0; //k>=2 so 0
        if(n==2)
            return 1;//eg:(2+1)=3 so not possible(1+1) possible then(1*1=1) so return 1
        if(n==3)
            return 2;//eg:(1+1+1)=3 prduct(1*1*1=1) but max product is smaller
                    // again (1+2)=3 product(1*2=2) prouduct is max so take this
                   // ***we need to return max product***
        int maxprod=1;
        while(n>4) //due to greedy approach logic ***remember by eg:10***
        {
            maxprod*=3; //needs to retuen max product value
            n-=3; //gredy approach logic
        }
        maxprod*=n; //eg:10 the above loop(prod=3*3 and now 3*3*n=4->36)
        return maxprod;
    }
}