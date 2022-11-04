public class BottleSong {
    public static void main(String[] args) {
        int bottleNumber = 99;
        String word = "bottles";

        while (bottleNumber > 0) {
            if (bottleNumber == 1) {
                word = "bottle";
            }
            System.out.println(bottleNumber + " " + word + " of beer on the wall.");
            System.out.println(bottleNumber + " " + word + " of beer.");
            System.out.println("Take one down and pass it around. ");
            bottleNumber = bottleNumber - 1;
            if (bottleNumber > 0) {
                System.out.println(bottleNumber + " " + " of beer on the wall.");
            }
            else {
                System.out.println("No bottle of beer on the wall");
            }
        }

    }
}

