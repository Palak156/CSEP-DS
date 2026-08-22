import java.util.Scanner;

public class maxwordsinstring {
       public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);  
    System.out.print("Enter  string:");
    String s = sc.nextLine();
     char[] arr=s.toCharArray();
     int count=0;
    for(int i=0;i<arr.length;i++){
        if(arr[i]==' '){
            count++;
            System.out.print(count);
        }
        else  {
    System.out.print("one word");
    }
}
}
}
