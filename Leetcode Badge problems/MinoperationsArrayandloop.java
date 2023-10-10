class Solution {
    public int minOperations(int[] nums) {

        //***the below brute force time limit exceeded we need to make this brute force as
         //optimesd */
        // int res=Integer.MAX_VALUE;
        
        // for(int i=0;i<nums.length;i++)
        // {
             //***the below is approach** just take any ele from array consider as min /
             //then use given question int to find max check whether in range or not if                //if in no  range operations otherwise operation done
        //     int L=nums[i];  //max-min=n-1-->max=min+n-1;
        //                     //here min=L&&max=R;
        //     int R=L+nums.length-1;
        //     Set<Integer> set=new HashSet<>();
        //     int operation=0;
        //     for(int j=0;j<nums.length;j++)
        //     {
        //         if(nums[j]>=L&&nums[j]<=R&&!set.contains(nums[j])) //set to avoid duplicates
        //         {
        //             set.add(nums[j]);
        //             continue;
        //         }
        //         else
        //         {
        //             operation++;
        //         }
        //     }
        //     res=Math.min(res,operation);
        // }

        // return res;
          Arrays.sort(nums);  //eg:1323->sort->1,2,3,3
          int m=1;
          int ans=Integer.MAX_VALUE;
          //beloe for loop to remove duplicate ele from array and just store unique ele
          for(int i=1;i<nums.length;i++)//eg:1,2,3,3-->removedup-->1,2,3
          {
              if(nums[i]!=nums[i-1]) 
              //due to check prev element ! then unique qdd in array using new index
              {
                  nums[m]=nums[i];
                  m++;
              }
          }
       int j=0;//for min operations
          for(int i=0;i<m;i++)
          {
              while(j<m&& nums[j]<nums[i]+nums.length) //max=min+nums.length but here no - 
              {
                  j++;
              }
        
              ans=Math.min(ans,nums.length-j+i);
          }
          return ans;
    }
}