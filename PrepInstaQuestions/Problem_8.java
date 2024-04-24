import java.util.Scanner;

public class Problem_8 {
// Check whether a number is prime or not
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        if (n < 2){
            System.out.println(n +" is a prime number");
        }
        for (int i = 1; i < n; i++) {
            if (n % i == 0){
                count++;    
            }
        }
        if (count > 2){
            System.out.println(n + " is not a prime number");
        }
        else{
            System.out.println(n + " is a prime number");
        }
    }
}
