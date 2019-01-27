      import java.util.Arrays;

public class Number1 {
    public static void main(String[] args) {
        int[] numbers = new int[50];
        int i = 0;

        while (i < numbers.length)  {
            numbers[i] = 2*(i+1);
            i++;
        }
        String arrayString = Arrays.toString(numbers);
        System.out.println(arrayString);

         int sum = 0;
         int j = 0;
         while ( j < numbers.length) {
             sum = sum + numbers[j];
              j++;

         }
        System.out.println(sum);
    }

}




















