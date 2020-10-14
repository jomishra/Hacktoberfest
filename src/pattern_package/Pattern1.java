package pattern_package;
 
import java.util.Scanner;

public class Pattern1 {
    public static void main(String aargs[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
//        for(int i=1; i<=n; i++)
//        {
//            for(int j=1; j<=i; j++)
//            {
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
//    }
//        for (int i=1; i<=n; i++)
//        {
//            for(int j=1; j<=n; j++)
//            {
//                System.out.print("+ ");
//            }
//            System.out.println();
//        }
        for (int i=1; i<=n; i++)
        {
            for(int j=1; j<=i-1; j++)
            {
                System.out.print("  ");
            }
            for(int j=1; j<=n-i+1; j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
//        boolean isPrime = true;
//        for(int i=2; i * i <n; i++)
//        {
//            if(n % i == 0)
//            {
//                isPrime = false;
//                break;
//            }      
//        }
//        if(n<2)
//                isPrime = false;
//            System.out.print("isPrime " + isPrime); 
//    
    }
    
     
    
