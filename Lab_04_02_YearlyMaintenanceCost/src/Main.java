public class Main {
    public static void main(String[] args)
    {
        double springCost = 50.50;
        double summerCost = 75.0;
        double fallCost = 60.0;
        double winterCost = 150.50;
        double yearlyCost = 0.0;
        yearlyCost = springCost + summerCost + fallCost + winterCost;

        System.out.println("The maintenance cost for spring is " + springCost);
        System.out.println("The maintenance cost for summer is " + summerCost);
        System.out.println("The maintenance cost for fall is " + fallCost);
        System.out.println("The maintenance cost for winter is " + winterCost);
        System.out.println("The total maintenance cost for the year is " + yearlyCost);

    }
}