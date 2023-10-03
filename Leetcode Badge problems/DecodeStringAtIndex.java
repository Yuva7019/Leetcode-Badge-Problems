lass DecodeStringAtIndex{
    public String decodeAtIndex(String s,int k) {
       long declen=0; //if int used divid by zero error
        //we created decoded string using given rules(just expanded based on requirement)
        for(int i=0;i<s.length();i++)
        {
            if(Character.isDigit(s.charAt(i)))
            {
                declen*=s.charAt(i)-'0';//-0 due to it returns as ascci value eg:2->49-47=2
            }
            else
            {
                declen++;
            }
        }

        //for printing kth index value again encode the decoded String so (**reverse process**)
        for(int i=s.length()-1;i>=0;i--)
        {

            if(Character.isDigit(s.charAt(i)))
            {
                declen /= (s.charAt(i)-'0');
                k %= declen; //after reducing string len by dividding then k must be inside of that length so modulus eg:28%12=4 instead of 28 index 4th index is accessed
            }
            else
            {
                if(k==0||k==declen) //k=0 means it starts
                {
                    return String.valueOf(s.charAt(i));
                }

                declen--;
            }
        }

        return "";
    }
}