
package Class_Programs;

import java.util.Scanner;

/*Write a program to check given no is prime number or non-prime number 
also print all prime numbers between 1 to 100. */
public class Prime {
    public static void main(String[] args) {
        System.out.println("Enter Number : ");
        int n=new Scanner(System.in).nextInt();
       int i,count=0;
       for(i=1;i<=n;i++)
       {
         if(n%i==0)
         {
             count++;
         }
               
           
       }
       if(count==2)
       {System.out.println("Number is Prime");}
       else
       {
           System.out.println("Number is not Prime");
       }
   new PrimeNumberTill100().print();
    }
   
    
}
class PrimeNumberTill100
{
    public void print()
    {int i,n=2,count=0;
    while(n<=100)
    {count=0;
        for(i=1;i<=n;i++)
       {
         if(n%i==0)
         {
             count++;
         }
       }
        if(count==2)
        {
            System.out.println("Prime Number "+n);
        }
        n++;
    }
     
    }
}
