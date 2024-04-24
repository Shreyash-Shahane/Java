import java.util.Scanner;

public class Problem_1 {
// Toggle string problem
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ; 
        String str = sc.next();
        String toggle = "";
        for (int i = 0 ; i<str.length();i++){
            if(Character.isUpperCase(str.charAt(i))){
                toggle = toggle + Character.toLowerCase(str.charAt(i));
            }
            else{
                toggle = toggle + Character.toUpperCase(str.charAt(i));
            }
        }
        System.out.println(toggle);
    }
    
}