lass  ChampagneTower{
    public double champagneTower(int poured, int query_row, int query_glass) {
        //Using dynamic programing 
        double[][] tower=new double[query_row+1][query_row+1];//due to return double
        tower[0][0]=(double)poured; //stored as initaial vale using this we will find out next row(Bottom up approach tabularization)
        //EG:  2 1st row 1 col 
        //     0.5 0.5 2nd row as 2 col(**taking ist row value creating second row )

        for(int i=0;i<query_row;i++) //i->row
        {
            for(int j=0;j<=i;j++) //j->glass
            {
                double excess=(tower[i][j]-1.0)/2.0;
                if(excess>0)
                {
                   tower[i+1][j]+=excess;
                   tower[i+1][j+1]+=excess;
                }
            }
        }

        return Math.min(1.0,tower[query_row][query_glass]);//we have to return value <=1.0 so math.min(1,last row &col)


    }
}