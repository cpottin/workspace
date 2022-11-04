import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListPractice {
        public static void main(String[] args) {

            ArrayList<String> family = new ArrayList<>();
            family.add("Cindy");
            family.add("Rey");
            family.add("Penny");

            System.out.println(family);

            String[] numbers = {"2", "40", "7", "5"};
            int[] numbersIntegers = new int[numbers.length];

            for(int i = 0; i < numbers.length; i++){
                numbersIntegers[i] = Integer.parseInt(numbers[i]);
            }
            System.out.println(Arrays.toString(numbersIntegers));

        }
    }

