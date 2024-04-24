import java.util.Arrays;

public class Problem_7 {
    //Sort an array in decending order
    public static void main(String[] args) {
        int[] num = {32,6,5,1,0};
        int temp ;
        for (int i=0 ; i<num.length-1 ; i++){
            for(int j = 0; j<num.length-1 ; j++){
                if (num[j]<num[j+1]) {
                    temp = num[j];
                    num[j] = num[j+1];
                    num[j+1]=temp;
                }
            }
        }
        System.out.println(Arrays.toString(num));
    }
}
