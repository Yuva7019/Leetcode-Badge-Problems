class Find132pattern{
    public boolean find132pattern(int[] nums) {
         int max=Integer.MIN_VALUE;
         Stack<Integer> st=new Stack<>();
         for(int i=nums.length-1;i>=0;i--)
         {
             if(nums[i]<max)  //(prev<next) then middle is >than both
             { 
             //*** next(already in stack) is less than curr than next is max curr is stack(and then prev is check with next char  )
             return true;
             }
             while(!st.isEmpty()&&st.peek()<nums[i])
             {
               max=st.peek(); //update next value
               st.pop(); 
             }
             st.push(nums[i]);//(1-prev,3-curr,2-next)
         }
         return false;

    }
}