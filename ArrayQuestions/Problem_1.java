//Find largest Element in Array
public class Problem_1 {
public static void main(String[] args) {
    int[] numbers ={2,3,5,9,1};
    int max = numbers[0];
    for (int i = 0 ; i<numbers.length ; i++){
        if (max < numbers[i]){
            max = numbers[i];
        }
    }
    System.out.println(max);
}
    
}