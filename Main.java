import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String self = scanner.nextLine();
        System.out.println(self);
        System.out.println("Hello " + self);
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();
        System.out.println("Your are " + age + " year's old");
        boolean isName = true;
        if (isName) {
            System.out.println("Hello! Sir");
        }
        scanner.close();
        String alp = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        System.out.println(alp.length());
        System.out.println(alp.toLowerCase());
        System.out.println(alp.indexOf('K'));
        System.out.println(alp.charAt(10));

        String txt1 = "abc";
        String txt2 = "abc";
        String txt3 = "Greetings";
        String txt4 = "Great things";
        System.out.println(txt1.equals(txt2));  // true
        System.out.println(txt3.equals(txt4));  // false


    }
}
