////////////////////////////////////////////////////
//Shen Guo
//CSE2
//Sep/21/2014
//hw04
//Month Java Program
//display the number of days in the month
//  first compile the program
//      javac Month.java
//  run the program
//      java Month.java

//  to use the Scanner class
import java.util.Scanner;

//  define a class
public class Month  {
    
    // main method required for every Java Program
    public static void main(String[] args)  {
        Scanner myScanner;
        myScanner = new Scanner(System.in);
        
        //  promp the user to enter the month
        System.out.print ("Enter an int giving the number of the month (1-12)- ");
        
        //  start of if (month input is an int)
        if (myScanner.hasNextInt()) {
            int month = myScanner.nextInt();
        
            //  start of if (input is between 1-12)
            if (month >= 1 && month <= 12)  {
            
                //  start of if (the month has 31 days)
                if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month  == 10 || month == 12)  {
                    System.out.println ("The month has 31 days");
                }   //  end of if the month has 31 days
            
                //  start of else if (the month has 30 days)
                else if (month == 4 || month == 6 || month == 9 || month == 11) {
                    System.out.println ("The month has 30 days");
                }   //  end of else if the month has 30 days
            
                //  start of else (the month is February)
                else    {
                    System.out.print ("Enter an int giving the year ");
                        
                        //  start of if (year input is an int)
                        if (myScanner.hasNextInt()) {
                            int year = myScanner.nextInt();
                            
                                //  start of if (year input is positive)
                                if (year > 0)   {
                                    
                                    //  start of if (year is leap year)
                                    if (year % 4 == 0)   {
                                        System.out.println ("The month has 29 days");
                                    }   //  end of if (year is leap year)
                                    //  start of else (year is not leap year)
                                    
                                    else    {
                                        System.out.println ("The month has 28 days");
                                    }   //  end of else (year is not leap year)
                                
                                }   //  end of if (year input is positive)
                                
                                else    {
                                    System.out.println ("You did not enter a positive int");
                                    return;
                                }   //  end of else (year input is not positive)    
                            
                        }   //  end of if ( year input is an int)
                        
                        else    {
                            System.out.println ("You did not enter an int");
                            return;
                        }   //end of else (year input is not an int)
                
                }   //  end of else (the month is February)
        
            }   //  end of if (input is between 1-12)
            else    {
                System.out.println ("You did not enter an int between 1 and 12");
                return;
            }   //  end of else (input is not between 1-12)
        
        }   //  end of if (month imput is an int)
        else    {
            System.out.println ("You did not enter an int");
            return;
        }   //  end of else (input is not an int)
        
    }   //  end of main method
}   //  end of class