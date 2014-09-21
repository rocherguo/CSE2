////////////////////////////////////////
//Shen Guo
//CSE2
//Sep/9/2014
//Lab 04
//BigMacAgain Java Program
//calculate the total cost of the meal
//  first compile the program
//      javac BigMacAgain.java
//  run the program
//      java BigMacAgain//

//to use the Scanner class
import java.util.Scanner;

//  define a class
public class BigMacAgain {
    
    //  main method required for every Java profram
        public static void main(String[] args) {
        Scanner myScanner;
        myScanner = new Scanner ( System.in);
        
        //  prompt the user to enter number of BigMac
        System.out.print("Enter the number of Big Macs : ");
        
        //  start of if (nBigMac is an int)
        if (myScanner.hasNextInt()) {  
            int nBigMac = myScanner.nextInt();
            //  start of if (nBigMac > 0)
            if (nBigMac > 0) {
               double price = 2.22;
               double costBigMac = (int) (price * nBigMac * 100) / 100.0;
               System.out.println ("You ordered " + nBigMac + " Big Macs for a cost of " + nBigMac + "x" + price + " = $" + costBigMac);
               
               //   start of process of fries
               System.out.print ("Do you want an oder of fries (Y/y/N/n) ?");
               String answer = myScanner.next();
               //   start of if customer wants fries
               if (answer.equals ("Y") || answer.equals ("y")){
                   System.out.println ("You ordered fries at a cost of $2.15");
                   System.out.println ("The total cost is $" + (costBigMac + 2.15));
               }    //  end of if customer wants fries
               //   start of if customer does not want fries
               else if (answer.equals ("N") || answer.equals ("n")){
               System.out.println ("The total cost of this meal is $" + costBigMac);
               }   //  end of if customer does not want fries
                //  start of else input is not valid
                else {
                    System.out.println("You did not enter one of 'y', 'Y', 'N', 'n'");
                    return; 
                }   //  end of else input is not valid
                
        }   //  end of if (nBigMac > 0)
        else {
            System.out.println ("You did not enter an int > 0");
            return;
        
        }   //  end of else (nBigMac < 0)
        }   //  end of if (nBigMac is an int)
        else {
            System.out.println ("You did not enter an int");
            return;
        }   //  end of else (nBigMac is not an int)
 //  leaves the program
                    
    } // end of main method
} //end of class