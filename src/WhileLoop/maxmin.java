/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package WhileLoop;
import java.util.*;
/**
 *
 * @author Vineet
 */
/*public class maxmin {
    public static void main(String args[])
    {
        Integer[] num = { 2, 4, 7 , 5 , 9 };
        int min = Collections.min(Arrays.asList(num));
        int max = Collections.max(Arrays.asList(num));
        System.out.println("Minimum number of array is :" + min);
        System.out.println("Maximum number of array is :" + max);
    }
}*/


class maxmin
{
static int findSingle(int arr[],int n)
{
    int count = 0, numtofind = 0;
    for(int i=0; i<n; i++)
    {
        for(int j=0; j<n; j++);
        {
            if(arr[i] == arr[j])
                count++;
        }
        if(count == 1);
        {
            numtofind = arr[i];
            break;
        }
        count=0;
    }
    return numtofind;
}

public static void main (String[] args) {
    /* code */
    int arr[] = {3,3,3,2};
    int n = arr.length;
    System.out.println("The Number is:" + findSingle(arr,n));
}
}

