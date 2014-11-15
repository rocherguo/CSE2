/*
OUTPUT: 
    {2.3, 3.0, 4.0, -2.1, 82.0, 23.0} 
+ {2.3, 3.0, 4.0, -2.1, 82.0, 23.0}
   = {4.6, 6.0, 8.0, -4.2, 164.0, 46.0}
    {2.3, 3.0, 4.0, -2.1, 82.0, 23.0} 
  + {2.3, 13.0, 14.0}
   = {4.6, 16.0, 18.0, -2.1, 82.0, 23.0}
It is true that {2.3, 3.0, 4.0, -2.1, 82.0, 23.0}
   == {2.3, 3.0, 4.0, -2.1, 82.0, 23.0}
It is false that {2.3, 13.0, 14.0}
   == {2.3, 13.0, 14.0, 12.0}
It is false that {2.3, 12.0, 14.0}
   == {2.3, 13.0, 14.0}
*/
public class ArrayMath{
  public static void main(String [] arg){
    double x[]={2.3, 3, 4, -2.1, 82, 23},
      y[]={2.3, 3, 4, -2.1, 82, 23},
      z[]={2.3, 13, 14},
      w[]={2.3, 13, 14, 12}, 
      v[],
      u[]={2.3, 12, 14};
    v=addArrays(x,y);
    System.out.println(display(x)+" \n  + " + display(y) + "\n   = " +display(v));
    System.out.println(display(x)+" \n  + " + display(z) + "\n   = " 
                         +display(addArrays(x,z)));
    System.out.println("It is " + equals(x,y)+" that "+display(x)+
                       " == "+display(y));
    System.out.println("It is " + equals(z,w)+" that "+display(z)+
                       " == "+display(w));
    System.out.println("It is " + equals(u,z)+" that "+display(u)+
                       " == "+display(z));

  }
  
  public static String display(double [] x){
    String out="{";
    for(int j=0;j<x.length;j++){
      if(j>0){
        out+=", ";
      }
      out+=x[j];
    }
    return out+"}";
  }
  
  //    start of addArrays() method
    public static double []addArrays(double []x, double []y){
        double v[] = new double [x.length];
        if (x.length >= y.length)   {
            for (int i=0; i<y.length; i++)  {
                v[i] = x[i] + y[i];
            }
            for (int i=y.length; i<x.length; i++)   {
                v[i] = x[i];
            }    
        }
        else    {
            for (int i=0; i<x.length; i++)  {
                v[i] = x[i] + y [i];
            }
            for (int i=x.length; i<y.length; i++)   {
                v[i] = y[i];
            }
        }
        return v;
    }   //  end of addArrays() method
  
  //    start of equals() method
  public static boolean equals(double []x, double []y){
      if (x.length == y.length)  {
          for (int i=0; i<x.length; i++){
              if (x[i] == y[i]){
                  continue;
              }
              else{
                  return false;
              }
\          }
          return true;
      }
      else {
          return false;
      }
  }
}//end of class
