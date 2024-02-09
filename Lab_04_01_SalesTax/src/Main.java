public class Main
{
    public static void main(String[] args)
    {
        double itemPrice = 7.50;
        double SALES_TAX_RATE = 0.05;
        double salesTax = 0.0;
        double totalPrice = 0.0;

        salesTax = itemPrice * SALES_TAX_RATE;
        totalPrice = salesTax + itemPrice;

        System.out.println("The item price is " + itemPrice);
        System.out.println("The sales tax is " + salesTax);
        System.out.println("The total price is " + totalPrice);
    }
}