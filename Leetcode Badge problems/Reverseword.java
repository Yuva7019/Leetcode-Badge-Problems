class Reverseword {

    public String reverseWords(String s) {
        s=s.replaceAll("\\s+"," ");//\\s rep all whitespace removes here **+** is imp to add how much space we need then " ".
         s=s+" ";
        String word="",finalstr="";
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)!=' ')
            {
                word+=s.charAt(i);
            }
            else
            {
                String revword=reverse1(word);
                finalstr+=revword+" ";
                word="";
            }
        }
        return finalstr.trim(); //removes front back extra spaces
    }

    public String reverse1(String s)
    {
        String s1="";
        for(int i=0;i<s.length();i++)
        {
            s1=s.charAt(i)+s1;
        }
        return s1;
    }
}