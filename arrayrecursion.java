import java.util.Scanner;
public class arrayrecursion {

     static void printarray(int[]arr,int n,int i){
        if(i==n) return;
        System.out.print(arr[i]+" ");
         printarray(arr,n,i+1);
     }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter size of Array:");
        int n=sc.nextInt();
        int[] arr =new int [n];
        System.out.print("Enter element of Array:");
        for (int i = 0 ; i <arr.length;i++){
            arr[i]=sc.nextInt();
        }
        printarray(arr,n,0);
    }
}
