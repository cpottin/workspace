import java.util.Locale;

public class ArrayExample {

    public static void main(String[] args) {
        myVars("Dawn");
        myVars( "Dawn", "Lisa");
        myVars("Dawn", "Lisa", "Andrea");

//        String[] names = {"John", "Lily", "Jim", "Sherry", "Cindy", "Rey", "Penny"};
//        for (String name : names) {
//            System.out.println(name.toUpperCase());
//        }

        int[] findOddNumbersFromArray = {1,2,3,4,5,6,7,8,9};

            System.out.println("Odd Numbers: ");
            for (int i = 0; i < findOddNumbersFromArray.length; i++) {
                if (findOddNumbersFromArray[i] % 2 != 0) {
                    System.out.println(findOddNumbersFromArray[i]);
                }
            }

//        int[] findLargestNumberFromArray = {8,3,2,1,4,5,6,10,8,2,3};
//        System.out.println("Largest Number: ");
//        for(int i = 0; i < findLargestNumberFromArray.length; i++){
//            if (findLargestNumberFromArray[i] > findLargestNumberFromArray[i-1]) {
//            }
//        }
    }
    private static void myVars(String ... friends){
        for (String friend : friends) {
            System.out.println(friend);
        }
        System.out.println();
    }
}
