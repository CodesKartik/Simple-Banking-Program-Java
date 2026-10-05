import java.util.Scanner;
public class Weightcon {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            double temp;
            double newTemp;
            String unit;
            System.out.print("Enter the temp: ");
            temp = scanner.nextDouble();
            
            System.out.print("Convert to Celsius or Fehranheit (C or F): ");
            unit = scanner.next().toUpperCase();
            
            // (Conditon) ? true : false;
            newTemp = (unit.equals("C")) ? (temp - 32) * 5 / 9 : (temp * 9 / 5) + 32;
            
            // System.out.println("Weigth Conversion program ");
            // System.out.println("1 for lbs to kgs: ");
            // System.out.println("2 for kgs to lbs: ");
            
            // System.out.print("Choose an option: ");
            // choice = scanner.nextInt();
            // if(choice == 1) {
            //     System.out.print("Enter Weight in Lbs: ");
            //     weight = scanner.nextDouble();
            //     netWeight = weight * 0.453592;
            //     System.out.printf("The net weight is: %.2f" + netWeight);
            // }
            // else if (choice == 2) {
            //     System.out.print("Enter Weight in Kgs: ");
            //     weight = scanner.nextDouble();
            //     netWeight = weight * 2.204;
            //     System.out.printf("The net weight is: %.2f" + netWeight);
            // }
            // else {
            //     System.out.println("Enter a valid Choice ");
            // }
            // System.out.println("Re-run for the another conversion. ");
            System.out.printf("%.1f", newTemp);
        }
    }
    
}
