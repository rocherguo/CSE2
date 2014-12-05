import java.util.Scanner;

public class Wow2 {
    public static void main(String []args){
        
        String answer;

    do {
        System.out.print ("Enter an int- ");
        Scanner scan = new Scanner (System.in);
        int v = scan.nextInt();
        if (v>=0 && v<=10){
            System.out.println ("yes");
        }
        else {
            System.out.println ("no");
        }
        
        System.out.print("Go again? Enter 'y' or 'Y', anything else to quit- ");
        answer=scan.next();
    }   while(answer.equals("Y") || answer.equals("y"));
        
    }
}