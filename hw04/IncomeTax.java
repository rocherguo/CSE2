////////////////////////////////////////////////////
//Shen Guo
//CSE2
//Sep/21/2014
//hw04
//IncomeTax Java Program
//calculatet the amount of tax on the income
//  first compile the program
//      javac IncomeTax.java
//  run the program
//      java IncomeTax.java

//  to use the Scanner class
import java.util.Scanner;

//  define a class
public class IncomeTax  {
    
    // main method required for every Java Program
    public static void main(String[] args)  {
        Scanner myScanner;
        myScanner = new Scanner(System.in);
        
        //  promp the user to enter the number of income
        System.out.print ("Enter an int giving the number of thousands- ");
        
        //  start of if (input is an int)
        if (myScanner.hasNextInt()) {
            int income = myScanner.nextInt();
            
            //  start of if (input is positive)
            if (income >0) {
        
                //  start of if (income < 20)
                if (income < 20)    {
                    double incomerate = 50;
                    System.out.println ("The tax rate on $" + income*1000 + " is 5.0%, and the tax is $" + income * incomerate);
                }   //  end of (if income < 20)
            
                //  start of else if (20 =< income < 40)
                else if (income >= 20 && income < 40)  {
                    double incomerate = 70;
                    System.out.println ("The tax rate on $" + income*1000 + " is 7.0%, and the tax is $" + income * incomerate); 
                }   // end of else if (20 =< income < 40)
            
                //  start of else if (40 =< income < 78)
                else if (income >= 40 && income < 78)  {
                    double incomerate = 120;
                    System.out.println ("The tax rate on $" + income*1000 + " is 12.0%, and the tax is $" + income * incomerate);
                }   //  end of else if (40 =< income < 78)   
            
                // start of else if (income >= 78)
                else    {
                    double incomerate = 140;
                    System.out.println ("The tax rate on $" + income*1000 + " is 14.0%, and the tax is $" + income * incomerate);
                }   //  end of else if (income >= 78)

            }   //  end of if (input is positive)
            
            //  start of else (input is not positive)
            else    {
                System.out.println ("You did not enter a positive int");
                return;
            }   //end of else (input is not positive)

        }   //  end of (if input is an int)
        
        //  start of else (input is not an int)
        else    {
            System.out.println ("You did not enter an int");
            return;
        }   // end of else (input is not an int)
    }   //  end of main method
}   //  end of class