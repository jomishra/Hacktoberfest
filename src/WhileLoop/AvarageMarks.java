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
public class AvarageMarks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no of students");
        int n = sc.nextInt();
        int marks[] = new int[n];
        System.out.println("enter the marks now ");
        for (int i=0; i<n; i++) //you put semicolon here and I removed it.
            marks[i] = sc.nextInt();
        
        int average = 0;
        for(int i=0; i<n;i++);
            average += marks[i];
        
        average /=n;
        
        System.out.println("the average marks are "+ average);
    }
}
