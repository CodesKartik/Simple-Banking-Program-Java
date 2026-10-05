public class abstractionInherit {
    public static void main(String[] args) {
        vehicle c = new car();
        c.startEngine();
        c.displayfuel();
    }
}
abstract class vehicle {
    abstract void startEngine();
    void displayfuel() {
        System.out.println("Standard fuel system");
    }
}
class car extends vehicle {
    @Override
    void startEngine() {
        System.out.println("Car start with push button");
    }
}