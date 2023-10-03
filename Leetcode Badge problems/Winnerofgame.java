class Winnerofgame {
    public boolean winnerOfGame(String colors) {
        int colorA=0,colorB=0;
        for(int i=1;i<colors.length()-1;i++)
        {
           if(colors.charAt(i-1)==colors.charAt(i)&&colors.charAt(i+1)==colors.charAt(i)) //checks neighbour condition
            {
                if(colors.charAt(i)=='A') //if A then incre A
                {
                    colorA++;
                }
                else //if B then incr B
                {
                    colorB++;
                }
            }
        }
        return colorA>colorB;//(true if A has > value and false if B has >value)
    }
}