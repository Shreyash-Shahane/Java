import java.util.Arrays;

public class Problem_5 {
    //Reverse an Array
    public static void main(String[] args) {
        int[] num = {1,2,3,4,5};
        // method 1
        int j =0;
        int[] reverse = new int[num.length];
        for ( int i=num.length - 1 ; i>= 0 ; i--){
                reverse[j] = num [i];
                j++;
        }
        System.out.println(Arrays.toString(reverse));

        //method 2
        int n = num.length;
        int start = 0 , end = n-1;
        while (start<end){
            int temp = num[start];
            num[start] = num[end];
            num [end] = temp;
            start++;
            end--;
        }
        System.err.println(Arrays.toString(num));
    }
}
