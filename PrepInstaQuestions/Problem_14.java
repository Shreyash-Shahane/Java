import java.util.Scanner;

public class Problem_14 {
    //Find Nth term of Fibonacci series
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int num = 0 ;
        int a =0 , b=1 ;
        for (int i = 0; i <n ; i++) {
            if (i < 2){
                num = i ;
            }
            else {
                num = a + b ;
                a = b ;
                b = num ;
        }
        }
        System.out.println(num);
    }
}
