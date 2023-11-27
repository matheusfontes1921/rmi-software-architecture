import java.rmi.registry.Registry;
import java.rmi.registry.LocateRegistry;
public class Server {

    public Server() {}

    public static void main(String args[]) {
        try {
            CalcFuncionando calculadora = new CalcFuncionando();
            Registry registry = LocateRegistry.createRegistry(1099);
            registry.bind("Calculadora", calculadora);

            System.err.println("Ready to go");
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }
}