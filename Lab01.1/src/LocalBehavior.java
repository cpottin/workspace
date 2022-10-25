public class LocalBehavior {
    private static int myInt; //0
    private static String myString; //null

    public static void main(String[] args) {
        myMethod();
    }
    private static void myMethod() {
        //Can you use public or private to local variables?
        //after execution local variable in the stack will be gone
        //setting public and private are not allowed because the accessibility is already defined
        int myLocalInt = 20;
        String myLocalString = "cindy";

        System.out.println(myLocalInt + " " + myLocalString);
        System.out.println(myInt + " " + myString);
    }
}
