//////////////////////////////////
//Shen Guo
//CSE2
//Sep/12/2014
//hw03
//Root Java Program
//compute crude estimate of the cube root and the value of this crude guess when cubed

//  first compile the program
//      javac Root.java
//  run the program
//      java Root//

import java.util.Scanner;
//  define a class
public class Root {
    // main method 
     public static void main(String[] args) {
        Scanner myScanner;
        myScanner = new Scanner(System.in);
        
        //  prompt users to input a double
        System.out.print ("Enter a double, and I print its cube root- ");
        double number = myScanner.nextDouble();
        
        //  calculation
        //  the first guess is the square root is number / 3
        double guess1 = number / 3;
        
        //  the second guess is (guess * guess * guess + number) / (3 * guess * guess)
        double guess2 = (guess1 * guess1 * guess1 + number) / (3 * guess1 * guess1);
        
        //  the third guess
        double guess3 = (2 * guess2 * guess2 * guess2 + number) / (3 * guess2 * guess2);
        
        //  the fourth guess
        double guess4 = (2 * guess3 * guess3 * guess3 + number) / (3 * guess3 * guess3);
        
        //  the fifth guess
        double guess5 = (2* guess4 * guess4 * guess4 + number) / (3 * guess4 * guess4);
        
        //  calculate the value of this crude guess when cubed
        double value = guess5 * guess5 * guess5;        
        
        // Print out the result
        System.out.println ("The cube root is " + guess5 + " :");
        System.out.println (guess5*guess5*guess5 + "=" + value);

        }   //end of main methid

}   //end of class