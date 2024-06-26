import java.util.Scanner;

public class practice6 {  
public static void main(String[] args){
    Scanner sc =  new Scanner(System.in);
     System.out.println("enter the value of length");
       float length = sc.nextInt();
  
        System.out.println("enter ehe value of breadth ");
        float breadth = sc.nextInt();
         
        double area = length * breadth;
        System.out.println((int)area);
        // int sub = a-b;
        // System.out.println("the sub of two integer is : " +sub);
        //  int multi = a*b;
        // System.out.println("the multi of two integer is : " +multi);
        //  int div = a/b;
        // System.out.println("the divide of two integer is : " +div); 
        // int mdulo = a%b;
        // System.out.println("the madulo of two integer is : " +mdulo);

    }

}

    