import java.util.Scanner;

public class Problem_6 {
    //Remove all characters from string except alphabets
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        StringBuilder sb = new StringBuilder(str);
        int n = sb.length();
        for(int i=0 ; i<n ; i++){
            char temp = sb.charAt(i);
            if (Character.isAlphabetic(temp) == false) {
                str = str.replace(temp, ' ');
                str = str.replace(" ", "");
            }
        }
        System.out.println(str);
    }
}
