//program to print the nth term of the fibonacci series using recursion
import java.util.*;
public class recursion1{
    public static void main(String []args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("enetr the number :");
        int num = obj.nextInt();
        for (int i=0; i<num ; i++)
        {
            System.out.println(fibonacci(i)+ " ");
        }
    }//condition for recursion
    public static  int fibonacci(int num) {
        if(num<2)
        return num;
        //to find fibonacci= fibonacci(n-1) + fibonacci(n-2)
        return fibonacci(num-1)+fibonacci(num-2);
        
    }
}