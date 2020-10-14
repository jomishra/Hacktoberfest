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
public class BubbleSorting {
    public static void main(String args[])
    {
        int a[] = {2,1,12,-3,47,56};
        int n = a.length;
        
        for(int i=0; i<n-1; i++)
        {
            boolean sorted = true;
            for(int j=0; j<n-1-i; j++)
            {
                if(a[j+1] < a[j])
                {            
                    int temp = a[j+1];
                    a[j+1] = a[j];
                    a[j] = temp;
                    
                    sorted = false;
                }    
            }
            if(sorted)
                break;
        }
        for (int item : a)
        {
            System.out.print(item+ " ");
        }
    }
    
}
