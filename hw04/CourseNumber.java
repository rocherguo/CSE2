////////////////////////////////////////////////////
//Shen Guo
//CSE2
//Sep/21/2014
//hw04
//Course Number Java Program
//display the semester and the year
//  first compile the program
//      javac CourseNumber.java
//  run the program
//      java CourseNumber

//  to use the Scanner class
import java.util.Scanner;

//  define a class
public class CourseNumber {
    
    //  main method required for every Java Program
    public static void main(String[] args)  {
        Scanner myScanner;
        myScanner = new Scanner(System.in);
        
        //  prompt the user to enter the course number
        System.out.print ("Enter a six digit number giving the course semester- ");
        int coursenumber = myScanner.nextInt();
        int year = (int) (coursenumber / 100);
        int semester = coursenumber - year * 100;
        
        //  start of if (year is within rage)
        if (year >= 1865 && year <= 2014)   {
            
            //  start of if (semester is legitimate)
            if (semester == 10 || semester == 20 || semester == 30 || semester == 40)    {
            
                //  start of if (spring semester)
                if (semester == 10)  {
                    System.out.println ("The course was offered in the Spring semester of " + year);
                }   //  end of if (spring semester)
            
                //  start of else if (summer 1 semester)
                else if (semester == 20)   {
                    System.out.println ("The course was offered in Summer 1 semester of " + year);
                }   //  end of else if (summer 1 semester)
        
                //  start of if (summer 2 semester)
                else if (semester == 30)  {
                    System.out.println ("The course was offered in the Summer 2 semester of " + year);
                }   //  end of else if (summer 2 semester)
            
                //  start of else (fall semester)
                else  {
                    System.out.println ("The course was offered in the Fall semester of " + year);
                }   //  end of else (Fall semester)
                
            }   //  end of if (semester is legitimate)
            
            //  start of else (semester is not legitimate)
            else    {
                System.out.println (semester + " is not a legitimate semester");
                return;
            }   //  end of else (semester is not legitimate)

         }   //  end of if (year is within rage)
        
         // start of else (year is outside the range)
         else   {
             System.out.println ("The number was outside the range [186510,201440]");
         }  //  end of else (year is outside the range)
        
    }   //  end of main method
}   //  end of class