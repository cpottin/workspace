public class Subtraction {
    public static void main(String[] args) {
    int x = 1;
    int y = 10;
    int z = 100;
    int diff1;
    int diff2;

    //without Math
    int i = z-y-x;
        System.out.println(i);

    //using Math
        diff1 = Math.subtractExact(z,y);
        System.out.println(diff1);

        diff2 = Math.subtractExact(y,x);
        System.out.println(diff2);
    }
}
