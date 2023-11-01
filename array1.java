//program to calculate array of 5 floats and their sum
import java.util.*;
public class array1{
    public static void main(String[]args) {
        float sum=0; 
        int i;
        float [] a=new float[5];
        a[0]=70.7f;
        a[1]=85.9f;
        a[2]=45.10f;
        a[3]=98.9f;
        a[4]=12.33f;
        for(i=0;i<5;i++)
        {
            sum =sum+a[i];
        } 
        System.out.println("sum of elements are:"+sum);
 
    }
    
}
 
