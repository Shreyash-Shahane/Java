import java.util.Scanner;

public class Problem_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); 
        if (n%2 == 0) {
            System.out.println("Number is Even");
        }
        else {
            System.out.println("Number is Odd");
        }
// Using Ternary Operator

        String status = n%2 == 0 ? "is even" : "is odd";

        System.out.println("The given number " + status);

    }
}
