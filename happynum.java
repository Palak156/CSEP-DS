import java.util.Scanner;

public class happynum {
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
    System.out.print("Enter Number:");
    int  n =sc.nextInt();
    while(n!=1&&n!=4){
   int sum=0;

  while(n>0){
  int rem=n%10;
  sum=sum+(rem*rem);
  n=n/10;
   }
  n=sum;
}
if(n==1){
        System.out.println("HAPPY");
     }
     else{
        System.out.println(" SAD");
     }
}
}
