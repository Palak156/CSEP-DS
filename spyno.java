import java.util.Scanner;

public class spyno {
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
    System.out.print("Enter Number:");
    int  n =sc.nextInt();
int rem,sum=0 ,prod=1;
     while(n>0){
       rem=n%10;
       sum=sum+rem;
       prod=prod*rem;
       n=n/10;
     }
     if(sum==prod){
        System.out.println(" SPY");
     }
     else{
        System.out.println(" NOT SPY");
     }
}
}
