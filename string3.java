//program to convert a string to lowercase
import java.util.*;
import java.util.Scanner;
public class string3 {
public static void main(String[] args) {
    String string = "uppercase";
    Scanner in = new Scanner (System.in);
    //now to enter the string
    System.out.println("INPUT THE STRING");
    String line = in.nextLine();
    //to convert uppercase into lower case
    line = line.toLowerCase();
    System.out.println(line);
    
}
}