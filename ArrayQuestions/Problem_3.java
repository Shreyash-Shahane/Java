public class Problem_3 {
    //Finding smallest and largest element in array
    public static void main(String[] args) {
        int [] numbers = {4,6,12,45,23};
        int max = numbers[0];
        int min = numbers[0];
        for (int i = 0 ; i < numbers.length ; i++){
            if (max < numbers[i]) {
                max = numbers[i];
            }
            if (min > numbers[i]) {
                min = numbers[i];
            }
        }
        System.out.println(max);
        System.out.println(min);
    }
}
