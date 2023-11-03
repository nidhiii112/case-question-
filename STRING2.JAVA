//program to write a string and print the nnumbers of vowels and consonents present in that string..

import java.util.*;
public class string2 {    
    public static void main(String[] args) {    
            
        int vCount = 0, cCount = 0;    
            
        //Declare a string    
        String str = "the java course is easy and nice from other languages";     
            
        //ConverT all strings to lower case    
        str = str.toLowerCase();      
            
        for(int i = 0; i < str.length(); i++) {    
            //check the string is vowels
            if(str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u') {      
                vCount++;    
            }    
            //Checks whether a character is a consonant     
            else if(str.charAt(i) >= 'a' && str.charAt(i)<='z') {        
                cCount++;    
            }     
        }  
        System.out.println("Number of vowels: " + vCount);      
        System.out.println("Number of consonants: " + cCount);    
    }     
}   
 
