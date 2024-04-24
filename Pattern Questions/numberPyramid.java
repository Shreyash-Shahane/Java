public class numberPyramid {
    public static void main(String[] args) {
        int n = 4 , x = 1;
        for (int i = 1 ; i <= n ; i++) {
            //for spaces
            for (int j = 0 ; j < n-i ; j++) {
                System.out.print(" ");
            }
            for (int j = 1 ; j <= i ; j++) {
                System.out.print(x + " ");
                x++;
            } 
            System.out.println();
        }
    }
}
