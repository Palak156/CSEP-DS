public class digitrecursion {
    static int sum=0;
    static int sumDigits(int n) {
        if (n == 0) {
            return 0;
        }
        int rem=n%10;
        n=n/10;
        sum=sumDigits(n)+rem;
        return  sum;
    }

    static int rev=0;
    static int reverse(int n){
        if (n == 0) {
            return rev;
        }
        int rem=n%10;
        n=n/10;
        rev = rev * 10 + rem;

        return reverse(n);
    }

    static int palidrome(int n){
        if (n == 0) {
            return rev;
        }
        int rem=n%10;
        n=n/10;
       rev = rev * 10 + rem;
        return palidrome(n);
    }


    public static void main(String[] args) {
        int n = 3874;

    System.out.println(sumDigits(n));

        //   System.out.println(reverse(n));

        //  if (n == palidrome(n)) {
        //     System.out.println("Palindrome");
        // } else {
        //     System.out.println("Not Palindrome");
        // }

         
    }
}
