//program to find whether the year is a leap or not
import java.util.Scanner;
import java.util.*;
public class elseif4 {
    public static void main(String []args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("enter a year");
        int year = obj.nextInt();
        //condition to find leap year are 
        if (year%4==0)
        System.out.println("This year is a leap year");
        else 
        System.out.println("this year is not a leap year ");
    }
    }

