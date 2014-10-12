//////////////////////////////////////
//Shen Guo
//CSE2
//Oct/10/2014
//Lab 06
//Bug Spray Enigma1


/* The user is supposed to enter a number between 0 and 99.
 * The program interprets that as a percentage, converts it to
 * a prorportion and then displays the proportion (out of 1) 
 * remaining. It does not always work. Find out when it doesn't
 */

import java.util.Scanner;
public class Enigma1{
  public static void main(String []arg){
    double percent;
    System.out.print("Enter a value for the percent (0, 1,...99)- ");
    double x=((new Scanner(System.in)).nextDouble());
   System.out.println("You entered "+x+"%");
   //print out the proportion remaining for select percentages
   if (x >= 0 || x <=100) {
     double remain = 1 - x/100;
     remain = (double) Math.round (remain * 100) / 100;
     System.out.print("The proportion remaining is " + remain);
   }
   else {
     System.out.println("You did not enter an acceptable value");
   }

   }
}

/* Error report: 
 *    (Exlain the error(s) that occur here, in this comment,
 *    and fix the errors)
 *    Hint: What kinds of input are unacceptable? What kinds of
 *        acceptable input don't produce the correct answer?

 *    input as a double could not meet the exact value in if statements
 *    numbers apart from the ones specified in the if statements cannot produce correct answer
 *    input should be validated as between 0 and 100
 * 
 * 
 */

