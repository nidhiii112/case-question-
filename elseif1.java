//program to find out the day of the week given by number
import java.util.*;
import java.util.Scanner;
public class elseif1 {
    public static void main(String[]args) {
    Scanner obj = new Scanner (System.in);
    System.out.println(" enter the integer number:");
    int num = obj.nextInt();
    //by using switch case condition
    switch (num)
    {
        case 1:
        System.out.println("Monday");
        break;
        case 2:
        System.out.println("Tuesday");
        break;
        case 3:
        System.out.println("Wednesday");
        break;
        case 4:
        System.out.println("Thursday");
        break;
        case 5:
        System.out.println("Friday");
        break;
        case 6:
        System.out.println("Saturday");
        break;
        case 7:
        System.out.println("Sunday");
        break;
        default:
        System.out.println("number entered is out of range:");
    }        
  }
    
}
