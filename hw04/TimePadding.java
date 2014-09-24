////////////////////////////////////////////////////
//Shen Guo
//CSE2
//Sep/21/2014
//hw04
//TimePadding Java Program
//display the time in convoentional form
//  first compile the program
//      javac TimePadding.java
//  run the program
//      java TimePadding.java

//  to use the Scanner class
import java.util.Scanner;

//  define a class
public class TimePadding    {
    
    // main method required for every Java Program
    public static void main(String[] args)  {
        Scanner myScanner;
        myScanner = new Scanner(System.in);
      
    // prompt the user to enter the time in seconds
    System.out.print ("Enter the time in seconds : ");
    int number = myScanner.nextInt();
    int hours = (int) (number / 3600);
    int minutes = (int) ((number - hours * 3600) / 60);
    int seconds = (int) (number - hours * 3600 - minutes * 60);
    
    //  start of if (minutes <= 9)
    if (minutes <= 9)   {
        
        //  start of if (seconds <= 9)
        if (seconds <= 9)   {
            System.out.println ("The time is " + hours + ":0" + minutes + ":0" + seconds);
        }   //  end of if (seconds <= 9)
        //  start of else (seconds > 9)
        else    {
            System.out.println ("The time is " + hours + ":0" + minutes + seconds);
        }   //  end of else (seconds > 9)
    }   //  end of if (minutes <= 9)
    
    //  start of else (minutes > 9)
    else    {
        System.out.println ("The time is " + hours + minutes + seconds);
    }   //  end of else (minutes > 9)
    
        
    }   //  end of main method
}   //  end of class