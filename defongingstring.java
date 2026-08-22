import java.util.Scanner;

public class defongingstring {
     public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);  
    System.out.print("Enter  string:");
    String s = sc.nextLine();
    char[] arr=s.toCharArray();
    for(int i=0;i<arr.length;i++){
        if(arr[i]== '.'){
             System.out.print("[.]");
        }
        else{
             System.out.print("no");
        }
    }
}
}
