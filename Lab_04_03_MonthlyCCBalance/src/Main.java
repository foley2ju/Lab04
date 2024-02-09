public class Main {
    public static void main(String[] args)
    {
        double creditBalance = 5000.0;
        double INTEREST_RATE = 0.17;
        double interestBalance = 0.0;
        double totalBalance = 0.0;

        interestBalance = creditBalance * INTEREST_RATE;
        totalBalance = interestBalance + creditBalance;
        System.out.println("The balance for the first month is " + totalBalance);

        interestBalance = totalBalance * INTEREST_RATE;
        totalBalance = totalBalance + interestBalance;
        System.out.println("The balance for the second month is " + totalBalance);

    }
}