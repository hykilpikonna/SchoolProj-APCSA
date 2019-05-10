import java.util.ArrayList;

/**
 * Class created by Hykilpikonna on 2019-03-07 at 15:53!
 *
 * @author Hykilpikonna (https://github.com/hykilpikonna)
 * @since 2019-03-07 15:53
 */
public class Array2DExercises
{
    public static int max(int[][] a)
    {
        int max = a[0][0];
        for (int[] col : a)
        {
            for (int val : col)
            {
                max = Math.max(max, val);
            }
        }
        return max;
    }

    public static int rowSum(int[][] a, int x)
    {
        int sum = 0;
        for (int val : a[x])
        {
            sum += val;
        }
        return sum;
    }

    public static int columnSum(int[][] a, int x)
    {
        int sum = 0;
        for (int[] row : a)
        {
            if (x >= row.length) continue;
            sum += row[x];
        }
        return sum;
    }

    public static int[] allRowSums(int[][] a)
    {
        int[] result = new int[a.length];
        for (int rowIndex = 0; rowIndex < a.length; rowIndex++)
        {
            result[rowIndex] = rowSum(a, rowIndex);
        }
        return result;
    }

    public static boolean isRowMagic(int[][] a)
    {
        int[] allRowSums = allRowSums(a);
        int lastRowSum = allRowSums[0];

        for (int oneRowSum : allRowSums)
        {
            if (oneRowSum != lastRowSum) return false;
            lastRowSum = oneRowSum;
        }
        return true;
    }

    public static boolean isColumnMagic(int[][] a)
    {
        int lastColSum = columnSum(a, 0);

        for (int i = 1; i < a[0].length; i++)
        {
            int thisColSum = columnSum(a, i);
            if (thisColSum != lastColSum) return false;
            lastColSum = thisColSum;
        }
        return true;
    }

    public static boolean isSquare(int[][] a)
    {
        int len = a.length;
        for (int[] row : a)
        {
            if (row.length != len) return false;
        }
        return true;
    }

    public static boolean isMagic(int[][] a)
    {
        if (!isSquare(a) || !isRowMagic(a) || !isColumnMagic(a)) return false;
        int len = a.length;

        int diagonal1 = 0;
        for (int i = 0; i < len; i++)
        {
            diagonal1 += a[i][i];
        }

        int diagonal2 = 0;
        for (int i = 0; i < len; i++)
        {
            diagonal2 += a[len - i - 1][len - i - 1];
        }

        return diagonal1 == diagonal2;
    }

    public static boolean isLatin(int[][] a)
    {
        if (!isSquare(a)) return false;
        int len = a.length;

        // ArrayList of things that it supposed to have. Eg. 1, 2, 3 if
        // the side length is 3.
        ArrayList<Integer> supposedToHaves = new ArrayList<>();
        for (int i = 0; i < len; i++)
        {
            supposedToHaves.add(i + 1);
        }

        for (int[] row : a)
        {
            ArrayList<Integer> temp = new ArrayList<>(supposedToHaves);
            for (int val : row)
            {
                if (!temp.contains(val)) return false;
                temp.remove((Integer) val);
            }
            if (temp.size() != 0) return false;
        }


        for (int i = 0; i < len; i++)
        {
            ArrayList<Integer> temp = new ArrayList<>(supposedToHaves);
            for (int[] row : a)
            {
                int val = row[i];
                if (!temp.contains(val)) return false;
                temp.remove((Integer) val);
            }
            if (temp.size() != 0) return false;
        }
        return true;
    }

    public static boolean isSequence(int[][] a)
    {
        if (!isSquare(a)) return false;
        int len = a.length;

        ArrayList<Integer> allDigits = new ArrayList<>();
        for (int i = 0; i < len * len; i++)
        {
            allDigits.add(i + 1);
        }

        for (int[] row : a)
        {
            for (int val : row)
            {
                if (!allDigits.contains(val)) return false;
                allDigits.remove((Integer) val);
            }
        }
        return true;
    }
}
