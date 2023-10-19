class Solution {
    public boolean backspaceCompare(String s, String t) {
        Stack<Character> stackS=new Stack<>();
        Stack<Character> stackt=new Stack<>();
        for(int i=0;i<s.length();i++)
        {
          if(s.charAt(i)!='#')
          {
              stackS.push(s.charAt(i));
          }
          else if(s.charAt(i)=='#'&&!stackS.isEmpty())
          {
              stackS.pop(); //(Last in first out) so precedence poped out
          }
        }



        for(int i=0;i<t.length();i++)
        {
          if(t.charAt(i)!='#') 
          //if not # then push into stack then if it is #the pop previous char
          {
              stackt.push(t.charAt(i));
          }
          else if(t.charAt(i)=='#'&&!stackt.isEmpty()) //before pop check is empty or not
          {
              stackt.pop();//(Last in first out) so precedence poped out
          }
        }

        return stackS.equals(stackt); //comparing both equal or not



    }
}