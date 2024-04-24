public class Problem_4 {
    //Sum of elements in array
    public static void main(String[] args) {
        int[] num = {4,6,231,12,533};
        int sum = 0 ;
        for ( int i =0 ; i < num.length ; i++){
            sum = sum + num[i];
        }
        System.out.println(sum);
    }
}
