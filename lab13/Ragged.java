//////////////////
//Shen Guo
//CSE 2
//Nov/23/2014
//lab 13: Arrays that run you ragged

public class Ragged {
    public static void main (String [] args)    {
        System.out.println ("The array before sorting");
        //  initialize a new two dimentional array with 5 single dimentional arrays
        int[][] myArray = new int [5][];
        //  initialize the length of the 5 single dimentional arrays
        for (int i=0; i<5; i++) {
            myArray[i]=new int [i*3+5];
            //  initialize each element
            for (int j=0; j<i*3+5; j++) {
                myArray[i][j]=(int)(Math.random()*39);
                //  print out each element
                System.out.print (myArray[i][j] + " ");
            }
            System.out.println ("");
        }
        
        System.out.println ("\n\nThe array after sorting");
        for (int i=0;i<myArray.length;i++){
            for (int j=0;j<myArray[i].length;j++){
                java.util.Arrays.sort (myArray[i]);
                System.out.print (myArray[i][j] + " ");
            }
            System.out.println ("");
        }
    
    }   //  end of main method
}   //  end of class