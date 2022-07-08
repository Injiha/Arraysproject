package edu.sdccd.cisc191.template;

import java.util.Arrays;
/**
 * ArrayMethods class:
 * Sends methods to ArrayMethodsDemo
 *
 * @author Inji Hankala
 * @version 2.0
 * @since 7/07/2022
 */
public class ArrayMethods
{
    /**
     * count method calculates how many indexes are in the array after setting count to 0
     * @return The count which is the total number of indexes
     */

    private int [] a = {7, 8, 8, 3, 4, 9, 8, 7};
    public String count()
    {

        int count = 0;
        for (int value : a)
            count = value +1;
        String y = String.valueOf(count);
        return y;
    }

    /**
     * sum method calculates the sum of all the numbers inside the array
     * @return The sum which is the total of the array
     */
    public String sum()
    {
        int sum = 0;
        for (int index=0; index < a.length; index++)
            sum += a[index];
        String y = String.valueOf(sum);
        return y;
    }


    /**
     * findMax detemines the max value in the array
     * @return The max found from the array
     */
    public String findMax()
    {
        int max = a[0];
        for (int index =1; index <a.length; index++)
        {
            if (a[index] > max)
                max = a[index];
        }
        String y = String.valueOf(max);
        return y;
    }

    /**
     * findIndexOfMax method determines the max value
     * @return The count which is the total number of indexes
     */
    public String findIndexOfMax()
    {
        int max = a[0];
        int indexMax = 0;
        for (int index = 1; index < a.length; index++)
        {
            if(a[index] > max)
                indexMax = index - 1;
        }
        String y = String.valueOf(indexMax);
        return y;
    }


    /**
     * The sortArray method sorts the numbers in order from smalled to largest
     */
    public String sortArray()
    {
        for (int outer = 0; outer < a.length; outer++)
        {
            for (int inner = outer + 1; inner < a.length; inner++)
            {
                if (a[outer] > a[inner])
                {
                    int input = a[outer];
                    a[outer] = a[inner];
                    a[inner] = input;
                }
            }

        }
        String array = Arrays.toString(a);
        return array;
    }

    /**
     * The reverseArray method reverse the numbers that were sorted from the sortArray method
     * @param inArray The array from the sortArray method
     */
    public void reverseArray(int[] inArray)
    {
        // put your code here
        for (int index = 0; index < inArray.length/2; index++)
        {
            int temp = inArray[index];
            inArray[index] = inArray[inArray.length - index - 1];
            inArray[inArray.length - index - 1] = temp;
        }
    }

    /**
     * The genFiveByFiveRows method print out an arry with columns A->E and rows 1->5
     * Col 1 has all 1's, col 2 all 2's, and so on
     */
    public void genFiveByFiveRows()
    {
        System.out.println("  A B C D E");
        int[][] var = new int[5][5];
        for (int row =0; row < var.length; row++)
        {
            for (int col = 0; col < var[row].length; col++)
            {
                var[row][col] = row + 1;
            }
        }

        for (int row = 0; row < var.length; row++)
        {
            System.out.print(row + 1 + " ");
            for (int col = 0; col < var[row].length; col++)
            {
                System.out.print(var[row][col] + " ");
            }
            System.out.println();
        }
    }



}


