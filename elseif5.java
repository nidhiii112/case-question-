//program to find out the type of website from the url..
import java.util.*;
import java.util.Scanner;
public class elseif5 {
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the website:");
        String website = sc.next();
        //now conditions
        if (website.endsWith(".org")){
            System.out.println("this is an organizational website");
        }
        else if (website.endsWith(".com")){
            System.out.println("this is an commercial website");
        }
        else if (website.endsWith(".in")){
            System.out.println("this is an indian website");
        }
        else 
        System.out.println("not a website or data not given");
    }
}

