package week1.designprinciples.mandatory.exercise1;

public class Main {
    public static void main(String[] args) {
        Logger logger1 = Logger.getInstance();
        logger1.log("First log message.");

        Logger logger2 = Logger.getInstance();
        logger2.log("Second log message.");

        if (logger1 == logger2) {
            System.out.println("Both logger1 and logger2 point to the same instance.");
        } else {
            System.out.println("Different instances exist! Singleton failed.");
        }
    }
}
