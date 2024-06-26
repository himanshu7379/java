import java.util.Scanner;


public class percentage {
    
    public static void main(String args[]){
        long a, b, c, d, total_marks;
        float percentage;
        
      System.out.println("to calculate the percentage");
        // System.out.println("total number of subject marks");
        // System.out.println("taking input from user");
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your hindi marks  ");
         a = sc.nextInt();
        System.out.println("enter your english marks");
         b = sc.nextInt();
        System.out.println("enter your maths marks  ");
         c = sc.nextInt();
        System.out.println("enter your science marks  ");
         d = sc.nextInt();
         total_marks = a + b + c + d;
          System.out.println("percentage is : "+((total_marks/400)*100)+" ");
          // float f = percentage / 400;
       
        // System.out.println(f);   
        
    }
}
