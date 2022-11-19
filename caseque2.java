//to calculate income tax 
import java.util.*;
import java.util.Scanner;
public class caseque2{
public static void main(String[]args) {
    Scanner obj = new Scanner(System.in);
    System.out.println("enter the income tax");
    int a = obj.nextInt();
    double tax;
    if ( a>=250000 && a< 500000)
    {
        tax = (a*5)/100;
        System.out.println("tax of the employ is :"+tax);
    }
    else if (a>= 500000 && a<1000000)
    {
        tax = (a*20)/100;
        System.out.println("tax of the employ :"+tax);
    }
    else if (a>1000000)
    {
        tax = (a*30)/100;
        System.out.println("tax of the employ:"+tax);
    }
}  
}