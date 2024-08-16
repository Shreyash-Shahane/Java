public class ques5 {
    public static void main(String[] args) {
        int n = 7;
        int factorial = 1;
        for (int i = n; i > 0; i--) {
            factorial = factorial * i ;
            int m = i * (i-1);
            System.out.println(i + " x " + (i-1)+" = "+m);
        }
        System.out.println("Factorial = "+factorial);
    }
}
