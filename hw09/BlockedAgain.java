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
    System.out.print("Enter an int between 1 and 9, inclusive: ");
    Scanner scan = new Scanner (System.in);
    String input = scan.next();
    while (true)    {
        if (checkInt(input) == true) {
            int n = Integer.parseInt(input);
            if (checkRange(n) == true)   {
                return n;
            }
            else    {
                System.out.print ("You did not enter an int in [1,9]; try again: ");
                input = scan.next();
            }
        }
        else    {
            System.out.print ("You did not enter an int; try again: ");
            input = scan.next();
        }
    }   //  end of while
}   //  end of getInt() method

    //  start of checkInt() method
    public static boolean checkInt(String n)   {
        try{
            Integer.parseInt(n);
        }catch (NumberFormatException e)    {
            return false;
        }
        return true;
    }   //  end of checkInt() method

    //  start of checkRange() method
    public static boolean checkRange(int n)     {
        if (n>=1 && n<=9)   {
            return true;
        }
        else    {
            return false;
        }
    }   //  end of checkRange() method

    //  start of allBlocks() method
    public static void allBlocks (int n) {
    for (int i=1; i<=n; i++)    {
        block (n,i);
    }    
    }   //  end of allBlocks() method

    //  start of block() method
    public static void block (int n, int i) {
        for (int j=1; j<=i+1; j++)    {
        line (n,i,j);
        System.out.print ("\n");
        }
    }   //  end of block() method
    
    //  start of line() method
    public static void line (int n, int i, int j)  {
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
    }   //  end of line() method
}   //  end of class