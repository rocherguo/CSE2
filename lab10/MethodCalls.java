///////////////////////////////////////////////
//Shen Guo
//CSE 2
//Oct 31
//lab 10
//methods that call methods

public class MethodCalls{
    public static void main(String []  arg){
        int a=784,b=22,c;
        c=addDigit(a,3);
        System.out.println("Add 3 to "+a+" to get "+c);
        c=addDigit(addDigit(c,4),5);
        System.out.println("Add 3, 4, and 5 to "+a+" to get "+c);
        System.out.println("Add 3 to -98 to get: "+addDigit(-98,3));
        c=join(a,b);
        System.out.println("Join "+a+" to "+b+" to get "+c);
        System.out.println("Join 87, 42, and 83 to get "+join(87, join(42,83)));
        System.out.println("Join -9 and -90 to get "+join(-9,-90));
    }   //  end of main method
    
    //  start of addDigit method
    public static int addDigit (int a, int b)   {
        int c = Math.abs(a);
        //int d = String.valueOf(c).length();
        int d = (int)(Math.log10(c)+1);
        int x;
        if (a<0)    {
            x = (-1) * (b * ((int)Math.pow(10,d)) + c);
        }
        else    {
            x = b * ((int)(Math.pow(10,d))) + a; 
        }
        return x;
    }   //  end of addDigit method
    
    //  start of join method
    public static int join (int a, int b)   {
        int e = Math.abs(b);
        //int f = String.valueOf(e).length();
        int f = (int)(Math.log10(e)+1);
        int y;
        if (a>0 && b >0)  {
            y = a * ((int)Math.pow(10,f)) + b;
        }
        else if (a<0 && b<0)    {
            y = (-1) *(a * ((int)Math.pow(10,f)) + b);
        }
        else    {
            int c = Math.abs(a);
            y = (-1)*(c*((int)Math.pow(10,f)) +e);
        }
        return y;
    }   //  end of join method
}   //  end of class

