import java.util.Scanner;

public class Problem_5 {
    //Greatest of two numbers
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        if (a <= b) {
            if (a == b) {
                System.out.println("Both numbers are equal");
            }
            else {
                System.out.println("b is greater than a");
            }          
        }
        else {
            System.out.println("a is greater than b");
        }
    }
}
