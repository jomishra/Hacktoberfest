/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Vineet
 */
public class leaders {
    public static void main(String[] args){
        leaders lead = new leaders();
        int a[] = {16,17,4,3,5,2};
        int n = a.length;
        lead.printLeaders(a, n);
    }
    
    static void printLeaders(int a[], int size){
        int  max_from_right = a[size - 1];
        System.out.println(max_from_right + " ");
        
        for (int i = (size-2); i>=0; i--){
            if(max_from_right <= a[i]){
                max_from_right = a[i];
                System.out.println(max_from_right + " ");
            }
        }
    }
}
