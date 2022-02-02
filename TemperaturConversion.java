
package Class_Programs;

import java.util.Scanner;

public class TemperaturConversion {
    
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Temperatur Conversion Menu :\n1] Fahrenheit to Celcius\n2] Celsius to Fahrenheit\nEnter your Choice");
    int n=s.nextInt();
    
    switch(n)
    {
        case 1:
        {
       new Conversion().fToC();
        break;
        }
        case 2:
        {
            new Conversion().cToF();
        break;
        }
        default:
            System.out.println("Wrong Choice Chosen");
        }
        
    }
    
}
class Conversion
{Scanner s=new Scanner(System.in);
double t;
    public void fToC()
    {
        System.out.println("Enter Temprature in Fahrenheit");
        t=s.nextDouble();
        t=(t-32)/1.8;
        System.out.println("Temperatur in Celcius : "+t);
    }
    public void cToF()
    {
         System.out.println("Enter Temprature in Celcius");
        t=s.nextDouble();
        t=1.8*t+32;
        System.out.println("Temperatur in Fahrenheit : "+t);
    }
}

