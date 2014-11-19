import java.util.Scanner;

public class Wow {
    public static void main(String []args){
    double [] myList = {0,0,3,0,0,0};
    double max = myList[0];
    int indexOfMax = 0;
    for (int i = 1; i < myList.length; i++) {
        if (myList[i] >= max) {
            max = myList[i]; indexOfMax = i;
            System.out.print (indexOfMax + " "+ max);

            }
    }

    }
}