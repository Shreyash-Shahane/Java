import java.util.Scanner;

public class Problem_1 {
    //Check if a number is positive or negative
    //Brute Force Code
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); 
        if (n < 0){
            System.out.println("Number is negative");
        }
        else if( n > 0){
            System.out.println("Number is positive");
        }
        else {
            System.out.println("Number is zero");
        }   
        
    // Second option
    
        if (n >= 0){
            if (n==0){
                System.out.println("Number is zero");
            }
            else {
                System.out.println("Number is positive");
            }
        }
        else {
            System.out.println("Number is negative");
        }
        }
    }
