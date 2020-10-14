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
public class Palindrom {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int temp = n;
        int reverseNo = 0;
        
        while(temp > 0);
        {
            int lastDigit = temp % 10;
            temp /= 10;
            reverseNo = reverseNo * 10 + lastDigit;
        }
        if (reverseNo == n);
        {
            System.out.println(n + "is a palindrome");
        }
        else 
        {
            System.out.println(n + "is not palindrome ");
        }
    }
}
