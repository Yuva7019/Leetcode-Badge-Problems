class Majorityelement{
//***Most repeated element
    public List<Integer> majorityElement(int[] nums) {
        HashMap<Integer,Integer> hm=new HashMap<Integer,Integer>();
        for(int i=0;i<nums.length;i++)
        {
            hm.put(nums[i],(hm.getOrDefault(nums[i],0)+1)); 
            //getordefault(3,0)+1 if 3 presents //then it return 3,s value otherwise 
             //we need to set 0 default (because ele not present)
             //finally 1 is added for 1 visit
        }
        int n=nums.length/3; //***/given in question greater than length/3 value return as list***
        List<Integer> l=new ArrayList<>();
        for(Map.Entry<Integer,Integer> m:hm.entrySet()) //syntax for hashmap looping
        {
            int count=m.getValue();
            int key=m.getKey();
            if(count>n)  //dupli count > n then value added
            {
             l.add(key);
            }
        }
        return l;//return as list so addded to arrylist
    }
}