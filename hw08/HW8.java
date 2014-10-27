///////////////////////////////////////////////
//Shen Guo
//CSE 2
//Oct 26
//hw 08
//test out the functionality of methods before using the methods in a full-blown program

import java.util.Scanner;
public class HW8{
  public static void main(String []arg){
	char input;
Scanner scan=new Scanner(System.in);
	System.out.print("Enter 'C' or 'c' to continue, anything else to quit- ");
	input=getInput(scan,"Cc");
	System.out.println("You entered '"+input+"'");
	System.out.print("Enter 'y', 'Y', 'n', or 'N'- ");
	input=getInput(scan,"yYnN",5); //give up after 5 attempts
	if(input!=' '){
   	System.out.println("You entered '"+input+"'");
	}
	input=getInput(scan,"Choose a digit.","0123456789");
	System.out.println("You entered '"+input+"'");
    }   //  end of main method

          //  starting to define the first getInput() method
    public static char getInput(Scanner scan, String a)  {
        String input = scan.next();
        while (true)    {
            if (input.length() == 1)    {
                if (input.charAt(0) == a.charAt(0) || input.charAt(0) == a.charAt(1)){
                    return input.charAt(0);                    
                }
                else    {
                    System.out.print ("You did not enter a character from the list '" + a + "'; try again- ");
                    input = scan.next();
                }
            }    
            else    {
               
                System.out.print ("You should enter exactly one character- ");
                input = scan.next();
            }
        }   //  end of while
    }   //  end of defining the first getInput() method

          //  starting to define the second getInput() method
    public static char getInput (Scanner scan, String a, int n)  {
        String input = scan.next();
        
        int i = 1;
        while (i <= n)    {
            if (input.length() == 1)    {
                if (input.charAt(0) == a.charAt(0) || input.charAt(0) == a.charAt(1) || input.charAt(0) == a.charAt(2) || input.charAt(0) == a.charAt(3))   {
                    return input.charAt(0); 
                }
                else    {
                    System.out.print ("You did not enter a character from the list '" + a + "'; try again- ");
                    input = scan.next();
                    i++;
                }
            }
            else    {
                System.out.print ("You should enter exactly one character- ");
                input = scan.next();
                i++;
            }
        }
        System.out.println ("You failed after " + n + " tries");
        return ' ';
    }   //  end of defining the second getInput() method

          //  starting to define the third getInput() method
    public static char getInput (Scanner scan, String a, String b)  {

        System.out.println (a);
        System.out.print ("Enter one of: '0', '1', '2', '3', '4', '5', '6', '7', '8', '9'- ");
        String input = scan.next();
        
        while (true)    {
            if (input.length() == 1)    {
                if (input.charAt(0) == b.charAt(0) || input.charAt(0) == b.charAt(1) || input.charAt(0) == b.charAt(2) || input.charAt(0) == b.charAt(3) || input.charAt(0) == b.charAt(4) || input.charAt(0) == b.charAt(5) || input.charAt(0) == b.charAt(6) || input.charAt(0) == b.charAt(7) || input.charAt(0) == b.charAt(8) || input.charAt(0) == b.charAt(9))   {
                    return input.charAt(0);
                }
                else    {
                    System.out.println ("You did not enter an acceptable character");
                    System.out.println (a);
                    System.out.print ("Enter one of: '0', '1', '2', '3', '4', '5', '6', '7', '8', '9'- ");
                    input = scan.next();
                }
            }
            else    {
                System.out.println ("Enter exactly one character");
                System.out.println (a);
                System.out.print ("Enter one of: '0', '1', '2', '3', '4', '5', '6', '7', '8', '9'- ");
                input = scan.next();
            }
        }
    }   //  end of defining the third getInput() method
    
}   //  end of class
