/**
 * roman
 */
public class roman {

    public static void main(String[] args) {
        String str = "III";
        int sum = 0;
        for (int i = 0 ; i<str.length(); i++){
            if(str.charAt(i) == 'I'){
                sum += 1;
            }
        }
        System.out.println(sum);
    }
}