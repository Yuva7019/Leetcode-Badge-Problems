public class sol
{ 
public static List<Integer> FlowblosRange(List<List<Integer>> f,List<Integer> p) {

        List<Integer> l1 = new ArrayList<>();
        for (int i = 0; i < p.size(); i++) //loop till people array ends
        {
            int count = 0; //***each iteration atarts with count 1
            for (int j = 0; j < f.size(); j++) //f.size(return list size(eg:L1,L2etc..)) 4 list(each list has row and col)
            {
                int st = f.get(j).get(0); //Eg:L1 la o position val
                int end = f.get(j).get(1);//eg:L1 la 1st position val
                if (p.get(i) >= st && p.get(i) <= end) //checks range for one by one people for all flowers
                {
                    count++; //count with in range of st and end ->then person can see that flower
                }
            }
            l1.add(count); //for person i=i checked with all flowers j=0-j=end and addede

        }
        for (int i : l1) {
            System.out.println(i);
        }

        return l1;

    }

public static void main(String args[])
        {
            List<Integer> p = new ArrayList<>();
            p.add(2);
            p.add(3);
            p.add(7);
            p.add(11);
//        for(int v:p)
//        {
//            System.out.println(v);//for ecah prints each value
//        }

//creating 2D list and adding elements

            List<List<Integer>> f = new ArrayList<>();
            List<Integer> f1 = new ArrayList<>();
            f1.add(1);
            f1.add(6);
            List<Integer> f2 = new ArrayList<>();
            f2.add(3);
            f2.add(7);
            f.add(f1);
            f.add(f2);
            List<Integer> f3 = new ArrayList<>();
            f3.add(9);
            f3.add(11);
            List<Integer> f4 = new ArrayList<>();
            f4.add(4);
            f4.add(13);
            f.add(f3);
            f.add(f4);

//       for print 2D list
//        for(int i=0;i<f.size();i++) //for each list row
//        {
//            for(int j=0;j<f.get(i).size();j++) //for each list till col
//            {
//                System.out.print(f.get(i).get(j)+" "); //first ros first col val
//            }
//            System.out.println();
//        }

            FlowblosRange(f, p);
        }
    }