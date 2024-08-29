public class Problem_9 {
    public static void main(String[] args) {
        // 1st method Without using functions
        String s = "My name is Shreyash     and I am    ";
        String [] words = s.split(" ");
        System.out.println(words[words.length - 1].length());

        // 2nd method Without using functions
        int count = 0;
        for (int i = s.length()-1; i > 0; i--) {
            if(s.charAt(i) != ' '  ){
                count++;
            }
            else if(s.charAt(i) == ' ' && count != 0){
                break;
            }
        }
        System.out.println(count);
    }
}
