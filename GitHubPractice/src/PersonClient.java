public class PersonClient {
    public static void main(String[] args) {
        Person person1 = new Person();
        person1.setName("Davis");
        person1.setAge(22);
        String personInfo1 = person1.getPersonInfo();
        System.out.println(personInfo1);

        Person person2 = new Person("Bryce", 25);
        String personInfo = person2.getPersonInfo();
        System.out.println(personInfo);
    }
}
