import java.util.Scanner;

public class LargestOT {
    public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
    System.out.println("Enter Element a:");
       int  a =sc.nextInt();
       System.out.print("Enter Element b:");
       int  b =sc.nextInt();
       System.out.print("Enter Element c:");
       int  c =sc.nextInt();
       if(a>b&&a>c){
        System.out.print("A is the Largest");
       }
      else  if(b>a&&b>c){
        System.out.print("B is the Largest");
       }
       else {
        System.out.print("C is the Largest");
       }
    }
}
