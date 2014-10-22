////////////////////////////////////////
//Shen Guo
//CSE2
//Oct/19/2014
//hw 07
//Number Stack Java Program
//print out pattern according to user's input
//  compile the program
//      javac NumberStack.java
//  run the program
//      java NumberStack//

//  to use the Scanner class
import java.util.Scanner;

//  define a class
public class NumberStack {
    
    //  main method required for every Java profram
    public static void main(String[] args) {

    //  prompt the user to ernter an int
    System.out.print ("Enter a number between 1 and 9- ");
    Scanner scan = new Scanner (System.in);
    int n = scan.nextInt();
    
    //  validate the input as an interger or prompt the user to enter again
    while (n<1 || n>9)  {
        System.out.println ("You did not enter an Int.");
        System.out.print ("Enter a number between 1 and 9- ");
        n = scan.nextInt();
    }
    
    //  using for loops to print
    System.out.println ("Using for loops:");
    for (int i=1; i<=n; i++)    {
        for (int j=1; j<=i+1; j++)    {
            for (int k=0; k<n-i; k++)   {
                System.out.print (" ");
            }
            for (int l=1; l<=2*i-1; l++)    {
                if (j==i+1) {
                    System.out.print ("-");
                }
                else {
                    System.out.print (i);
                }
            }
            System.out.println ();
        }
    }
    
    //  using while loops to print
    System.out.println ("Using while loops: ");
    int i=1;
    while (i<=n)    {
       int j=1;
       while (j<=i+1)   {
           j++;
           int k=0;
           while (k<n-i)    {
               k++;
               System.out.print (" ");
           }
           int l=1;
           while (l<=2*i-1) {
               if (j==i+2)  {
                   System.out.print ("-");
               }
               else {
                   System.out.print (i);
                }
               l++;
           }
           System.out.println ();
       }
       i++;
    }
    
    //  using do-while loops
    System.out.println ("Using do-while loops: ");
    i = 1; 
    int j = 1;
    int k = 0;
    int l = 1;
    
    do{
        j=1;
        do  {
            j++;
            k=0;
            if (i!=n)   {   //  start of if (skipping the space before n=i)
                do  {
                    k++;
                    System.out.print (" ");
                }   while (k<=n-i-1);
            }   //  end of if (skipping the space before n=i)
            l=1;
            do {
                if (j==i+2)  {
                    System.out.print ("-");
                }
                else {
                    System.out.print (i);
                }
                l++;
            }   while (l<=2*i-1);
            System.out.println ();
        }   while (j<=i+1);
        i++;
    }   while (i<=n);    
    }   //  end of main method
}   //  end of class