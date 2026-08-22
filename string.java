import java.util.Scanner;
public class string {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


//takr user input ,print the string,print its size 

//         System.out.print("Enter size: ");
//         int n = sc.nextInt();

//         char[] arr = new char[n];

//         System.out.println("Enter characters:");

//         for (int i = 0; i < n; i++) {
//             arr[i] = sc.next().charAt(0);
//         }

//         System.out.print("String: ");

//         for (int i = 0; i < n; i++) {
//             System.out.print(arr[i]);
//         }

//         System.out.println();
//         System.out.println("Size: " + arr.length);
//     }
// }

//count vowels &consonent 

//         String s = sc.nextLine();

//         int vowels = 0;
//         int consonants = 0;

//         for (int i = 0; i < s.length(); i++) {

//             char ch = Character.toLowerCase(s.charAt(i));

//             if (ch >= 'a' && ch <= 'z') {

//                 if (ch == 'a' || ch == 'e' || ch == 'i' ||
//                     ch == 'o' || ch == 'u') {
//                     vowels++;
//                 } else {
//                     consonants++;
//                 }
//             }
//         }

//         System.out.println("Vowels = " + vowels);
//         System.out.println("Consonants = " + consonants);

//     }
// }

//find first and last

//         String s = sc.nextLine();

//         System.out.print("Enter character: ");
//         char target = sc.next().charAt(0);

//         int first = s.indexOf(target);
//         int last = s.lastIndexOf(target);

//         System.out.println("First occurrence = " + first);
//         System.out.println("Last occurrence = " + last);

//     }
// }


    //reverse a string 


    String reverse="";
    String s = sc.nextLine();
    for(int i =s.length()-1;i>=0;i--){
        reverse=reverse+s.charAt(i);
    }
    System.out.println("Original String :"+s+"");
    System.out.println("Reverse String :"+reverse+"");


//palidrome or not 
        String s = sc.nextLine();

        String reverse = "";

        for (int i = s.length() - 1; i >= 0; i--) {
            reverse = reverse + s.charAt(i);
        }

        if (s.equals(reverse)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }

    }
}