
import java.util.Arrays;
import static jdk.nashorn.internal.objects.NativeString.search;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Vineet
 */

public class SeqSearch {
    public static void main(String[] args){
    int[] a = {22, 33, 44, 55, 66, 77, 88};
    
    System.out.println("Array :"+ Arrays.toString(a));
    System.out.println("search(a,44)" + search(a,44));
    System.out.println("search(a,60)" + search(a, 60));
}

public static  int search(int[]a, int x){
    for(int i = 0; i<a.length; i++)
    {
        if(a[i] == x)
            return i;
    }
    return -1;
}
}
