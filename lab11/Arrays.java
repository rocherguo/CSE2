////////////////////
//Shen Guo
//CSE 2
//Nov 12 2014
//lab 11
//Arrays java program

import java.util.Scanner;

public class Arrays {
    public static void main(String [] args) {
        final int NumberOfInputs = 10;
        int [] input = new int[NumberOfInputs];
        int sum = 0;
        int min = 0;
        int max = 0;

        System.out.print ("Enter 10 ints- ");
        Scanner scan = new Scanner (System.in);
        for (int i=0; i<NumberOfInputs;i++) {
            input [i]=scan.nextInt();
            sum += input [i];
        }   
        System.out.println ("The lowest entry is " + lowest(input));
        System.out.println ("The highest entry is " + highest(input));
        System.out.println ("The sum is " + sum);
        
        int [] inverse = new int[NumberOfInputs];
        for (int i=0; i<10; i++){
            inverse [i] = input [9-i];
        }
        
        for (int i=0; i<NumberOfInputs; i++)   {
        System.out.println (" " + input[i] + " " + inverse[i]);
        }
    }   //  end of main method
    
    public static int lowest (int[] input)  {
        int min = input [0];
        for (int i=1; i<input.length;i++)   {
            if (input[i]<min){
                min = input[i];
            }   //  end of if
        }   //  end of loop
        return min;
    }   //  end of lowest method
    
    public static int highest (int[] input) {
        int max = input [0];
        for (int i=1; i<input.length;i++)   {
            if (input[i]>max){
                max = input[i];
            }   //  end of if
        }   //  end of loop
        return max;
    }   //  end of highest method
}   //  end of class