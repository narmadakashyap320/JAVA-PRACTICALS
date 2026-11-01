import java.rmi.registry.*;

public class RMIServer {

    public static void main(String[] args) {

        try {
            CalculatorRemote obj =
                new CalculatorRemoteImpl();

            Registry registry =
                LocateRegistry.createRegistry(1099);

            registry.rebind("Calculator", obj);

            System.out.println("RMI Server Started");

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
