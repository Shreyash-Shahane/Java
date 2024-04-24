import java.util.Scanner;

public class Problem_5 {
    //Remove spaces in string
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str =sc.nextLine();
        System.out.println(str);
        str = str.replaceAll(" ", "");
        System.out.println(str);
    }
    
}