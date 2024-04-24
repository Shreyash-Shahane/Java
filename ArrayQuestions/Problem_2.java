public class Problem_2 {
    //Find Smallest element in an  array
    public static void main(String[] args) {
        int[] numbers = {1,3,0,2};
        int min = numbers[0];
        for (int i = 0 ; i < numbers.length ; i++){
            if(min > numbers[i]){
                min = numbers[i];
            }
        }
        System.out.println(min);
    }
}
