package animal;

public class AnimalClass {
    private String name;

    public AnimalClass(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void breathe() {
        System.out.println("breathe by Animal Class");
    }
}


class Cat extends AnimalClass {


    public Cat(String name) {
        super(name);
    }

    @Override
    public void breathe() {
        System.out.println(getName() + " breathe by Cat Class");
    }
}

class Dog extends AnimalClass{
    public Dog(String name) {
        super(name);
    }


    @Override
    public void breathe(){
        System.out.println(getName() + "dog is breathing");
    }
}

class AnimalHospital{
    AnimalClass[] animals = new AnimalClass[100];
    private int currentIndex = 0;

    public AnimalHospital() {
        Cat cat1 = new Cat("Rocky");
        animals[currentIndex++] = cat1;
        Dog dog1 = new Dog("Ruby");
        animals[currentIndex++] = dog1;
    }

    public void letAllAnimalsBreathe(){
       for (int i = 0; i < currentIndex; i ++){
           animals[i].breathe();
       }
    }
}

class Main{
    public static void main(String[] args) {
        AnimalHospital animalHospital = new AnimalHospital();
        animalHospital.letAllAnimalsBreathe();
    }
}