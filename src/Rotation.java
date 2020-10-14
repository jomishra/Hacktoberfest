
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
public class Rotation {
    public static void main(String[] args){
        Rotation rotate = new Rotation();
        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8};
        rotate.leftRotate(arr, 2, 7);
        rotate.printArray(arr, 7);
        
        
    }
    
    void leftRotate(int arr[],int d, int n){
        for(int i=0; i< d; i++)
            leftRotateByOne(arr,n);
    }
    
    void leftRotateByOne(int arr[], int n){
        int i, temp;
        temp = arr[0];
        for(i=0; i<n; i++)
            arr[i] = arr[i+1];
        arr[i] = temp;
    }
    
    void printArray(int arr[], int n ){
        System.out.println("Rotated Array" + Arrays.toString(arr));
    }
}
