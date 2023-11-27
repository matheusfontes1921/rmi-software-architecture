import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class Client {

    private Client() {}

    public static void main(String[] args) {
        String host = (args.length < 1) ? null : args[0];
        try {
            Registry registry = LocateRegistry.getRegistry(host);
            Calculadora calculadora = (Calculadora) registry.lookup("Calculadora");

            System.out.println("6 + 1 = " + calculadora.soma(6, 1));
            System.out.println("6 - 1 = " + calculadora.subtracao(6, 1));
            System.out.println("6 * 1 = " + calculadora.multiplicacao(6, 1));
            System.out.println("6 / 1 = " + calculadora.divisao(6, 1));
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }
}