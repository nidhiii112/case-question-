/*program with a method named getTotal that accepts two integers a an argument and
return its sum.call this method from main() and print the result */
import java.util.*;
public class methods1{
    
    public static void main(String[]args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("enter the two numbers");
        int a= obj.nextInt();
        int b = obj.nextInt();
        int sum = getTotal(a,b);
        System.out.println("sum :"+sum);
    }

    private static int getTotal(int a, int b) {
        return a+b;
    }
    
}
 
