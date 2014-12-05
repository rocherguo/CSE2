//////////////////////
//Shen Guo
//CSE 2
//Dec 4
//HW 11
//Poker Hands Java Program

//  to use the scanner class
import java.util.Scanner;

public class PokerHands {
    //  main method
    public static void main (String [] args) {
        Scanner scan = new Scanner (System.in);
        String answer = "";
        String suit[] = {"c","d","h","s"};
        String rank[] = {"a","k","q","j","10","9","8","7","6","5","4","3","2"};

        do  {   //  start of do-while loop
            int hand[] = {0,0,0,0,0};
            
            //  promp user enter y or Y to start 
            System.out.print ("Enter 'y' or 'Y' to enter a(nother) hand- ");
            answer = scan.next();
            if (!answer.equals ("y") && !answer.equals ("Y")){
                break;
            }
            
            //  start of loop taking input
            for (int i=0; i<hand.length;i++){
                
                //  prompt user to enter suit
                System.out.print ("Enter the suit: 'c', 'd', 'h', or 's'- ");
                String SuitInput = scan.next();
                while (!SuitInput.equals("c") && !SuitInput.equals("d") && !SuitInput.equals("h") && !SuitInput.equals("s")){
                    System.out.println ("You did not enter a valid response");
                    System.out.print ("Enter the suit: 'c', 'd', 'h', or 's'- ");
                    SuitInput = scan.next();
                    continue;
                }
                
                //  take in suit as an int; addes on to hand
                for (int j=0; j<suit.length; j++)   {
                    if (SuitInput.equals(suit[j]))  hand[i] += j*13;
                }
                
                //  prompt user to enter rank
                System.out.print ("Enter one of 'a', 'k', 'q', 'j', '10', ...'2'- ");
                String RankInput = scan.next();
                while (!RankInput.equals("a") && !RankInput.equals("k") && !RankInput.equals("q") && !RankInput.equals("j") && !RankInput.equals("10") && !RankInput.equals("9") && !RankInput.equals("8") && !RankInput.equals("7") && !RankInput.equals("6") && !RankInput.equals("5") && !RankInput.equals("4") && !RankInput.equals("3") && !RankInput.equals("2")){
                    System.out.println ("You did not enter a valid response");
                    System.out.print ("Enter one of 'a', 'k', 'q', 'j', '10', ...'2'- ");
                    RankInput = scan.next();
                    continue;
                }
                
                //  take in rank as an int; addes on to hand
                for (int j=0; j<rank.length; j++) {
                    if (RankInput.equals(rank[j]))  hand[i] += j;
                }
                
                //  check if the card has already been entered
                if (i>0){
                    for (int j=i-1; j>=0; j--){
                        if (hand[i] == hand[j]){
                            System.out.println ("You already entered that card");
                            hand [i] = 0;
                            i--;
                            break;
                        }
                    }
                }
            }   //  end of loop taking input
        
        showOneHand (hand); //  print out using showOneHand method
        
        //  arrays recording the frequencies
        int rankFrequency [] = {0,0,0,0,0,0,0,0,0,0,0,0,0};
        int suitFrequency [] = {0,0,0,0};
        int handFrequency [] = {1,1,1,1,1};
        
        //  record the frequencies    
        for (int i=0; i<hand.length; i++)   {
            rankFrequency[hand[i]%13] += 1;
            suitFrequency[hand[i]/13] += 1;
            for (int j=i+1; j<hand.length; j++)    {
                if (hand[j]%13 == hand[i]%13) {
                    handFrequency[i] += 1;
                    handFrequency[j] += 1;
                }
            }
        }
        
        //  print out kinds
        if (checkStraight(rankFrequency))    {
            if (checkFlush(suitFrequency))  {
                if (checkRoyal(rankFrequency))  {
                    System.out.println ("This is a Royal Flush");
                }
                else {
                    System.out.println ("This is a Straight Flush");
                }
            }
            else {
                System.out.println ("This is a Straight");
            }
        } 
        if (!checkStraight(rankFrequency) && checkFlush(suitFrequency))  {
            System.out.println ("This is a Flush");
        }
        
        if (contain (4,handFrequency)) {
            System.out.println ("This is a Four of a Kind");
        }
        
        if (contain (3,handFrequency) && contain (2,handFrequency)) {
            System.out.println ("This is a Full House");
        }
        
        int dup =0;
        for (int i=0; i<handFrequency.length; i++) {
            for (int j=i+1; j<handFrequency.length; j++)   {
                if (handFrequency[i] == handFrequency[j]){
                    dup +=1;
                }
            }
        }
        
        //  to distinguish two pair and one pair (since both contains 1 and 2)
        if (dup == 6 && contain (2,handFrequency)) {
            System.out.println ("This is a Two Pair");
        }
        
        if (dup == 4 && contain (2,handFrequency) && contain (1,handFrequency))  {
            System.out.println ("This is a One Pair");
        }
        
        }   while (answer.equals ("Y") || answer.equals ("y")); //  end of do-while loop
    }   //  end of main method

    //  showOneHand method
    public static void showOneHand(int hand[]){
	    String suit[]={"Clubs:	", "Diamonds: ", "Hearts:   ", "Spades:   "};
	    String face[]={"A ","K ","Q ","J ","10 ","9 ","8 ","7 ","6 ","5 ","4 ","3 ","2 "};
	    String out="";
	    for(int s=0;s<4;s++){
  	        out+=suit[s];
  	        for(int rank=0;rank<13;rank++)
    	        for(int card=0;card<5;card++)
     	            if(hand[card]/13==s && hand[card]%13==rank)
      	            out+=face[rank];
  	                out+='\n';
	    }
	    System.out.println(out);
    } //  end of showOneHand method
    
    //  checkStraight method checking if array is a straight
    public static boolean checkStraight (int rankFrequency[])   {
        for (int i=0; i<rankFrequency.length-4; i++)  {
            if (rankFrequency[i]==1 && rankFrequency[i+1]==1 && rankFrequency[i+2]==1 && rankFrequency[i+3]==1 && rankFrequency[i+4]==1)    {
                return true;
            }
        }
        return false;
    }   //  end of checkStraight method
    
    //  checkFlush method checking if array is a flush
    public static boolean checkFlush (int suitFrequency[])   {
        for (int i=0; i<suitFrequency.length; i++)  {
            if (suitFrequency[i]==5)    {
                return true;
            }
        }
        return false;
    }   //  end of checkFlush method
    
    //  checkRoyal method checking if array is a royal
    public static boolean checkRoyal (int rankFrequency[])  {
        if (rankFrequency[0]==1 && rankFrequency[1]==1 && rankFrequency[2]==1 && rankFrequency[3]==1 && rankFrequency[4]==1){
            return true;
        }
        else {
            return false;
        }
    }   //  end of checkRoyal method
    
    //  contain method checking if an array contains an int
    public static boolean contain (int n, int handFrequency[])   {
        for (int i=0; i<handFrequency.length; i++)   {
            if (handFrequency[i] == n)   {
                return true;
            }
        }
        return false;
    }   //  end of contain method
    
}   //  end of class