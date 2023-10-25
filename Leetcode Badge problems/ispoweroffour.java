
         public boolean isPowerOfFour(int num) {
         if(num==0)
        {
        return false;
        }
        while(num%4==0) //check whether it divisible
        {
            num=num/4; //at last it return 1 then it power logic
        }
        if(num==1)
        {
            return true;
        }

         return false;
      
           }