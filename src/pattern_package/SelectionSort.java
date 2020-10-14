/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pattern_package;

/**
 *
 * @author Vineet
 */
public class SelectionSort {
    public static void main(String[] args) {
        int a[] = { 1 , 0 ,8 , 25 , 96 , -2 };
        int n = a.length;
        
        for (int i = 0 ; i<n-1; i++)
        {
            int minInd = i;
            for(int j=i; j<n; j++)
            {
                if (a[j] < a[minInd])
                {
                    minInd = j;
                }
            }
            int temp = a[i];
            a[i] = a[minInd];
            a[minInd]= temp;
        }
        for (int e: a)
        {
            System.out.print(e+" ");
        }
    }
}
