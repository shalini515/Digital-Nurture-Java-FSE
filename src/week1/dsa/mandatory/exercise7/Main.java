package week1.dsa.mandatory.exercise7;

public class Main {
    public static double futureVal(double initialAmount, double growthRate, int years) {
        if (years == 0) {
            return initialAmount; // base case
        }
        return futureVal(initialAmount, growthRate, years - 1) * (1 + growthRate);
    }

    public static void main(String[] args) {
        double initialAmount = 10000;
        double growthRate = 0.1;
        int years = 5;

        double predictedVal = futureVal(initialAmount, growthRate, years);
        System.out.printf("Predicted future value after %d years: ₹%.2f%n", years, predictedVal);
    }
}