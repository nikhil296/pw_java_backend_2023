package feb_5.Assignment;
public class _3_Palindrome_check {
    public static void main(String[] args) {
        String str1 = "2552";
        String str2 = "";
        for(int i = str1.length()-1; i>=0; i--) {
            str2 = str2 + str1.charAt(i);
        }
        if(str1.equals(str2)) {
            System.out.println("Given String is Palindrome");
        }
        else {
            System.out.println("Given String is not Palindrome");
        }
    }
}