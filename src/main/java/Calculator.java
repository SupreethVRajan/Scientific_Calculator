import java.io.IOException;
import java.util.Scanner;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Calculator {

    private static final Logger logger = LogManager.getLogger(Calculator.class);
    public Calculator() {

    }
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        int q = Integer.MAX_VALUE;
        while(q != 0) {
            System.out.println("==============================================================");
            System.out.println("Welcome to CUI scientific calculator!!!");
            System.out.println("Addition: 1");
            System.out.println("Subtraction: 2");
            System.out.println("Multiply: 3");
            System.out.println("Divide: 4");
            System.out.println("Factorial: 5");
            System.out.println("Quit: 0");
            System.out.println("Enter an operation: ");

            Scanner scanner = new Scanner(System.in);
            q = scanner.nextInt();
            calc.ResolveQuery(q, scanner);
            try {
                Runtime.getRuntime().exec("clear");
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            System.out.println("==============================================================");
        }
    }

    public void ResolveQuery(int q, Scanner scanner) {
        if(q == 1) {
            System.out.println("Enter the first number");
            double a = scanner.nextDouble();
            System.out.println("Enter the second number");
            double b = scanner.nextDouble();
            System.out.println("Result: " + add(a, b));
        }
        if(q == 2) {
            System.out.println("Enter the first number");
            double a = scanner.nextDouble();
            System.out.println("Enter the second number");
            double b = scanner.nextDouble();
            System.out.println("Result: " + subtract(a, b));
        }if(q == 3) {
            System.out.println("Enter the first number");
            double a = scanner.nextDouble();
            System.out.println("Enter the second number");
            double b = scanner.nextDouble();
            System.out.println("Result: " + multiply(a, b));
        }
        if(q == 4) {
            System.out.println("Enter the first number");
            double a = scanner.nextDouble();
            System.out.println("Enter the second number");
            double b = scanner.nextDouble();
            System.out.println("Result: " + divide(a, b));
        }
        if(q == 5) {
            System.out.println("Enter the first number");
            int a = scanner.nextInt();
            System.out.println("Result: " + factorial(a));
        }
    }

    public double add(double a, double b) {
        logger.info("[ADD] - " + a + " AND " + b);
        double result = a+b;
        logger.info("[RESULT] - " + result);
        return result;
    }

    public double subtract(double a, double b) {
        logger.info("[SUBTRACT] - " + a + " AND " + b);
        double result = a-b;
        logger.info("[RESULT] - " + result);
        return result;
    }

    public double multiply(double a, double b) {
        logger.info("[MULTIPLY] - " + a + " AND " + b);
        double result = a*b;
        logger.info("[RESULT] - " + result);
        return result;
    }

    public double divide(double a, double b) {
        logger.info("[DIVIDE] - " + a + " AND " + b);
        double result = a/b;
        logger.info("[RESULT] - " + result);
        return result;
    }

    public int factorial(int n) {
        int ans = 1;
        for(int i = 1; i <= n; i++) {
            ans = ans*i;
        }
        logger.info("[FACTORIAL] - " + n );
        int result = ans;
        logger.info("[RESULT] - " + result);
        return result;
    }
}
