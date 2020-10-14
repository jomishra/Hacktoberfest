/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Vineet
 */
public class msxsum {
    public static void main(String[] args){
        int a[] = {-2, -3, 4, -1, -2, 1, 5, -3};
        int n = a.length;
        maxSubArraySum(a,n);
    }
    
    static void maxSubArraySum(int a[], int size) {
        int max_so_far = Integer.MIN_VALUE, max_end_here = 0, start = 0, end = 0, s=0;
        for(int i=0; i<size; i++){
            max_end_here += a[i];
            if(max_so_far < max_end_here){
                max_so_far = max_end_here;
                start = s;
                end = i;  
            }
            if(max_end_here < 0){
                max_end_here = 0;
                s = i + 1;
            }
        }
        System.out.println("Max Sum of Contigous Array  " + max_so_far);
        System.out.println("Start  " + start);
        System.err.println("End  " + end);
    }
}
