
package Class_Programs;

import java.util.Scanner;


public class Factorial {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter Number Whose Factorial you need to Calculate : ");
        int n=s.nextInt();
        System.out.println("Factorial of "+n+" is : "+new Calculate().fac(n));
    }
    
}
class Calculate{
public int fac(int n)
{
    if(n==0||n==1)
    {
        return 1;
    }
    else
    {
        return (n*fac(n-1));
    }
}

}
