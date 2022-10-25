public class FlowControl {
//    boolean isItEvenNumber;
//    int number = 0;

    public static boolean isItEvenNumber(int number) {
        if (number%2==0){
            System.out.println("The number is even. You entered: " + number);
            return true;
        }
        else{
            System.out.println("The number is odd. You entered: " + number);
        return false;
        }
    }
}
