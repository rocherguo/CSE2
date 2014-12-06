//////////////////////
//Shen Guo
//CSE 2
//Nov 15 
//HW 10
//Poker Odds Java Program

import java.util.Random;
import java.util.Scanner;
public class PokerOdds{
  public static void main(String [] arg){
    showHands();
    simulateOdds();
  } //  end of main method
  
  //  start of showHands() method
  public static void showHands()  {
    Scanner scan = new Scanner (System.in);
    
    //  start of do-while loop for user to go again
    String answer = "";
    do {
      
      //  initiate arrays for suits and ranks
      String[] suits = {"Spades", "Hearts", "Diamonds", "Clubs"};
      String[] ranks = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};
      int deck[] = new int [52];
      //  initialize cards
      for (int i=0; i<52; i++){
        deck[i]=i;
      }
    
    //  generate hand array
    int hand[] = {-1,-1,-1,-1,-1};
      for (int i=hand.length-1; i>=0; i--) {
        int index = (int)(Math.random()*deck.length);
        int temp = deck[i];
        deck[i] = deck[index];
        deck[index] = temp;
      }
      
    //  to print out in group of suits
    String Clubs = "Clubs: ";
    String Diamonds = "Diamonds: ";
    String Hearts = "Hearts: ";
    String Spades = "Spades: ";
      for (int i=0; i<hand.length; i++){
        String suit = suits[deck[i] / 13];
        String rank = ranks[deck[i] % 13];
        if (suit.equals("Clubs"))  Clubs += rank + " ";
        if (suit.equals("Diamonds"))  Diamonds += rank + " ";
        if (suit.equals("Hearts"))  Hearts += rank + " ";
        if (suit.equals("Spades"))  Spades += rank + " ";
      }  
        
        //  print out the four suits
        System.out.println (Clubs);
        System.out.println (Diamonds);
        System.out.println (Hearts);
        System.out.println (Spades);
        
        //  prompt the user go again or not
        System.out.print ("Go again? Enter 'y' or 'Y', anything else to quit- ");
        answer = scan.next();
    } while (answer.equals ("y") || answer.equals ("Y")); //  end of do-while loop
  } //  end of showHands() method  
  
  //  start of simulateOdds() method
  public static void simulateOdds() {
      String[] Ranks = {"A", "K", "Q", "J", "10", "9", "8", "7", "6", "5", "4", "3", "2"};  // for print out lables
      int ranks[] = new int [5];  // array recording the ranks of the hand cards
      int deck[] = new int [52];  
      int NumOfExactlyOneDup[] = {0,0,0,0,0,0,0,0,0,0,0,0,0}; //  array recording the num of exactly one pair for each rank
      int NumOfNotExactlyOnePair = 0; //  int recording the num of not exactly one pair
      
      //  generate deck array
      for (int j=0; j<10000; j++) {
        for (int i=0; i<52; i++){
          deck[i]=i;
        }
        
        //  generate hand array
        int hand[] = {-1,-1,-1,-1,-1};
          for (int i=hand.length-1; i>=0; i--) {
            int index = (int)(Math.random()*deck.length);
            int temp = deck[i];
            deck[i] = deck[index];
            deck[index] = temp;
            ranks[i] = deck[i]%13;  //  generating ranks array
           }
          
        //  import exactlyOneDup method
        if (FindDuplicates.exactlyOneDup(ranks)){
          //  to find out the rank that appears in the pair
          int dup = 0;
          for (int n=0; n<ranks.length; n++){
            for (int i=n+1; i<ranks.length; i++){ 
              if (ranks[n] == ranks[i]){
                dup = ranks [n];
                break;
              }
            }
          }  
          NumOfExactlyOneDup[dup]+=1; //  add to the according element in NumOfExactlyOneDup array
        }
        else {
          NumOfNotExactlyOnePair +=1; //  add to the NumOfNotExactlyOnePair
        }
      } //  end of 10000 loops
      
          //  print out results
          System.out.println ("rank  freq of exactly one pair");
          for (int i=0; i<NumOfExactlyOneDup.length; i++)
            System.out.println (" " + Ranks[i] + "     " + NumOfExactlyOneDup[i]); //  print out the NumOfExacltOneDup elements accord with the label in Ranks array
          System.out.println ("----------------------------");
          System.out.println ("total not exactly one pair: " + NumOfNotExactlyOnePair);
  } //  end of simulateOdds() method

} //  end of class
