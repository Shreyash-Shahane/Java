import java.util.Scanner;

public class Problem_4 {
    //Check whether given string is Palindrome or not
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        StringBuilder sb = new StringBuilder(str);
        int n = sb.length();
        for (int i = 0 ; i < n/2 ; i++){
            char temp = sb.charAt(n-1-i);
            sb.setCharAt(i, temp);
        }
        System.out.println(sb);
        if (String.valueOf(sb).equals(str)) {
            System.out.println("It is palindrome");
        }
    }
}
