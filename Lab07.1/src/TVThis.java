public class TVThis {
    int location = 1;
    int volume;
    public void setLocation(int location) {
        int oldValueLocal = this.location;
        this.location = location;
        System.out.println("old = " + oldValueLocal + "new " + location);

    }
}

class Main {
    public static void main() {

    }
}
