public class Problem_7 {
    // Reverse a string 
    public static void main(String[] args) {
        String s = "Hello";
        char[] c = s.toCharArray();
        String rev = "";
        for (int i = c.length-1; i >= 0; i--) {
            rev = rev + c[i];
        }
        System.err.println(rev);
    }
}
