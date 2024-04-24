import java.util.Scanner;

public class Problem_3 {
    //Remove vowels from a string
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.next();
        for (int i=0 ; i<str1.length() ; i++){
            Character s = str1.charAt(i);
            if(s.equals('a')||s.equals('e')||s.equals('i')||s.equals('o')||s.equals('u')){
                Character str2 = str1.charAt(i); 
                str1 = str1.replace(String.valueOf(str2),"");
            }
        }
        System.out.println(str1);
    }
}
