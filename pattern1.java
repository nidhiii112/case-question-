/*program to print the pattern
   *
  **
 ***
****            */
import java.util.*;
public class pattern1{
    public static void main(String[]args) {
    int i ,j;   //i for row and j for columns
    for (i=0;i<4; i++)  // outer loop for rows
    {
        //inner loop work for space
        for (j=1*(4-i) ; j>=i ; j--)
        {
            //print space between two stars
            System.out.print(" ");
        }
        //inner loop for columns
        for (j=0 ; j<=i ; j++)
        {
            //print star
            System.out.print("*");
        }
        //for get the curser in new line after printing each line
        System.out.println();
    }
    }
}