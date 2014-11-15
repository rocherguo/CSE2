////////////////////////////////////////
//Shen Guo
//CSE2
//Sep/25/2014
//Lab 05
//Random Games Java Program
//play roulette or craps or pick a card from a deck of playing cards
//  first compile the program
//      javac RandomGames.java
//  run the program
//      java RandomGames//

// "UNIMPLEMENT" THE CRAP AND THE PICK CARD

//  to use the Scanner class
import java.util.Scanner;

//  define a class
public class RandomGames {
    
    //  main method required for every Java profram
    public static void main(String[] args) {
    Scanner myScanner;
    myScanner = new Scanner(System.in);
 
        //  prompt the user to choose a game
        System.out.print ("Enter R or r for Roulette, C or c for craps, P or p for pick a card- ");
        String game = myScanner.next();

        int a = (int) (Math.random() * 38);
        
            //  start of if (length = 1)
            if (game.length() == 1) {
                char r = game.charAt(0);
                // start of if (roulette) 
                if (game.equals("R") || game.equals("r"))    {   
                    switch (a % 38)   {   //  start of switch
                        case 37: 
                            System.out.println ("Roulette: 00");
                            break;
                        default:
                            System.out.println ("Roulette: " + a);
                    }   //  end of switch
                    break;
                }
                }   //  end of if (roulette)
            
                //  start of else if (craps)
                else if (game.equals("C") || game.equals("c"))   {
                    int b = (int) (Math.random() * 6) + 1;
                    int c = (int) (Math.random() * 6) + 1;
                    int craps = b + c;
                    System.out.println("Craps: " + b + "+" + c + "=" + craps);
                }   //  end of else if (craps)  
                
                //  start of else if (random card)
                else if (game.equals("P") || game.equals("p"))    {
                int suit = (int) (Math.random() * 4) + 1;
                int number = (int) (Math.random() * 13) + 1;
                    switch (suit % 4) {   //  start of switch
                        case 0:
                            System.out.println (number + " of hearts");
                            break;
                        case 1:
                            System.out.println (number + " of spades");
                            break;
                        case 2:
                            System.out.println (number + " of clubs");
                            break;
                        case 3:
                            System.out.println (number + " of diamonds");
                    }   //  end of switch
                    break;
                }   //  end of else if (random card)
                        
                //  start of else (invalid input)
                else    {
                    System.out.println (game + "is not one of 'R', 'r', 'C', 'c', 'P', or 'p'");
                    return;    
                    }
                    //  end of else (invalid input)

            
            //  start of else (length is not 1)
            else    {
                System.out.println ("a single character expected");
                return;
            }   //  end of else (length is not 1)
            
    }   //  end of main method
}   //  end of class
