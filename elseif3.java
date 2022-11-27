//program to find out the student is pass or fail
import java.util.*;
import java.util.Scanner;
public class elseif3 {
    public static void main(String[] args) {
        Scanner obj = new Scanner (System.in);
        int subject_marks ;
        int percentage;
        //INTER THE MARKS OF THREE SUBJECT
        System.out.println("enter the marks of three subject :");
        int a = obj.nextInt ();
        int b = obj.nextInt ();
        int c = obj.nextInt ();
        int total = (a+b+c)/3;
        System.out.println("total percentage is :"+total);
        //it requires a total of 40% and atleast 33% in each subject so,
        if ( total >= 40 && a>= 33 && b>= 33 && c>= 33 )
        {
             System.out.println("student is passed");
        }
        else 
        System.out.println("student is fail");

    }
}
