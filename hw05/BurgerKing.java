//////////////////////////////
//Shen Guo
//CSE2
//Sep/29/2014
//hw05
//BuregerKing Java Program
//prompts the user to enter a choice of ordoer and prompts the users for details of order
//  first compile the program
//      javac BurgerKing.java
//  run the program
//      java BurgerKing//


//to use the Scanner class
import java.util.Scanner;

//  define a class
public class BurgerKing {
    
    //  main method required for every Java profram
        public static void main(String[] args) {
        Scanner myScanner;
        myScanner = new Scanner ( System.in);
        
        //  prompt use to enter input
        System.out.println ("Enter a letter to indicate a choice of");
        System.out.println ("\t Burger (B or b)");
        System.out.println ("\t Soda (S or s)");
        System.out.print ("\t Fries (F or f) ");
        
        String input = myScanner.next();
        //  start of if (input length = 1)
        if (input.length() == 1)    {
            char choice = input.charAt(0); 
            switch (choice) {   //  start of switch
                case 'B':
                    System.out.println ("Enter A or a for \"all the fixings\"");
                    System.out.println ("C or c for cheese");
                    System.out.print ("N or n for none of the above ");
                    char Burgerfixings = myScanner.next().charAt(0);
                        switch (Burgerfixings) {    //  start of switch (Burgerfixings)
                            case 'A':
                                System.out.println ("You ordered a burger with all the fixings");
                                break;
                            case 'a':
                                System.out.println ("You ordered a burger with all the fixings");
                                break;
                            case 'C':
                                System.out.println ("You ordered a burger with cheese");
                                break;
                            case 'c':
                                System.out.println ("You ordered a burger with cheese");
                                break;
                            case 'N':
                                System.out.println ("You ordered a burger");
                                break;
                            case 'n':
                                System.out.println ("You ordered a burger");
                                break;
                            default:
                                System.out.println ("You did not enter A/a/C/c/N/n");
                        }   //  end of switch (Burgerfixings) 
                        break;
                case 'b':
                    System.out.println ("Enter A or a for \"all the fixings\"");
                    System.out.println ("C or c for cheese");
                    System.out.print ("N or n for none of the above ");
                    char burgerfixings = myScanner.next().charAt(0);
                        switch (burgerfixings) {    //  start of switch (burgerfixings)
                            case 'A':
                                System.out.println ("You ordered a burger with all the fixings");
                                break;
                            case 'a':
                                System.out.println ("You ordered a burger with all the fixings");
                                break;
                            case 'C':
                                System.out.println ("You ordered a burger with cheese");
                                break;
                            case 'c':
                                System.out.println ("You ordered a burger with cheese");
                                break;
                            case 'N':
                                System.out.println ("You ordered a burger");
                                break;
                            case 'n':
                                System.out.println ("You ordered a burger");
                                break;
                            default:
                                System.out.println ("You did not enter A/a/C/c/N/n");
                        }   //  end of switch (burgerfixings)  
                        break;
                case 'S':
                    System.out.println ("Do you want Pepsi (p or P),");
                    System.out.print ("Coke (c or C), Sprite (s or S) or Mountain Dew (M or m)- ");
                    char Soda = myScanner.next().charAt(0);
                        switch (Soda)   {   //  start of switch (Soda)
                            case 'p':
                                System.out.println ("You ordered a Pepsi");
                                break;
                            case 'P':
                                System.out.println ("You ordered a Pepsi");
                                break;
                            case 's':
                                System.out.println ("You ordered a Sprite");
                                break;
                            case 'S':
                                System.out.println ("You ordered a Sprite");
                                break;
                            case 'm':
                                System.out.println ("You ordered a Mountain Dew");
                                break;
                            case 'M':
                                System.out.println ("You ordered a Mountain Dew");
                                break;
                            default:
                                System.out.println ("You did not enter p/P/s/S/m/M");
                        }   //  end of switch (Soda)
                        break;
                case 's':
                    System.out.println ("Do you want Pepsi (p or P),");
                    System.out.print ("Coke (c or C), Sprite (s or S) or Mountain Dew (M or m)- ");
                    char soda = myScanner.next().charAt(0);
                        switch (soda)   {   //  start of switch (Soda)
                            case 'p':
                                System.out.println ("You ordered a Pepsi");
                                break;
                            case 'P':
                                System.out.println ("You ordered a Pepsi");
                                break;
                            case 's':
                                System.out.println ("You ordered a Sprite");
                                break;
                            case 'S':
                                System.out.println ("You ordered a Sprite");
                                break;
                            case 'm':
                                System.out.println ("You ordered a Mountain Dew");
                                break;
                            case 'M':
                                System.out.println ("You ordered a Mountain Dew");
                                break;
                            default:
                                System.out.println ("You did not enter p/P/s/S/m/M");
                        }   //  end of switch (soda)
                        break;
                case 'F':
                    System.out.print ("Do you want a large or small order of fried (l, L, s, or S)- ");
                    char Fries = myScanner.next().charAt(0);
                        switch (Fries)  {   //  start of switch (Fries)
                            case 'l':
                                System.out.println ("You ordered large fries");
                                break;
                            case 'L':
                                System.out.println ("You ordered large fries");
                                break; 
                            case 's':
                                System.out.println ("You ordered small fries");
                                break;
                            case 'S':
                                System.out.println ("You ordered small fries");
                                break;
                            default:
                                System.out.println ("You did not enter l/L/s/S");
                        }   //  end of switch (Fries)
                        break;
                case 'f':
                    System.out.print ("Do you want a large or small order of fried (l, L, s, or S)- ");
                    char fries = myScanner.next().charAt(0);
                        switch (fries)  {   //  start of switch (Fries)
                            case 'l':
                                System.out.println ("You ordered large fries");
                                break;
                            case 'L':
                                System.out.println ("You ordered large fries");
                                break; 
                            case 's':
                                System.out.println ("You ordered small fries");
                                break;
                            case 'S':
                                System.out.println ("You ordered small fries");
                                break;
                            default:
                                System.out.println ("You did not enter l/L/s/S");
                        }   //  end of switch (fries)
                        break;
                default:
                    System.out.println ("You did not enter any of B, b, S, s, F, or f");
                    break;
            }   //  end of switch (choice)
        
        }   //  end of if (input length = 1)
        
        //  start of else (input length is not 1)
        else    {
            System.out.print ("a single character expected");
            return;
        }   //  end of else (input length is not 1)
        
            
        }   //  end of main method
}   //  end of class