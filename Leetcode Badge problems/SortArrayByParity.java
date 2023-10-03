lass SortArrayByParity{
    public int[] sortArrayByParity(int[] nums) {
        
        ArrayList<Integer> even=new ArrayList<Integer>();
        ArrayList<Integer> odd=new ArrayList<Integer>();
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]%2==0)
            {
                even.add(nums[i]); //just adding even
            }
            else
            {
                odd.add(nums[i]);  //adding odd
            }
        }
        for(int n:odd)
        {
            even.add(n);  //after even just adding odd
        }
        int rs[]=new int[even.size()]; //due to return type int so ***copying****
        for(int i=0;i<even.size();i++)
        {
            rs[i]=even.get(i);
        }
        return rs;

    }
}