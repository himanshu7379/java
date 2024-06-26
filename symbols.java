import java.util.Scanner;

public class symbols {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("the first number is : ");
        int a = sc.nextInt();
        System.out.println("the second number is : ");
        int b = sc.nextInt();
        System.out.println("the third number is : ");
        int c = sc.nextInt();


         if(a==b&&b==c&&c==a){
        System.out.println("all are equal: "+(a==b&&b==c&&c==a));
        } 
        else{
            System.out.println("any two number are equal:" );
        }
       
        }
    }
    

