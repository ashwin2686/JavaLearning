package ArrayProblems;


import java.util.ArrayList;

class Pair{
    int first;
    int second;

    public Pair (int first,int second )
    {
        this.first = first;
        this.second = second;

    }



}

class MergeIntervals1{


    public static ArrayList<Pair> mergeIntervals(ArrayList<Pair> V)
    {

        if(V == null || V.size() == 0) {
            return null;
        }



        ArrayList<Pair> result = new ArrayList<Pair>();

        result.add(new Pair(V.get(0).first,V.get(0).second));


        for (int i=1 ;i< V.size();i++)
        {
            int newfirst = V.get(i).first;
            int newsecond = V.get(i).second;
            int oldfirst = result.get(result.size()-1).first;
            int oldsecond = result.get(result.size()-1).second;
            if (oldsecond >=newfirst)
            {
                result.get(result.size()-1).second = Math.max(oldsecond,newsecond);
            }
            else
            {
                result.add(new Pair(newfirst, newsecond));
            }

        }


        return result;
    }

    public static void main(String[] args) {
        ArrayList<Pair> v = new ArrayList<Pair>();

        v.add(new Pair(1, 3));
        v.add(new Pair(2, 7));
        v.add(new Pair(6, 8));
        v.add(new Pair(8, 9));
        v.add(new Pair(10, 12));
        v.add(new Pair(11, 15));

        ArrayList<Pair> result = mergeIntervals(v);

        for(int i=0; i<result.size(); i++){
            System.out.print(String.format("[%d, %d] ", result.get(i).first, result.get(i).second));
        }
    }
}