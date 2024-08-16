import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class bankingSystem {
        public static int pin1 , pin2 ;
        public static int accountNumber;
        public static  ArrayList<int[]> accountNumbers = new ArrayList<>();
        public static int userNo ;
    public static int generateAccountNo(){
        Random random = new Random();
        int min = 100000000; // Minimum 10 digit number
        int max = 999999999; // Maximum 10 digit number
        accountNumber = min + (int) (random.nextDouble() * (max - min));
        return accountNumber;
    }

    public static void createAccount(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Full name: ");
        String Name = sc.nextLine();
        System.out.println(Name);
        System.out.println("Enter Date of birth (DD/MM/YYYY): ");
        String dob = sc.nextLine();
        System.out.println(dob);
        accountNumbers.add(new int[3]);
        int[] accountDetails = accountNumbers.get(userNo);
        System.out.println("SET PIN: ");
        pin1 = sc.nextInt();
        System.out.println("CONFIRM PIN: ");
        pin2 = sc.nextInt();
        accountNumber = generateAccountNo();
        accountDetails[0]= accountNumber;
        accountDetails[1]= pin1;
        accountDetails[2]= 0;
        while (pin1 != pin2) {
            System.out.println("Incorrect PIN Entered");
            System.out.println("CONFIRM PIN: ");
            pin2 = sc.nextInt();
        }
            System.out.println("Account created successfully");
            System.out.println("Your account number is : "+accountNumber);

    }

    public static void depositMoney(){
        Scanner sc = new Scanner(System.in);
        int counter = 0;
        System.out.println("Select Account Number : ");
        for (int i = 0; i < accountNumbers.size(); i++) {
            int[] array = accountNumbers.get(i);
            for (int j = 0; j < 1; j++) {
                System.out.print((counter+1)+ ". " +array[j]);
            }
            counter++;
            System.out.println();
        }
        int account = sc.nextInt();
        int[] array = accountNumbers.get(account-1);
        System.out.print("Enter PIN : ");
        int pin = sc.nextInt();
        while (pin != array[1]) {
            System.out.println("Incorrect PIN Entered");
            System.out.println("ENTER PIN: ");
            pin = sc.nextInt();
        }
        System.out.println("Enter Amount to be deposited : ");
        int amount = sc.nextInt();
        array[2] = array[2] + amount ; 
        System.out.println("Amount deposited successfully");
        System.out.println("Current Balance is : "+array[2]);   
    }

    public static void withdrawMoney(){
        Scanner sc = new Scanner(System.in);
        int counter = 0;
        System.out.println("Select Account Number : ");
        for (int i = 0; i < accountNumbers.size(); i++) {
            int[] array = accountNumbers.get(i);
            for (int j = 0; j < 1; j++) {
                System.out.print((counter+1)+ ". " +array[j]);
            }
            counter++;
            System.out.println();
        }
        int account = sc.nextInt();
        int[] array = accountNumbers.get(account-1);
        System.out.print("Enter PIN : ");
        int pin = sc.nextInt();
        while (pin != array[1]) {
            System.out.println("Incorrect PIN Entered");
            System.out.println("ENTER PIN: ");
            pin = sc.nextInt();
        }
        System.out.println("Enter Amount to be Withdrawn : ");
        int amount = sc.nextInt();
        if (array[2] < amount) {
            System.out.println("Insufficient Balance");
            return;
        }
        array[2] = array[2] - amount ; 
        System.out.println("Amount Withdrawn successfully");
        System.out.println("Current Balance is : "+array[2]);   
    }
    public static void checkBalance(){
        Scanner sc = new Scanner(System.in);
        int counter = 0;
        System.out.println("Select Account Number : ");
        for (int i = 0; i < accountNumbers.size(); i++) {
            int[] array = accountNumbers.get(i);
            for (int j = 0; j < 1; j++) {
                System.out.print((counter+1)+ ". " +array[j]);
            }
            counter++;
            System.out.println();
        }
        int account = sc.nextInt();
        int[] array = accountNumbers.get(account-1);
        System.out.print("Enter PIN : ");
        int pin = sc.nextInt();
        while (pin != array[1]) {
            System.out.println("Incorrect PIN Entered");
            System.out.println("ENTER PIN: ");
            pin = sc.nextInt();
        }
        System.out.println("Current Balance is : "+array[2]);   
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Select one of the following");
        System.out.println("1. Create Account 2.Deposit Money 3.Withdraw Money 4.Check Balance 5.Exit");
        int operation = sc.nextInt();
        while (operation!=5) {
            switch (operation) {
                case 1:createAccount();
                    break;
                    case 2:depositMoney();
                    break;
                    case 3:withdrawMoney();
                    break;
                    case 4:checkBalance();
                    break;     
                default:
                    break;
            }
        System.out.println("Select one of the following");
        System.out.println("1. Create Account 2.Deposit Money 3.Withdraw Money 4.Check Balance 5.Exit");
        operation = sc.nextInt();
        userNo++;
        }
        System.out.println("THANK YOU !!");
        // for (int i = 0; i < accountNumbers.size(); i++) {
        //     int[] array = accountNumbers.get(i);
        //     System.out.print("Account Details : ");
        //     for (int j = 0; j < array.length; j++) {
        //         System.out.print(array[j] + " ");
        //     }
        //     System.out.println();
        // }
        
    }
}