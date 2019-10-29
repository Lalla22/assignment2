
/**
 * Implement a function to check if an input is a palindrome. 
 *
 * @author Lalla Sankara
 * @version 10/29/2019
 */
import java.util.Stack;
import java.util.Scanner;
public class Palindrome
{
    public static void main (String [] args)
    {
     //Write what you want user to type into scanner   
     System.out.print("Enter String");
     
     //Implepment scanner
     Scanner in = new Scanner(System.in);
     String inputString = in.nextLine();
     
     //create new stack 
     Stack<Character> stack = new Stack<Character>();
    
     //checks the string and push all characters of string to stack
     for (int i=0;i<inputString.length();  i++) {
         char character = inputString.charAt(i);
         stack.push(character);
        }
        
     //declaring the reverse input string
     String reverseString = "";
     
     //the resverse input string the checks palindrome backwards 
      while (!stack.isEmpty()) {
            reverseString = reverseString+stack.pop();
        }
       //print out result if palindrome or not while also calling isPalindrome method 
        if (isPalindrome(inputString, reverseString)){
            System.out.println(inputString+" is a palindrome");
        }
        else {
           System.out.println(inputString+" is NOT a palindrome"); 
        }
    }
     public static boolean isPalindrome(String inputString, String reverseString)
      {
         //boolean method that sees if inputString is equal to reverseString
         // and is a paldindrome
         //returns back true or false if it is or it is not a palindrome. 
         
         if (inputString.equals(reverseString))
         {
             return true;   
            }
            else
            return false;
           
            }
      
  }
     

