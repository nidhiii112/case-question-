//program to find out wheather a given integer is present in an array or not
import java.util.Scanner;
public class array2{
    public static void main(String[]args) {
        Scanner obj = new Scanner(System.in);
        //declare the numbers which present in array
        int[] array= {10,20,30,40,50,60,70,80,90};
        System.out.println("enter the integer");
        //take the input from user
        int num = obj.nextInt();
        for(int i=0;i<array.length;i++)
        {
        if(num==array[i]){
            
            System.out.println("given integer is present in the array");
        }
    }
  }
}
