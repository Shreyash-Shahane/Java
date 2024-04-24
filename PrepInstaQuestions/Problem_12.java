import java.util.Scanner;

public class Problem_12 {
    // Palindrome number checker
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int r = 0 ;
        int j =n ;
        int rem;
        while (j != 0) {
            rem = j%10;
            r = r *10 + rem ;
            j = j/10 ;
        }    
        System.out.println(r);
        if (n == r) {
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not a Palindrome");
        }
    }
}
