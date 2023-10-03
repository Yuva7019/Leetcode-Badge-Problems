lass Monotonic{
    public boolean isMonotonic(int[] nums) {
        boolean increasing=true; //two flags defined initially true by which we can decide
        boolean decreasing=true; //(if asc make decrese=f if dcs make increas=false)
        for(int i=1;i<nums.length;i++)
        {
            if(nums[i]>nums[i-1])
            {
                decreasing=false;  //if only increasing then ascending order
            }
            else if(nums[i]<nums[i-1])
            {
                increasing=false; //if only decreasing desending order
            }
        }

        //*** if both false then both decreasing and increasing

        return increasing||decreasing;//(if any one true is monotonic both means return s false not monotomic)

    }
}