abstract class appliance {
    abstract void turnOn();
    void displayPowerSource() {
        System.out.println("Standard power source");
    }
}
class washingMachine extends appliance {
    @Override
    void turnOn() {
        System.out.println("Washing machine is now ON");
    }
}

public class abstractAppliance {
    public static void main(String[] args) {
        appliance myAppliance = new washingMachine();
        myAppliance.turnOn(); // Calls the overridden method in washingMachine
        myAppliance.displayPowerSource(); // Calls the concrete method in appliance
    }
    
}


