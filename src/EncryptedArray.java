/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Vineet
 */
public class EncryptedArray {
    public static void main(String[] args){
        EncryptedArray ency = new EncryptedArray();
        int a[] = {10,14,12,13,11};
        int n = a.length;
        ency.decryptArray(a, n);
    }
    
    static void decryptArray(int a[], int size){
        int arr_sum = 0;
        for(int i=0; i<size; i++){
            arr_sum += a[i];
        }
        arr_sum = arr_sum / (size-1);
        
        for(int i=0; i<size; i++)
            System.out.print(arr_sum - a[i] + " ");
    }
}
