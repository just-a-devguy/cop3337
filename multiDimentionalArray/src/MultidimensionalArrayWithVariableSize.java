public class MultidimensionalArrayWithVariableSize {
        public static void main(String[] args) {
            // Creating an array of arrays to represent a "jagged" 2D array
            int[][] jaggedArray = new int[3][];



            // Initializing the "jagged" array with arrays of different lengths
            jaggedArray[0] = new int[] { 1, 2, 3 };
            jaggedArray[1] = new int[] { 4, 5 };
            jaggedArray[2] = new int[] { 6, 7, 8, 9 };



            // Accessing and printing the values of the "jagged" array
            for (int i = 0; i < jaggedArray.length; i++) {
                for (int j = 0; j < jaggedArray[i].length; j++) {
                    System.out.print(jaggedArray[i][j] + " ");
                }
                System.out.println();
            }
        }
}
