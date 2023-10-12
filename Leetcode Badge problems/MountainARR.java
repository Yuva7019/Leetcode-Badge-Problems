/**
 * // This is MountainArray's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface MountainArray {
 *     public int get(int index) {}
 *     public int length() {}
 * }
 */
 


                                                     refer ******leetcode****** for optimal sol using binarysearch

class Solution {
//**this linear method time limit excced to solving using optimal sol binary search refer ******leetcode******//
    //***Mountainarary 1234532(First increses Thenstart decreing at some point) */
    //**Last pos before decreasing is mountain peak */
    //**HEre we need call array using MountainArray interface */
    //Approach using linear serach we can use binary search for optimal solutin//
    //just find out peak using Bs then send 0-peak to bs peak+1-end to bs(2nd offreverse order)
    public int findInMountainArray(int target, MountainArray mountainArr) {

        int st=-1,end=-1;
        for(int i=0;i<mountainArr.length();i++)
        {
            if(mountainArr.get(i)==target)
            {
                st=i;
                break;
            }
        }
        if(st==-1)
        {
            return -1;
        }
        for(int i=mountainArr.length()-1;i>=0;i--)
        {
         if(mountainArr.get(i)==target)
            {
                end=i;
                break;
            }
        }
        return Math.min(st,end);
    }
}