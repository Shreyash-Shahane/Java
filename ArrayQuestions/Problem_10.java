public class Problem_10 {
    //move all zeros to last position
    public static void main(String[] args) {
        int [] arr = {4,1,0,0,0,1,3,0,12};
        int j =  0;
        for (int i = 0; i < (arr.length) ; i++) {
            if (arr[i] != 0) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j++;
            }
        }
        for (int i = 0; i < arr.length ; i++) {
            System.out.println(arr[i]);
        }
    }
}
