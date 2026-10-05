
class Mobile {
    String brand;
    double price;

    Mobile(String brand, double price) {
        this.brand = brand;
        this.price = price;
    }
    void displayProperties() {
        System.out.println("Brand: " + brand);
        System.out.println("Price: " + price);
    }
}

public class carNameclass {

    public static void main(String[] args) {
        Mobile mobile1 = new Mobile("Samsung", 25000);
        mobile1.displayProperties();
    }
}
