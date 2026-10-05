
public class controlFlowTask {

    public static void validteStudentmarks(int stdMarks) {
        if (stdMarks < 0 || stdMarks > 100) {
            throw new IllegalArgumentException("Marks can't be outside the range");
        }
    }

    public static void main(String[] args) {
        try {
            validteStudentmarks(106);
        } 
        catch (IllegalArgumentException ex) {
            System.out.println("Caught Error: " + ex.getMessage());
        }
    }

}
