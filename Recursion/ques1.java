//Print numbers from  5 to 1 using recursion
public class ques1 {
    public static void printNumbers(int n) {
        if (n==0)
        return;
        System.out.println(n);
        printNumbers(n-1);
    }
    public static void main(String[] args) {
        printNumbers(5);
    }
}
