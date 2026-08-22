import java.util.Scanner;
public class min_max {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number n:");
       int n=sc.nextInt();
            
          //FIND LARGEST AND SMALLEST
    //    int lar=Integer.MIN_VALUE;
    //    int small=Integer.MAX_VALUE;
    //    while(n>0){
    //     int rem=n%10;
    //     if(rem<small){
    //         small=rem;
    //     }
    //     if(rem>lar){
    //         lar=rem;
    //     }
    //     n=n/10;
    //    }
    //    System.out.println("LARGEST IN NO.:"+lar);
    //    System.out.println("SMALLEST IN NO.:"+small);

       //FIND SECOND LARGEST 
       int lar=Integer.MIN_VALUE;
       int slar=Integer.MIN_VALUE;
       while(n>0){
        int rem=n%10;
        if(rem>lar){
            slar=lar;
            lar=rem;
        }
        else if (rem>slar&&rem!=lar){
            slar=rem;
        }
        n=n/10;
       
    }
       System.out.println("Second largest IN NO.:"+slar);


}
}
