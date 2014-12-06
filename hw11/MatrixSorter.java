//////////////////////
//Shen Guo
//CSE 2
//Dec 4
//HW 11
//Matrix Sorter Java Program

import java.util.Random;

public class MatrixSorter{
  public static void main(String arg[]){
    int mat3d[][][];
    mat3d=buildMat3d();
    show(mat3d);
    System.out.println("The smallest entry in the 3D matrix is "+
  			findMin(mat3d));
    System.out.println("After sorting the 3rd matrix we get");
    sort(mat3d[2]);
    show(mat3d);

   }    //end of main method
   
   //   start of buildMat3d() method;
   public static int[][][] buildMat3d() {
       int array [][][] = new int [3][][];
       for (int i=0; i<3; i++){ //  for each slab
           array [i] = new int [3 + 2*i][];
           for (int j=0; j<3+2*i; j++)  { //  for each array within the slab
                array [i][j] = new int [i+j+1];
                for (int l=0; l<i+j+1; l++)  {   //  for each element within the array within the slab
                   array[i][j][l] = (int)(Math.random()*99)+1;  
               }
           }
       }
       return array;
   }    //  end of buildMat3d() method
   
   //   start of show method
    public static void show (int array[][][])    {
        for (int i=0; i<array.length; i++)   {
            System.out.println ("---------------------------Slab " + (int) (i+1));
            for (int j=0; j<array[i].length; j++)   {
                printArray (array[i][j]);   //  print by calling the printArray method
            }
        }
    }   //  end of show method
    
    //  start of printArray method
    public static void printArray (int array[]) {
        for (int u: array)  {
            System.out.print (u + " ");
        }
        System.out.println ("");
    }   //  end of printArray method
    
    //  start of findMin method
    public static int findMin(int array[][][])  {
        int min = array[0][0][0];
        for (int i=0; i<array.length; i++)  {
            for (int j=0; j<array[i].length; j++)   {
                for (int l=0; l<array[i][j].length; l++)    {
                    if (min > array[i][j][l])
                        min = array[i][j][l];
                }
            }
        }
        return min;
    }   //  end of findMin method
    
    //  start of sort method
    public static int [][] sort (int array[][])  {
        for (int l=0; l<array.length; l++)  {
            
            //  start selection sort
            for (int i=0; i<array[l].length-1; i++) {
                int currentMin = array[l][i];
                int currentMinIndex = i;
                
                for (int j=i+1; j<array[l].length; j++) {
                    if (currentMin>array[l][j]) {
                        currentMin = array[l][j];
                        currentMinIndex = j;
                    }
                }
                
                if (currentMinIndex !=i)    {
                    array[l][currentMinIndex] = array[l][i];
                    array[l][i] = currentMin;
                }
            }
        }    //  end selection sort
        
        //  start insertion sort
        for (int l=1; l<array.length; l++)  {
            int currentElement[] = array[l];
            int k;
            for (k = l-1; k>=0 && array[k][0] > currentElement[0]; k--)    {
                array[k+1] = array[k];
            }
            array[k+1] = currentElement;
        }
        return array;
    }   //  end of sort method
    
}   //  end of class
