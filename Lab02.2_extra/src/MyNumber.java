public class MyNumber {
    //generator random number - Java Math https://www.geeksforgeeks.org/generating-random-numbers-in-java/
    //Another link for reference https://www.educative.io/answers/how-to-generate-random-numbers-in-java
    // static variable - Why?
    public static int randomInt = 0;
    public static int startValue = 0;
    public static int endValue = 500;

    public static void main(String[] args) {
        System.out.println("Generating random value between " + startValue + " and " + endValue);

        int randomInt = (int)(Math.random()*(endValue-startValue)+startValue);
        System.out.println(randomInt);
    }

}

