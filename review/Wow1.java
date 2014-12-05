import java.util.Scanner;

public class Wow1 {
    public static void main(String []args){
        

        System.out.print ("Enter an int- ");
        Scanner scan = new Scanner (System.in);
        int v = scan.nextInt();
        
        if (v>=0 && v<=10){
            System.out.println ("yes");
        }
        else {
            System.out.println ("no");
        }
        
    }
}