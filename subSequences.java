public class subSequences{

    public static void main(String[] args) {

        String str = "abc";

        sub(str, "", 0);
    }

    public static void sub(String str, String ans, int index) {

        if (index == str.length()) {
            System.out.println(ans);
            return;
        }

        sub(str, ans + str.charAt(index), index + 1);
        sub(str, ans, index + 1);
    }
}