public class Dog {
    //static variable
    private static int barkCount = 0;

    String breed = "Pug";
    String name = "Fido";
    int size = 15;
    boolean hasAllTeeth = true;

    public Dog(){
        barkCount++;
    }

    public static int getBarkCount() {
        return barkCount;
    }

    void eat(){
        System.out.println(name + " is eating.");
    }
    void barks() {

        System.out.println(breed + " barks a lot.");
    }
    void dental(){

        System.out.println("Does " + breed + " have all teeth? " + hasAllTeeth);
    }
    void sleep(){
        System.out.println(breed + " sleeps a lot" );
        }

    @Override
    public String toString() {
        return "Dog{" +
                "breed='" + breed + '\'' +
                ", name='" + name + '\'' +
                ", size=" + size +
                ", hasAllTeeth=" + hasAllTeeth +
                ", barkCount= " + barkCount +
                '}';
    }
}


