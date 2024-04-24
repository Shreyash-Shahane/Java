import java.util.Scanner;

public class Problem_2 {
    // Count number of vowels in string
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int count = 0;
        for (int i=0 ; i<str.length() ; i++){
            Character s = str.charAt(i);
            if(s.equals('a')||s.equals('e')||s.equals('i')||s.equals('o')||s.equals('u')){
                count++;
            }
        }
        System.out.println(count);
    }
}
