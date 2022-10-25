class NewPractice {
    public static void main(String[] args) {

        String myName = "Cindy";
        System.out.println(myName.length());
        System.out.println(myName.toUpperCase());
        burp();
        printName("Cindy");

    }

    private static void burp(){
        System.out.println("Buurrrppppp");
    }

    private static void printName(String name){
        System.out.println("My name is " + name);
    }
}
