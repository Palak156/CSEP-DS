import java.util.Scanner;

public class stringtolowercase {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);   
        System.out.print("Enter a string:");
        String s = sc.nextLine();
        char[] arr=s.toCharArray();
   for(int i =0;i<arr.length;i++){
   if(arr[i]>='A'&&arr[i]<='Z'){
    arr[i]=(char)(arr[i]+32);
   }
}
System.out.print("lowercase string :"+new String(arr));
}
}
