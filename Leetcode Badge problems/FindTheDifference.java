class FindTheDifference {
    public char findTheDifference(String s, String t) {
        char rs=0; //Initialized as o to start from starting char
        for(char ch:s.toCharArray())
        {
            rs^=ch; //stores xor of string s
        }
        for(char ch:t.toCharArray())
        {
            rs^=ch; //cancels xor of s present in t and return remaining
        }
        return rs;
    }
}