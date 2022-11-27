//program to calculate income tax paid by an employee
import java.util.*;
import java.util.Scanner;
public class elseif2 {
    public static void main(String [] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("enter the income slab:");
        int a = obj.nextInt();
        double tax;
        //conditions having 
        if (a>=250000 && a<=500000 )
        {
           tax = (a*5)/100;
           System.out.println("income tax paid by an employee :"+tax);        
        }
        else if (a>500000 && a<=1000000)
        {
            tax = (a*20)/100;
            System.out.println("income tax paid by an employee :"+tax);
        }
        else if (a> 1000000)
        {
            tax = (a*30)/100;
            System.out.println("income tax paid by an employee :"+tax);
        }
        //no tax for less than 2.5L income
        else 
        System.out.println("there is no tax");
        
    }
}
