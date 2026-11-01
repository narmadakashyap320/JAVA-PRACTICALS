import java.rmi.registry.*;
import java.util.Scanner;

public class RMIClient {

    public static void main(String[] args) {

        try {
            Registry registry =
                LocateRegistry.getRegistry("localhost", 1099);

            CalculatorRemote obj =
                (CalculatorRemote) registry.lookup("Calculator");

            Scanner sc = new Scanner(System.in);

            System.out.print("Enter first number: ");
            int a = sc.nextInt();

            System.out.print("Enter second number: ");
            int b = sc.nextInt();

            System.out.println("Addition: " + obj.add(a, b));

            System.out.println("Subtraction: " +
                obj.subtract(a, b));

            System.out.println("Multiplication: " +
                obj.multiply(a, b));

            sc.close();

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
