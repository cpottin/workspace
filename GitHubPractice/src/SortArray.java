import java.util.Arrays;

public class SortArray {

    public static void main(String[] args) {


        int [] ints = {3, 9, 6, 2, 1, 10, 5};
        int [] sortedInts = new int[ints.length];

        int smallestNumber = ints[0];
        int currentNumber = ints[0];

        for(int i = 0; i < ints.length ;i ++){
            if (ints[i]< smallestNumber)
                smallestNumber = ints[i];
        }
        System.out.println(smallestNumber);

        for(int i =0; i < ints.length; i ++)
        {for(int j = 0; j <ints.length; j++)
            if(ints[j] < currentNumber)
                sortedInts[i] = ints[i];

        }
        System.out.println(Arrays.toString(sortedInts));
    }


}
