import java.util.Scanner;

public class Problem_11 {
    // Reverse of a number 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int r = 0 ;
        while (n != 0) {
            int rem = n%10;
            r = r *10 + rem ;
            n = n/10 ;
        }    
        System.out.println(r);
    }
}
