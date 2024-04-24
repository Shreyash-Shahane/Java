import java.util.Scanner;
// Sum of numbers in a range
public class Problem_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt(); 
        int sum = 0 ; 
        for (int i = a; i <= b ; i ++) {
            sum = sum + i ;
        } 
        System.out.println(sum);
    }
}
