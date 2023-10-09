class Solution {
    //*Array given ASCENDING order*//
    public int[] searchRange(int[] nums, int target) {
        int start=-1,end=-1;
        for(int i=0;i<nums.length;i++)//looping front to check first pos
        {
            if(nums[i]==target)
            {
                start=i;
                break;
            }
        }
        if(start==-1)//if first pos not found then there will only end pos so return [-1,-1]
        {
            return new int[]{-1,-1};//Intializing arary in java and return current stored value
        }

        for(int i=nums.length-1;i>=0;i--)//looping reverse to check end pos
        {
            if(nums[i]==target)
            {
                end=i;
                break;
            }
        }
        return new int[]{start,end};
 //return an array procedure(need to intialize and return value int[] n=new int[]->n={1,2};


    }
}