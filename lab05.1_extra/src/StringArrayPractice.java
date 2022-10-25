import java.util.Arrays;

public class StringArrayPractice {
    public static void main(String[] args) {


        String[] myStringArrayA = {"Hello", "Boston"};
        String[] myStringArrayB = {"Hello", "Boston"};
        String[] myStringArrayC = {"Boston", "Hello"};

        boolean equals1 = myStringArrayA.equals(myStringArrayB);
        boolean equals2 = myStringArrayA == myStringArrayB;
        System.out.println(equals1);
        System.out.println(equals2);

        boolean equals3 = Arrays.equals(myStringArrayA, myStringArrayB);
        System.out.println(equals3);
    }
}

