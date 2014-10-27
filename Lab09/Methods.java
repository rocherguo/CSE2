///////////////////////////////////////////////
//Shen Guo
//CSE 2
//Oct 24
//lab 08
//generate three methods

//  main method copied from coursesite
import java.util.Scanner;
public class Methods{
    
    public static void main(String [] arg){
	Scanner scan=new Scanner(System.in);
	int a,b,c;
	System.out.print("Enter three ints- "); //  changed the outprint format to match the sample run
	a=getInt(scan);
	System.out.print("Enter an int- ");
	b=getInt(scan);
	System.out.print("Enter an int- ");
	c=getInt(scan);
	System.out.println("The larger of "+a+" and "+b+" is "+larger(a,b));
	System.out.println("The larger of "+a+", "+b+", and "+c+
                   	" is "+larger(a,larger(b,c)));
	System.out.println("It is "+ascending(a,b,c)+" that "+a+", "+b+
                   	", and "+c+" are in ascending order");
    }
    //  end of copied main method
  
      //  starting to define getInt() method
    public static int getInt(Scanner scan)  {
        while (!scan.hasNextInt())   {
            System.out.print ("You did not enter an int; try again- ");
            scan.next();
        }
        int input = scan.nextInt();
        return input;
    }   //  end of defining getInt() method
    
    //  starting to define larger() method
    public static int larger(int num1, int num2)    {
        int result = 0;
        if (num1 > num2)
            result = num1;
        else
            result = num2;
        return result;
    }   //  end of defining larger() method
    
    //  starting to define ascending() class
    public static boolean ascending(double a, double b, double c)    {
        if (a >= b && b >= c)
            return true;
        else
            return false;
    }   //  end of defining ascending() class
}   //  end of class