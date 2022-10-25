import java.util.Arrays;

public class FamilyNameArray {
    public static void main(String[] args) {

        String[] family = new String[10];
        family[0] = "Cindy";
        family[1] = "Rey";
        family[2] = "Penny";

        System.out.println(Arrays.toString(family));

        String[] numbers = {"2", "40", "7", "5"};
        int[] numbersIntegers = new int[numbers.length];

        for(int i = 0; i < numbers.length; i++){
            numbersIntegers[i] = Integer.parseInt(numbers[i]);
        }
        System.out.println(Arrays.toString(numbersIntegers));

    }
}
