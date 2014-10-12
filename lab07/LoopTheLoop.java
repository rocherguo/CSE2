////////////////////////////////////////
//Shen Guo
//CSE2
//Oct/10/2014
//Lab 07
//Loop the Loop Java Program
//print out stars
//  first compile the program
//      javac LoopTheLoop.java
//  run the program
//      java LoopTheLoop//

//  to use the Scanner class
import java.util.Scanner;

//  define a class
public class LoopTheLoop {
    
    //  main method required for every Java profram
    public static void main(String[] args) {

    //  start of while (true) 
    while (true)    {

    //  promp user to enter int
    Scanner scan = new Scanner (System.in);
    System.out.print ("Enter an int between 1 and 15- ");
    //  start of if (input is an int)
    if (scan.hasNextInt())  {
        int nStars = scan.nextInt();
        
        //  start of if (input is btw 1 and 15)
        if (nStars >= 1 && nStars <= 15)    {

        //  print total stars
        int n = 1;
        //  start of while 
        while (n <= nStars) {
            System.out.print ("*");
            n++;
        }   //  end of while (print total stars)
        System.out.print ("\n");
        
        //  print triangle with stars
        int x = 1;
        while (x <= nStars) {
            int y = 1;
            while (y <= x) {
            System.out.print ("*");
            y++;
            }
        System.out.print ("\n");
        x++;
        }   //  end of while (print triangle with stars)
        
        }   //  enf of if (input is btw 1 and 15)
    
        //  start of else (input is not btw 1 and 15)
        else    {
            System.out.println ("Your int was not in the range [1.15]");
            return;
        }   //  end of else (input is not btw 1 and 15)
    }   //  end of if (input is an int)
    
    //  start of else (input is not an int)
    else    {
        System.out.println ("You did not enter an int");
        return;
    }   //  end of else (input is not an int)

    //  to check if the user wants to continue
    System.out.print ("Enter y or Y to go again- ");
    String answer = scan.next();
    
    //  start of if (user does not want to continue)
    if (!answer.equals("Y") && !answer.equals("y"))   {
        break;
    }   //  end of if (user does not want to continue)
    }   //  end of while (true)     
    }   //  end of main method
}   //  end of class