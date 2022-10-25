public class DogClient {
    public static void main(String[] args) {
        Dog dog1 = new Dog();
        dog1.breed = "Blue Healer";
        dog1.name = "Ruby";
        dog1.size = 32;
        dog1.hasAllTeeth = true;

        dog1.eat();
        dog1.barks();
        dog1.dental();
        dog1.sleep();

        Dog dog2 = new Dog();
        dog2.eat();
        dog2.barks();
        dog2.dental();
        dog2.sleep();

        dog2.barks();
        dog1.barks();

        System.out.println(dog2);
        System.out.println(dog1);

    }
}
