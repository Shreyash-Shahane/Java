import java.util.Scanner;

public class Problem_15 {
    // Factorial of number
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int factorial = 1;
        for (int i = 1; i <=n ; i++){
            factorial = factorial * i ;
        }
        System.out.println(factorial); 
    }
}
