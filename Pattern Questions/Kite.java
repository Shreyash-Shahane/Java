public class Kite {
    public static void main(String[] args) {
        int n = 10;
        for (int i = 1 ; i <= n ; i++) {
            //for spaces
            for (int j = 1 ; j <= n-i ; j++) {
                System.out.print(" ");
            }
            for (int j = 1 ; j <= i ; j++) {
                if (i == 1 || j == 1 || j == i) {
                    System.out.print("* ");    
                }
                else{
                    System.out.print("  ");
                }
            } 
            System.out.println();
        }
        for (int i = n ; i >= 1 ; i--) {
            //for spaces
            for (int j = 1 ; j <= n-i ; j++) {
                System.out.print(" ");
            }
            for (int j = 1 ; j <= i ; j++) {
                if (i == 1 || j == 1 || j == i) {
                    System.out.print("* ");    
                }
                else{
                    System.out.print("  ");
                }
            } 
            System.out.println();
        }
    }
}
