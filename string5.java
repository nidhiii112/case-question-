//program to detect the double and triple spaces in a string
import java.util.*;
import java.util.Scanner;
public class string5 {
public static void main(String[] args) {
    //enter the input 
    String str = "My name is Nidhi Singh";
    //to detect double and triplespace 
    str = str .replaceAll(" ","  ");
    System.out.println(str);
    str = str .replaceAll(" ","   ");
    System.out.println(str);
}
}