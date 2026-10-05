public class varangs {
    public static void main(String[] args) {
        System.out.println(average(10, 20, 30, 40, 50));
    }
    // static int add(int... numbers){
    //     int sum = 0;
        
    //     for(int number : numbers){
    //         sum += number;
    //     }
    //     return sum;
    // }
    
    static double average(double... numbers){
        double sum = 0;
        for(double number : numbers){
            sum += number;
        }
        return sum / numbers.length;
    }
}
