public class Problem_18 {
        public static boolean isPalindrome(int x) {
            int r =0;
            while(x!=0){
                int rem = x%10;
                r = r*10 + rem;
                x = x/10;
            }
            System.out.println(r);
            System.out.println(x);
            if(r==x){
                return true;
            }
            else{
                return false;
            }
        }
        public static void main(String[] args) {
            int x = 121;
            System.out.println(isPalindrome(x));
            
        }
}
