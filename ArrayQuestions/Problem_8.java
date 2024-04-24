import java.util.Arrays;

public class Problem_8 {
    //First half ascending and second half decending
    public static void main(String[] args) {
        int[] num = {32,6,5,1,0,10};
        int temp ;
        for (int i=0 ; i<num.length-1 ; i++){
            for(int j = 0; j<(num.length-1)/2 ; j++){
                if (num[j]>num[j+1]) {
                    temp = num[j];
                    num[j] = num[j+1];
                    num[j+1]=temp;
                }
            }
            for(int j = num.length/2; j<(num.length-1) ; j++){
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
