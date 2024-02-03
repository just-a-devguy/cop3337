public class MultidimensionalArrays {

    public static void main(String[] args)
    {
        int[][] x={{1,2,3},{4,5,6}}; // initialization of 2D array

        for(int i=0; i<x.length; i++) // this loop is for rows
        {
            for(int j=0; j<x[i].length; j++) // this loop is for columns
            {
                System.out.print(x[i][j]+ " ");
            }
                System.out.println(" ");
        }

    }
}
