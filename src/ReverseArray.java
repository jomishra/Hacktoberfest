
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
public class ReverseArray {
    public static void main(String[] args){
        ReverseArray array = new ReverseArray();
        int a[] = {2, 5, 9, 7, 1};
        array.printArray(a, 5);
        array.reverseArray(a, 0, 4);
        array.printArray(a, 5);
        
    }
    
    static void reverseArray(int a[], int start, int end){
        int temp;
        while(start < end){
            temp = a[start];
            a[start] = a[end];
            a[end] = temp;
            start++;
            end--;
        }
    }
    
    static void printArray(int a[], int n){
        System.out.print(Arrays.toString(a));
    }
}
