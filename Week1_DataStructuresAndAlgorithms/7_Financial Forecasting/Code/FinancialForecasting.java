import java.util.*;

public class FinancialForecasting {

    public static double futureValue(double initialVal, double grthRate, int years) {
        
        if (years == 0) {
            return initialVal;
        }
        
        return futureValue(initialVal, grthRate, years - 1) * (1 + grthRate);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the initial amount: ");
        double principal = scanner.nextDouble();
        
        System.out.print("Enter the annual growth rate (as a decimal): ");
        double rate = scanner.nextDouble();
        
        System.out.print("Enter the number of years: ");
        int years = scanner.nextInt();

        double futureVal = futureValue(principal, rate, years);
        System.out.println("Future value after "+ years + " years: "+  futureVal);
    }
}
