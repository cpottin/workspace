public class LoopPractice {
    public static void main(String[] args) {

        //for loop is used to iterate for a set number of times
        for (int i = 0; i < 5; i++){
            System.out.println(" Print for loop number : " + i);
        }
        int x = 0;

        //loops through code as long as condition is true
        while (x <= 5){
            System.out.println("Print while loop number : " + x);
            x++;
        }

        //do while checks for condition after execution
        int z = 0;
        do {
            System.out.println("Print do while number : " + z);
            z++;
        }
        while (z < 3);

        int[] ages = {44, 54, 3, 7};

        for (int age : ages){
            if (age ==3){
    continue;
            }
            System.out.println("age = " + age);
        }

        String[] names = {"sang", "cindy", "jason", "joe", "kiaya"};
        for(String name : names){
            if (name.equals("cindy")){
                break;
            }
            System.out.println(name);
        }

    }
}
