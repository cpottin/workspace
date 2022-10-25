public class WhilePractice {
    public static void main(String[] args) {
        int index = 5;
        //while loop
        while (index > 0){
            System.out.println("index = " + index);
            index--;

        }
        //do while loop
        int index2 = 4;
        do {
            System.out.println("index 2 = " + index2);
            index2--;
        }
        while (index2 > 0);
//for loop
        for (int index3 = 5; index3 <=3; index3++){
            System.out.println(index3 + " ");
    }
        for (int index4 = 5; index4 >0; index4--){
            System.out.println("index4 " + index4);
        }

    }
}
