import java.util.Scanner;

public class Wow {
    public static void main(String []args){
/*    int a=0; int b=1;
    System.out.println ("a: "+ a);
    System.out.println ("b: "+ b);

while (b>0){

a+=b;
    System.out.println ("a: "+ a);

b+=a;
    System.out.println ("b: "+ b);

}
*/
int a=0;
int b=1;
for (int i=1;i<5;i++){
    for (int j=0;j<i;j++){
        System.out.println("a: "+a);
        System.out.println("b: "+b);
        a+=b;
    b+=a;
    }
}
  }
}   //  end of class