import java.util.Scanner;

public class Problem_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if (a >=b && a >=c){
            if (a==b && a == c) {
                System.out.println("All numbers are equal");
            }
            else {
                System.out.println("a is largest");
            }       
        } else if ( b >=a && b >=c ) {
           System.out.println("b is largest"); 
        }  
        else if ( c >=a && c >=b ) {
            System.out.println("c is largest"); 
        }
    }
}
