/*program to fill in letter tamplet which looks like
letter = "dear<|name|.,Thanks a lot"
Replace <|name|> with string ( some name)*/
import java.util.*;
public class string6{
    public static void main(String[]args) {
        String str= "dear name , thanks a lot";
        System.out.println(str.replaceAll("name", "Nidhi"));
        
    }
}