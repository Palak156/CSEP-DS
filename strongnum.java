import java.util.Scanner;

public class strongnum {
      public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
      System.out.print("Enter Number:");
      int  n =sc.nextInt();
      int original=n,rem,sum=0;
    while(n>0){
        rem=n%10;
        int fact=1;
        for(int i=1;i<=rem;i++){
        fact=fact*i;
    }
     sum=sum+fact;
     n=n/10;
    }
    if(sum==original){
        System.out.println(" STRONG");
     }
     else{
        System.out.println(" NOT STRONG");
     }
}
}
