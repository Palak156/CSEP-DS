import java.util.Scanner;

public class armstrongnum {
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
    System.out.print("Enter Number:");
    int  n =sc.nextInt();
    int count=0,sum=0;
    while(n>0){
        count++;
        n=n/10;
    }
    while(n>0){
        int rem=n%10;
        int power=1;
        for(int i=1;i<=count;i++){
                power=power*rem;
        }
        sum=sum+power;
        n=n/10;
    }
if(sum==n){
        System.out.println("ARMSTRONG");
     }
     else{
        System.out.println(" NOT ARMSTRONG");
     }
}
}
