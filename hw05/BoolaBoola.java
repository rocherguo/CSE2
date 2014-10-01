//////////////////////////////
//Shen Guo
//CSE2
//Sep/29/2014
//hw05
//BoolaBoola Java Program
//randomly combine three true or faluse variables with random choices of && and || and stores the result
//  first compile the program
//      javac BoolaBoola.java
//  run the program
//      java BoolaBoola//

//to use the Scanner class
import java.util.Scanner;

//  define a class
public class BoolaBoola {
    
    //  main method required for every Java profram
        public static void main(String[] args) {
        Scanner myScanner;
        myScanner = new Scanner ( System.in);

        boolean A = true;
        boolean B = true;
        boolean C = true;
        boolean answer = true;
        String and = "&&";
        String or = "||";
        int a = (int) (Math.random() * 2);
        int b = (int) (Math.random() * 2);
        int c = (int) (Math.random() * 2);
        int d = (int) (Math.random() * 4);
        
        //  start of switch int a
        switch (a % 2)  {
            case 0: A = true;
            break;
            case 1: A = false;
            break;
        }   //  end of switch int a
        
        //  start of switch int b
        switch (b % 2)  {
            case 0: B = true;
            break;
            case 1: B = false;
            break;
        }   //  end of switch int b
        
        //  start of switch int c
        switch (c % 2)  {
            case 0: C = true;
            break;
            case 1: C = false;
            break;
        }   //  end of switch int c
        
        //  start of switch int d
        switch (d % 4)  {
            case 0: answer = A && B && C;
            break;
            case 1: answer = A && B || C;
            break;
            case 2: answer = A || B || C;
            break;
            case 3: answer = A || B && C;
            break;
        }   //  end of switch int d

        //  prompt the user for input
        System.out.print ("Does " + A + " " + and + " " + B + " " + or + " "+ C + " have the value true(t/T) or false(f/F)?");
        String input = myScanner.next();
        
        //  start of if input is "true"
        if (input.equals ("T") || input.equals ("t")) {
            boolean i = true;
            
            //  start of if input is correct
            if (i = answer) {
                System.out.println ("Correct");
            }   //  end of if input is correct
            
            //  start of else input is wrong
            else {
                System.out.println ("Wrong; try again");
            }   //  end of else input is wrong
        }   //  end of if input is "true"
        
        //  start of else if input is "false"
        else if (input.equals ("F") || input.equals ("f")){
            boolean i = false;

            //  start of if input is correct
            if (i = answer) {
                System.out.println ("Correct");
            }   //  end of if input is correct
            
            //  start of else input is wrong
            else {
                System.out.println ("Wrong; try again");
            }   //  end of else input is wrong
        }   //  end of else if input is "false" 
        
        //  start of else input is not legit
        else    {
            System.out.println ("Wrong; try again");
        }   //  end of else input is not legit
        }   //  end of main method           
}   //  end of class
