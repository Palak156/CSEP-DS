import java.util.Scanner;
public class swap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    System.out.println("Enter Element a:");
       int  a =sc.nextInt();
       System.out.print("Enter Element b:");
       int  b =sc.nextInt();
    //    //swap using third
    //    int temp;
    //    temp=a;
    //    a=b;
    //    b=temp;
    // //swap without third
    //       a=a+b;
    //       b=a-b;
    //       a=a-b;
    // //swap using XOR 
    //     a=a^b;
    //     b=a^b;
    //     a=a^b;
       System.out.print("After swap a and b:");
       System.out.println(a+" "+b);
    }

}
