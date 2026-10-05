
import java.util.Scanner;

public class DayWithSwitchescon {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String day;
        System.out.print("Enter the Day: ");
        day = scanner.nextLine().toUpperCase();
        switch (day) {
            case "MONDAY", "TUESDAY", "WEDNESDAY", "THRUSDAY", "FRIDAY"->
                System.out.println("It's a Weekday: " + day);
            case "SATURDAY", "SUNDAY" ->
                System.out.println("It's a Weekend: " + day);
            default ->
                System.out.println(day + "is not a valid day");
        }
        scanner.close();
    }

}
