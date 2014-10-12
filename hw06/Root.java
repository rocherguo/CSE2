////////////////////////////////////////
//Shen Guo
//CSE2
//Oct/12/2014
//hw 06
//Root Java Program
//compute the square root of a number using bisection method
//  compile the program
//      javac Root.java
//  run the program
//      java Root//

//  to use the Scanner class
import java.util.Scanner;

//  define a class
public class Root {
    
    //  main method required for every Java profram
    public static void main(String[] args) {

    //  prompt the user to enter the double
    System.out.print ("Enter an double greater than 0- ");
    Scanner scan = new Scanner (System.in);
    double x = scan.nextDouble();
    
    if (x > 0)  {   //  start of if (input is greater than 0)
        double low = 0;
        double high = 1 + x;
        double middle = (low + high) / 2;

        while ((high - low) > 0.0000001 * high)    {   //  start of while
            if (middle * middle > x)    {   //  start of if
                high = middle;
            }   //  end of if
            else    {   //  start of else
                low = middle;
            }   //  end of else
        }   //  end of while
        
        //  print out the outcome
        System.out.println ("The root is: " + middle); 
    }   //  end of if (input is greater than 0)
    
    else {  //  start of else (input is smaller than 0)
        System.out.println ("You did not enter an double greater than 0");
        return;
    }  //  end of else (input is smaller than 0)

    }   //  end of main method
}   //  end of class