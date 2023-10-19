 public static void paskal(int n)
        {
            int [][] p=new int[n+1][n+1];
            for(int[] i:p)
            {
                Arrays.fill(i,1);
            }
            for(int i=0;i<=n;i++)
            {
                for(int j=1;j<i;j++)
                {
                    p[i][j]=p[i-1][j]+p[i-1][j-1];
                }
            }


            for(int i=0;i<n+1;i++)
            {
                for(int j=0;j<=i;j++)
                {
                    System.out.print(p[i][j]);
                }
                System.out.println();
            }
System.out.println("using 2d array list");
          List<List<Integer>> p1=new ArrayList<>(); //2D List //1->list=(1)-(2)-(3 ) //2-list=(1,2,3)-(2,3,4)-(5,6,7)
            for(int i=0;i<=n;i++)
            {
                List<Integer> row=new ArrayList<>();//Adding list which has rows and coleg:1,2,3
                                                                   //2 rows and 3 col      2,3,4
                for(int j=0;j<=i;j++)
                {
                    if(j==0||j==i)
                    {
                        row.add(1);//for last col and first col storing 1
                    }
                    else
                    {
                        row.add(p1.get(i - 1).get(j - 1) + p1.get(i - 1).get(j));
                    }
                }
                p1.add(row);
            }

            System.out.println(p1.get(n);
}