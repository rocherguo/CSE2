////////////////////////////////////////
//Shen Guo
//CSE2
//Nov/1/2014
//hw 09
//Blocked Again Java Program
//print out pattern according to user's input
//  compile the program
//      javac BlockedAgain.java
//  run the program
//      java BlockedAgain


import java.util.Scanner;
public class BlockedAgain{
    public static void main(String []s){
        int m;
        //force user to enter int in range 1-9, inclusive.
        m = getInt(); 
        allBlocks(m);
    }   //  end of main method

//  start of getInt() method;
public static int getInt()    {
    System.out.print("Enter an int between 1 and 9, inclusive: ");  //  prompt user to input
    Scanner scan = new Scanner (System.in);     //  read input
    String input = scan.next();     //  call the input "input"
    while (true)    {   //  start of infinite loop
        if (checkInt(input) == true) {  //  start of if input is an int by calling checkInt method
            int n = Integer.parseInt(input);    //  transfer input into an int
            if (checkRange(n) == true)   {  //  start of if n is in acceptable range by calling checkRange method
                return n;   //  returning the validated input
            }   //  end of if n is in acceptable range
            else    {   //  start of else n is not in acceptable range
                System.out.print ("You did not enter an int in [1,9]; try again: ");    //  prompt the user to re-enter
                input = scan.next();    //  re-read the new input
            }   //  end of else n is not in acceptable range
        }   //  end of if input is an int
        else    {   //  start of else input is not an int
            System.out.print ("You did not enter an int; try again: ");    //  prompt the user to re-enter
            input = scan.next();    //  re-read the new input
        }   //  end of else input is not an int
    }   //  end of while
}   //  end of getInt() method

    //  start of checkInt() method
    public static boolean checkInt(String n)   {
        try{    //  cheking if n is an int
            Integer.parseInt(n);
        }catch (NumberFormatException e)    {
            return false;   //  not an int
        }
        return true;    //  is an int
    }   //  end of checkInt() method

    //  start of checkRange() method
    public static boolean checkRange(int n)     {
        if (n>=1 && n<=9)   {  //  start of if n is within acceptable range
            return true;    //  is within range
        }   //  end of if n is within acceptable range
        else    {   //  start of else n is not within acceptable range
            return false;   //  is not within range
        }   //  end of else n is not within acceptable range
    }   //  end of checkRange() method

    //  start of allBlocks() method
    public static void allBlocks (int n) {
        for (int i=1; i<=n; i++)    {   //  start of loop
            block (n,i);    //  print the correct format by calling block method
        }   //  end of loop    
    }   //  end of allBlocks() method

    //  start of block() method
    public static void block (int n, int i) {
        for (int j=1; j<=i+1; j++)    {     //  start of loop
            line (n,i,j);   //  determing the right place to change lines
            System.out.print ("\n");    
        }   //  end of loop
    }   //  end of block() method
    
    //  start of line() method
    public static void line (int n, int i, int j)  {
            for (int k=0; k<n-i; k++)   {   //  start of loop
                System.out.print (" ");     //  print out space when needed
            }   //  end of loop
            for (int l=1; l<=2*i-1; l++)    {   //  start of loop
                if (j==i+1)  { //   start of if
                    System.out.print ("-"); //  print out dash when neede
                }   //  end of if
                else    {   //  start of else
                    System.out.print (i);   //  print out number when neede
                }   //  end of else
            }   //  end of loop
    }   //  end of line() method
}   //  end of class