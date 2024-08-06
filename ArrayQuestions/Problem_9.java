public class Problem_9 {
    //Reverse Array without using memory allocation
    public static void main(String[] args) {
        int [] arr = {1, 2, 3, 4, 5 , 6};
        for (int i = 0; i < (arr.length)/2 ; i++) {
            arr[i] = arr[i] + arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = arr[i] - arr[arr.length - 1 - i];
            arr[i] = arr[i] - arr[arr.length - 1 - i];
        }
        for (int i = 0; i < arr.length ; i++) {
            System.out.println(arr[i]);
        }
    }
}
