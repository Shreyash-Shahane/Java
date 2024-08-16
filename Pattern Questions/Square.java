/**
 * Square
 */
public class Square {

    public static void printSquare() {
        for (int i = 1; i < 6; i++) {

            for (int j = 1; j < 6; j++) {
                System.out.print("*");
            }
            System.out.println();

        }
    }

    public static void printPyramid() {
        for (int i = 1; i < 6; i++) {

            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();

        }

    }

    public static void printPyramidNum() {
        for (int i = 1; i < 6; i++) {

            for (int j = 1; j <= i; j++) {
                System.out.print(i);
            }
            System.out.println();

        }
    }

    public static void printPyramidNumIncrement() {
        for (int i = 1; i < 6; i++) {

            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();

        }
    }

    public static void printReversePyramid(){
        for (int i = 1; i < 6; i++) {

            for (int j=1; j<=6-i; j++) {
                System.out.print("*");
            }
            System.out.println();

        }

    }

    public static void printReverseNumPyramid(){
        for (int i = 1; i < 6; i++) {

            for (int j=1; j<=6-i; j++) {
                System.out.print(j);
            }
            System.out.println();

        }

    }

    public static void main(String[] args) {
        
        printSquare();
        printPyramid();
        printPyramidNum();
        printPyramidNumIncrement();
        printReversePyramid();
        printReverseNumPyramid();
        
        

        
    }
}