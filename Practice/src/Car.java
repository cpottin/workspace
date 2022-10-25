public class Car {
    private String model;
    private Engine engine;
    private Transmission tramission;

    public Car(String model, Engine engine, Transmission tramission){
        this.model = model;
        this.engine = engine;
        this.tramission = tramission;
    }

}
//class Main{
//    public static void main(String[] args) {
//        Car whatever = new Car("Ford", new Engine(), new Transmission());
//    }
//}
