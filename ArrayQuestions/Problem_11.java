public class Problem_11 {
    //Find frequency of a number in array 
    public static void main(String[] args) {
        Integer[] numbers = {1, 2, 10, 20, 40, 20, 20};
        int num = 20 ;
        int frequency = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == num) {
                frequency++;
            }
        }
        System.out.println(frequency);
    }
}