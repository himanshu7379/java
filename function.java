import java.util.*;

public class function {
    // public static void main(String args){
      static int calculateSum(int a, int b) { 
    int c = a+b;
    return c;
 }
    
    public static void main(String args){
        Scanner sc = new Scanner(System.in);
        // System.out.println("enter the value of a");
        int a = sc.nextInt();
        // System.out.println("enter the value of b");
        int b = sc.nextInt();
        int c = calculateSum(a, b);
        System.outprintln(c);
    }
    

 }    


