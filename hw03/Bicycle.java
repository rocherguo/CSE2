//////////////////////////////////
//Shen Guo
//CSE2
//Sep/11/2014
//hw03
//Bicycle Java Program
//compute distance traveled and the average miles per hour

//  first compile the program
//      javac Bicycle.java
//  run the program
//      java Bicycle//

import java.util.Scanner;
//  define a class
public class Bicycle {
    // main method 
     public static void main(String[] args) {
        Scanner myScanner;
        myScanner = new Scanner(System.in);
        System.out.print("Enter the number of seconds: ");
        int secs = myScanner.nextInt();
        System.out.print("Enter the number of counts: ");
        int counts = myScanner.nextInt();
        
        //known information
        double wheelDiameter = 27.0;
        double PI = 3.14159;
        double feetPerMile = 5280;
        double inchesPerFoot = -12;
        
        //compute each output without moving decimals
        double distance = counts * wheelDiameter * PI / inchesPerFoot / feetPerMile;
        double time = secs / 60;
        double mph = distance / time * 60;
        
        //to print numbers with correct decimal points
        double a = (int) (distance * 100);
        double b = (int) (time * 10);
        double c = (int) (mph * 100);
    
        //ourprints
        System.out.println ("The distance was " + (a / 100) + " miles and took " + (b / 10) + " minutes.");
        System.out.println ("The average mph was " + (c / 100));
         
     }  //end of main method
         
}   //end of class