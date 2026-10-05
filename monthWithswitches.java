
import java.util.Scanner;

public class monthWithswitches {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String month;
        System.out.print("Enter the Month: ");
        month = scanner.nextLine().toUpperCase();
        switch (month) {
            case "JANUARY", "FEBRUARY", "MARCH", "APRIL" ->
                System.out.println("It's in first quarter of a year: " + month);
            case "MAY", "JUNE", "JULY", "AUGUST" ->
                System.out.println("It's in MID quarter of a year: " + month);
            case "SEPTEMBER", "OCTOBER", "NOVEMBER", "DECEMBER" ->
                System.out.println("It's in final quarter of year: " + month);
            default ->
                System.out.println(month + "is not a valid month");
        }
        scanner.close();
    }

}
