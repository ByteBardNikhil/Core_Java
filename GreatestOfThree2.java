
package Class_Programs;

import java.util.Scanner;


public class GreatestOfThree2 {
    public static void main(String[] args) {
        int a[] =new int [3];
        int i,n;
        
        Scanner s=new Scanner(System.in);
        System.out.println("Enter Numbers :");
        for(i=0;i<3;i++)
        {
         a[i]=s.nextInt();
            
        }
        new Greatest().great(a);
        
        
    }
    
}
class Greatest
{
    public void great(int a[])
    {int max=a[0];
        for(int i=0;i<a.length;i++)
        {
            if(max<a[i])
            {
                System.out.println("Greatest Number : "+a[i]);
                break;
            }
        }
    }
            
}
