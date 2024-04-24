public class palindromePyramid {
    public static void main(String[] args) {
        int n = 5 ;
        for (int i = 1 ; i <= n ; i++) {
        // for spaces
        for (int j = n ; j >= i ; j--) {
            System.out.print(" ");
        }
        // for first pyramid
        for (int j = 1 ; j <= i ; j++) {
            System.out.print(j);
        }
        // for second pyramid
        for (int j = 1 ; j < i ; j++) {
            System.out.print(i-j);
        }
        System.out.println();
    }
}
}
