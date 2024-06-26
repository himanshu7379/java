import
public class odd {
    System.out.println("give two non negative integer");
    Scanner sc = new Scanner(System.in);
     System.out.println("enter youe low number");
    low = sc.nextInt();
   
    System.out,println("enter youe high number");
    high = sc.nextInt();
    int i = 0;
   
   
    for(i = low; i<=high; i++)
    {
        if(i%2 !==0){
        System.out.print("odd number is :", +i);
        }
        

    }
    
}
