public class Person {
    //fields - instance variables
    private String name;
    private int age;

    //constructor
//    public Person(String name, int age) {
//        this.name = name;
//        this.age = age;
//    }

    //method
    public void standUp(){
        System.out.println(name + "stood up.");
    }
    public int moveTo(String destination){
        return 5;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

class Main {
    public static void main(String[] args) {
        Person person = new Person();
        person.setAge(10);
        person.setName("Shawn");
        System.out.println(person);

    }
}