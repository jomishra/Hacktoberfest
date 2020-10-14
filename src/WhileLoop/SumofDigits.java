/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package WhileLoop;

import java.util.Scanner;

/**
 *
 * @author Vineet
 */
public class SumofDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int temp = n; 
        int sum=0;
        
        while (temp >0);
        {
            int lastDigit = temp % 10;
            temp /= 10
            
            sum += lastDigit;
            System.out.println(lastDigit +" "+temp+" "+ sum);
        }
        System.out.println("the sum of the digit of "+ n + " is "+ sum);
        
        int numberOfDigits = (int)Math.log10(n) + 1;
        System.out.println(numberOfDigits);
    }
}
