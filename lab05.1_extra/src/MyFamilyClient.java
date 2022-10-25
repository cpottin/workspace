import java.util.EnumSet;

public class MyFamilyClient {

    public static void main(String[] args) {
        for (MyFamily member : MyFamily.values()) {
            System.out.println("Names of my family: " + member);
        }

        for (MyFamily m : EnumSet.range(MyFamily.Cindy, MyFamily.Jay)) {
            ;
            System.out.println(m);
        }

//        EnumSet<MyFamily> e_set;
//        e_set = EnumSet.range(MyFamily.Cindy, MyFamily.Jay);
//        System.out.println("The family range is set at : " + e_set);
    }
}
