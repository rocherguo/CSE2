////////////////////////////////////////
//Shen Guo
//CSE2
//Oct/12/2014
//hw 06
//Roulette Java Program
// simulate roulette betting
//  compile the program
//      javac Roulette.java
//  run the program
//      java Roulette//

//  define a class
public class Roulette {
    
    //  main method required for every Java profram
    public static void main(String[] args) {

//  to record the losses and wins in each 100 rounds
int nLoss = 0;
int nWin = 0;
int winning$ = 0;

//  to record the total losses and wins in the 1000 times of 100 rounds
int nLoseEverything = 0;
int nWithProfit = 0;

int y = 1;
while (y <= 1000)   {   //  start of while (the 1000 times)
    int x = 1;
    while (x <= 100)    {   //  start of while (the 100 rounds)
        int guess = (int) (Math.random() * 38);
        int answer = (int) (Math.random() * 38);

        if (guess == answer)    {   //  start of if (win)
            nWin++;
            winning$ = winning$ + 36;
        }   //  end of if (win)
        else    {   //  start of else (lose)
            nLoss++;
        }   //  end of else (lose)
        x++;
    }   //  end of while (the 100 rounds)

if (nWin >= 3)  {   //  start of if (earn profit)
    nWithProfit++;
}   //  end of if (earn profit)
else if (nWin == 0)  {  //  start of else if (lose everything)
    nLoseEverything ++;
}   //  end of else if (lose everything)
y++;

}   //  end of while (the 1000 times)

//  print out the outcomes
System.out.println ("Number of times lose everything: " + nLoseEverything);
System.out.println ("Total winning: " + winning$);
System.out.println ("Number of times walked away with a profit: " + nWithProfit);
    }   //  end of main method
}   //  end of class