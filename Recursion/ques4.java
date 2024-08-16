//Print factorial of number n using recursion
public class ques4 {
    public static void printFactorial(int i , int n, int factorial){
        if(i==1){
            factorial = factorial * i ;
            System.out.println(factorial);
            return;
        }
        factorial = factorial * i;
        printFactorial(i-1, n, factorial);
    }
    public static void main(String[] args) {
        printFactorial(7, 7, 1);
    }
}
