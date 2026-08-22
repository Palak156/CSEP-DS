import java.util.Scanner;

public class reversestring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);   
    String reverse="";
    String s = sc.nextLine();
    for(int i =s.length()-1;i>=0;i--){
        reverse=reverse+s.charAt(i);
    }
    System.out.println("Original String :"+s+"");
    System.out.println("Reverse String :"+reverse+"");
}
}
