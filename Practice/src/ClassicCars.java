import java.util.concurrent.Callable;

public class ClassicCars {

    //fields
    int modelYear;
    String modelName;
    String maker;
    String color;
//constructor
    public ClassicCars(int year, String name, String make, String mColor){
        modelYear = year;
        modelName = name;
        maker = make;
        color = mColor;
    }
//main method
    public static void main(String[] args) {
        ClassicCars myCar = new ClassicCars(1976, "Mustang", "Ford", "White");
        System.out.println("My husband loves his " + myCar.modelYear + " " + myCar.maker + " " + myCar.modelName + "!");


            }
        }



//public class Main {
//    int modelYear;
//    String modelName;
//
//    public Main(int year, String name) {
//        modelYear = year;
//        modelName = name;
//    }
//
//    public static void main(String[] args) {
//        Main myCar = new Main(1969, "Mustang");
//        System.out.println(myCar.modelYear + " " + myCar.modelName);
//    }
//}

// Outputs 1969 Mustang
