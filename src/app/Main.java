package app;

public class Main {
    public static double income;
    public static double taxRate1;
    public static double taxRate2;
    public static double taxRate3;
    private static final String CURRENCY = "UAH";
    public static double taxSum;

    public static void main(String[] args) {
        income = 15570.45;
        taxRate1 = 2.5;
        taxRate2 = 4.3;
        taxRate3 = 6.7;

        if (income > 0 & income <= 10000) {
            taxSum = (income * taxRate1) / 100;
            System.out.printf("%nIncome %.2f %s is taxed at %.1f%% rate.%n" +
                            "The sum of tax is %.2f %s.%n",
                    income, CURRENCY, taxRate1, taxSum, CURRENCY);
        }
    }
}
