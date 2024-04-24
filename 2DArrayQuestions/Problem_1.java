import java.util.Scanner;

public class Problem_1 {
    // Taking input from user and add it in 2d array
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] num = new int [n][m];
        for (int i = 0 ; i < n ; i++){
            for (int j = 0 ; j < m ; j++){
                System.out.print("Enter number in row "+(i+1)+" column "+(j+1)+" :-");
                num[i][j]=sc.nextInt();
            }
        }
        for (int i = 0 ; i < n ; i++){
            for (int j = 0 ; j < m ; j++){
                System.out.print(num[i][j]+" ");
            }
            System.out.println();
        }
    }
}