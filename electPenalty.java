import java.util.Scanner;

public class electPenalty {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int amount;
        int noOfmonth;
        double finalAmount;
        double penaltyRate;
        double penalty;

        System.out.print("Enter the Amount: ");
        amount = scanner.nextInt();

        System.out.print("Enter the no. of months: ");
        noOfmonth = scanner.nextInt();

        if(amount <= 0){
            System.out.println("The amount is zero");
            System.out.println("There is no penalty");
        }
        else{
            switch (noOfmonth) {
                case 1 -> {
                    System.out.println("The penalty is 10% of your amount");
                    penaltyRate = 0.10;
                }
                case 2 -> {
                    System.out.println("The penalty is 20% of your amount");
                    penaltyRate = 0.20;
                }
                case 3 -> {
                    System.out.println("The penalty is 30% of your amount");
                    penaltyRate = 0.30;
                }
                case 4 -> {
                    System.out.println("The penalty is 40% of your amount");
                    penaltyRate = 0.40;
                }
                case 5 -> {
                    System.out.println("The penalty is 50% of your amount");
                    penaltyRate = 0.50;
                }
                case 6 -> {
                    System.out.println("The penalty is 60% of your amount");
                    penaltyRate = 0.60;
                }
                default -> {
                    System.out.println("penalty is applicable uppto 6 month.");
                    scanner.close();
                    return;
                }
            }

            penalty = amount *  penaltyRate;
            finalAmount = amount + penalty;

            System.out.println("THe final amount after the penalty rate is : " + finalAmount);

        }

        scanner.close();


    }    
}


