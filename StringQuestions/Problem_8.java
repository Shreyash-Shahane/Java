public class Problem_8 {
    // Reverse each word in sentence without changing the order of words
    public static void main(String[] args) {
        String s = "My name is Shreyash";
        String rev = "";
        String [] words = s.split(" ");
        for (int i = 0; i < words.length; i++) {
            char[] c = words[i].toCharArray();
            for (int j = c.length-1; j >= 0 ; j--) {
                rev = rev + c[j];
            }
            rev = rev + " ";
        }
        System.out.println(rev);
    }
}