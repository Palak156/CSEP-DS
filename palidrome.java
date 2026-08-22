import java.util.Scanner;

public class palidrome {
     public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
    System.out.print("Enter Number:");
    int  n =sc.nextInt();
    int original=n;
    int rem,rev=0;
     while(n>0){
       rem=n%10;
       rev=rev*10+rem;
       n=n/10;
     }
     if(rev==original){
        System.out.println("Palidrome");
     }
     else{
        System.out.println(" NOT Palidrome");
     }
}
}