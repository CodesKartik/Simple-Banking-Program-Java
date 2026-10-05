import java.util.*;
public class MathWork {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // int r;
        // double circ;
        // double area;
        // double vol;
        // System.out.print("Enter the radius of circle: ");
        // r = scanner.nextInt();
        // circ = 2 * Math.PI * r; 
        // area = Math.PI* Math.pow(r, 2);
        // vol = 4/3 * Math.PI * Math.pow(r, 3);
        // System.out.println("The circumference of circle is: " + circ);
        // System.out.println("The area of circle is: " + area);
        // System.out.println("The volume of circle is: " + vol);
        double a;
        double b;
        double c;
        System.out.print("Enter the length of side A: ");
        a = scanner.nextDouble();

        System.out.print("Enter the length of side B: ");
        b = scanner.nextDouble();

        c = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
        System.out.println("The hypotenuse of triangle is: " + c + "cm");
        scanner.close();
    }
    
}