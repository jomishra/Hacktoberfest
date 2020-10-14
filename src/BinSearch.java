
import java.util.Arrays;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Vineet
 */
public class BinSearch {
    public static void main(String[] args){
        int[] a = {22, 33, 44, 55, 66, 77, 88};
        System.out.println("Array : " + Arrays.toString(a));
        
        System.out.println("search(a,44)" + search(a,44));
        System.out.println("search(a,55)" + search(a,55));
        System.out.println("search(a,66)" + search(a,66));
    }
    
    public static int search(int[]a, int x){
        int lo = 0;
        int hi = a.length;
        while(lo < hi){
            int i = (lo + hi) / 2;
            if (a[i] == x)
                return i;
            else if(a[i] < x)
                lo = i+1;
            else 
                hi = i;
        }
        return -1;
    }
}
