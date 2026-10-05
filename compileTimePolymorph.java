

public class compileTimePolymorph {
    static class MathUtils{
        int add(int a , int b) { return a + b; }
        double add(double a, double b) { return a + b; } // overloaded version 
    }
    public static void main(String[] args) {
        MathUtils m = new MathUtils();
        System.out.println(m.add(5, 10)); // resolves to int parameter method
        System.out.println(m.add(4.5, 5.5)); // Resolves to double parameter method
    }
    
}