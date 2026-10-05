public class ControlFlowDemo{
    public static void validteUserAge (int userAge) {
        if (userAge < 18) {
            throw new IllegalArgumentException("Registration denied: User must be at least 18 years old");
        }
    }
    public static void main(String[] args) {
        try {
            validteUserAge(16);
        } catch (IllegalArgumentException ex) { System.out.println("Caught Error: " + ex.getMessage());
        } finally { System.out.println("Execution pipeline completed safely.");
        }
    }

}
