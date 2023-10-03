class RemoveDuplicateLetters {
    public String removeDuplicateLetters(String s) {
           int[] li=new int[26];
        for(int i=0;i<s.length();i++)
        {
            li[s.charAt(i)-'a']=i; // to reprsent in 26 we willl substract-'a'eg:c-'a'or c-97=2
        }
        boolean vis[]=new boolean[26];//keep track whether visited or not to avoid duplicates
        Stack<Character> st=new Stack<>();//for sorting in lexicographically
        for(int i=0;i<s.length();i++)
        {
            int curr=s.charAt(i)-'a';
           if(vis[curr])
               continue; //avoid duplicates
           while(!st.isEmpty()&&st.peek()-'a'>curr&&i<li[st.peek()-'a'])
           {
               vis[st.pop()-'a']=false;  //which means we removed so not visited
           }
           st.push(s.charAt(i));
           vis[curr]=true; //keep track of visited
        }
       String s1="";

        while(!st.isEmpty())
        {
           s1=st.pop()+s1;

        }
       
        return s1;
    }
}