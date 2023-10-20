/**
 * // This is the interface that allows for creating nested lists.
 * // You should not implement it, or speculate about its implementation
 * public interface NestedInteger {
 *
 *     // @return true if this NestedInteger holds a single integer, rather than a nested list.
 *     public boolean isInteger();
 *
 *     // @return the single integer that this NestedInteger holds, if it holds a single integer
 *     // Return null if this NestedInteger holds a nested list
 *     public Integer getInteger();
 *
 *     // @return the nested list that this NestedInteger holds, if it holds a nested list
 *     // Return empty list if this NestedInteger holds a single integer
 *     public List<NestedInteger> getList();
 * }
 */
public class NestedIterator implements Iterator<Integer> {
//**Iterator Iterator<Integer> itr = al.iterator();
//al is list name then itr.hasnext()->itr.next normal procedure but it is for single data type
//whether string or int for multiple datatype simultaneously creating here using
 //NestedIntegerclass */

        //***Approach using stack (LIFO) so while push reverse order */
       public Stack<NestedInteger> s;
    public NestedIterator(List<NestedInteger> nestedList) {
        s=new Stack<>();
        for(int i=nestedList.size()-1;i>=0;i--)
        {
            s.push(nestedList.get(i));
//intially pushing in stack due to (LIFO) pusing reverse order(return in ascending order so)
        }
    }

    @Override
    public Integer next() {
        //returns next integer
        int num=s.pop().getInteger();//anyway it is num so gettting in intdatatype
        return num;//because in main adding num in result
    }

    @Override
    public boolean hasNext() {//if it true then next call is called in main fun
        
        while(!s.isEmpty()) //stack empty process stop
        {

         NestedInteger obj=s.peek();//**nestedInteger is datatype created by us***
        if(obj.isInteger())
        {
        return true; //if int return direct true
        }
        s.pop(); //del from stack
        //**Otherwise it must be list so use getList method and stroe using nestedlist 
        //datatype in list then only we can call getlist method */
        List<NestedInteger> list=obj.getList(); //we can method **using obj only**
        for(int i=list.size()-1;i>=0;i--)
        {
            s.push(list.get(i));//again pushing by spliting list as integer one by one
        }
        }
        return false;


        //cheks for int if it then true otherwise false 
    }
}

/**
 * Your NestedIterator object will be instantiated and called as such:
 * NestedIterator i = new NestedIterator(nestedList);
 * while (i.hasNext()) v[f()] = i.next();
 */