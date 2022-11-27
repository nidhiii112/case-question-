/*write a method named isEven that accepts an int argument . The method should 
 * return true if the argument is even or false otherwise .also write a program 
 * to test your method
 */
import java.util.*;
public class methods2{
    public static void main(String[]args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("ENTER AN INTEGER:");
        int a=obj.nextInt();
        if(isEven(a)){
        System.out.println("the number is even");
        }
        else{
            System.out.println("the number is odd");
        }
    }
    public static boolean isEven(int a)
    {
        if(a%2 ==0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

}