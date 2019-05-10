package deprecated.pixlab;

public class IntArrayWorker
{
    /** two dimensional matrix */
    private int[][] matrix = null;

    /**
     * set the matrix to the passed one
     *
     * @param theMatrix the one to use
     */
    public void setMatrix(int[][] theMatrix)
    {
        matrix = theMatrix;
    }

    /**
     * Method to return the total
     *
     * @return the total of the values in the array
     */
    public int getTotal()
    {
        int total = 0;
        for (int[] row : matrix)
        {
            for (int col = 0; col < matrix[0].length; col++)
            {
                total = total + row[col];
            }
        }
        return total;
    }

    /**
     * Method to return the total using a nested for-each loop
     *
     * @return the total of the values in the array
     */
    public int getTotalNested()
    {
        int total = 0;
        for (int[] rowArray : matrix)
        {
            for (int item : rowArray)
            {
                total = total + item;
            }
        }
        return total;
    }

    /**
     * Method to fill with an increasing count
     */
    public void fillCount()
    {
        int numCols = matrix[0].length;
        int count = 1;
        for (int row = 0; row < matrix.length; row++)
        {
            for (int col = 0; col < numCols; col++)
            {
                matrix[row][col] = count;
                count++;
            }
        }
    }

    /**
     * print the values in the array in rows and columns
     */
    public void print()
    {
        for (int[] aMatrix : matrix)
        {
            for (int col = 0; col < matrix[0].length; col++)
            {
                System.out.print(aMatrix[col] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }


    /**
     * fill the array with a pattern
     */
    public void fillPattern1()
    {
        for (int row = 0; row < matrix.length; row++)
        {
            for (int col = 0; col < matrix[0].length;
                 col++)
            {
                if (row < col)
                    matrix[row][col] = 1;
                else if (row == col)
                    matrix[row][col] = 2;
                else
                    matrix[row][col] = 3;
            }
        }
    }

    /**
     * Count the amount of num appearance in matrix[][]
     *
     * @param num num
     * @return How many time it appear
     * @author Ticrizon
     */
    public int getCount(int num)
    {
        int count = 0;

        for (int[] set : matrix)
            for (int one : set)
                if (one == num) count++;

        return count;
    }

    /**
     * Get largest
     *
     * @return largest
     * @author Ticrizon
     */
    public int getLargest()
    {
        int max = 0;

        for (int[] set : matrix)
            for (int one : set)
                max = Math.max(one, max);

        return max;
    }

    /**
     * Get total of a col
     *
     * @return total of a col
     * @author Ticrizon
     */
    public int getColTotal(int col)
    {
        int total = 0;

        for (int[] row : matrix)
            total += row[col];

        return total;
    }
}