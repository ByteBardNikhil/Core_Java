
package Class_Programs;

import java.util.Scanner;

public class GreatestOfThree {
    public static void main(String[] args) {
        int a,b,c;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter Numbers :");
        a=s.nextInt();b=s.nextInt();c=s.nextInt();
        if(a>b&&a>c)
        {
            System.out.println(a+"is Greatest ");
        }
        else
         if(b>a&&b>c)
        {
            System.out.println(b+"is Greatest ");
        }
        else
          if(c>a&&c>b)
        {
            System.out.println(c+"is Greatest ");
        }
       
              
    }
   
}
