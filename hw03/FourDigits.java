//////////////////////////////////
//Shen Guo
//CSE2
//Sep/12/2014
//hw03
//Four Digit Java Program
//print out the first four digits to the right of the decimal point

//  first compile the program
//      javac FourDigits.java
//  run the program
//      java FourDigits//

import java.util.Scanner;
//  define a class
public class FourDigits {
    // main method 
     public static void main(String[] args) {
        Scanner myScanner;
        myScanner = new Scanner(System.in);
        
        //prompt users to enter a double
        System.out.print("Enter a double and I display the four digits to the right of the decimal point- ");
        double number = myScanner.nextDouble();
        
        //compute the four digits using %
        int a = ((int) (number * 10)) % 10;
        int b = ((int) (number * 100)) % 10;
        int c = (int) (number * 1000) % 10;
        int d = (int) (number * 10000) % 10;
        
        //print out the four digits
        System.out.print("The four digits are " +a+b+c+d );
        


    } //end of main method
    
} // end of class