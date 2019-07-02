import java.util.ArrayList;
import java.util.List;


public class PascalTriangle {

    public static void main (String[]args){

        System.out.println(generate(5));
    }

    public static List<List<Integer>> generate(int numRows)
    {
        List<List<Integer>> allrows = new ArrayList<List<Integer>>();
        List<Integer> row = new ArrayList<Integer>();
        for(int i=0;i<numRows;i++)
        {
            row.add(0, 1);
            System.out.println(row);
            System.out.println(row.size());
            for(int j=1;j<row.size()-1;j++) {
                row.set(j, row.get(j) + row.get(j + 1));
                System.out.println(row);
            }
            allrows.add(new ArrayList<Integer>(row));
            System.out.println(allrows);
        }
        return allrows;
    }


}