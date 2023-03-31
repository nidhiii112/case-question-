/*   program to ptint pattern
 *   ****
 *   ***
 *   **
 *   *
 */
import java.util.*;
public class pattern2{
    public static void main(String[]args) {
    int i ,j;   //i for row and j for columns
    for (i=0;i<4; i++) { // outer loop for row
        //inner loop for columns
        for (j=0 ; j>=i ; j--)
        {
            //print star
            System.out.print("*");
        }
        //For get the curser in new line after printing each line
        System.out.println();
    }
    }
}                                            //problem


