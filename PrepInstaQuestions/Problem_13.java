import java.util.Scanner;

public class Problem_13 {
    //Fibonacci Series till nth term
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int num = 0 ;
        int a =0 , b=1 ;
        for (int i = 0; i <=n ; i++) {
            if (i < 2){
                System.out.print(i + " ");
            }
            else {
                num = a + b ;
                a = b ;
                b = num ;
                System.out.print(num + " ");
        }
        }
    }
}
