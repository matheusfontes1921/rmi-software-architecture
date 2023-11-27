import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class CalcFuncionando extends UnicastRemoteObject implements Calculadora {

    public CalcFuncionando() throws RemoteException {
        super();
    }
    @Override
    public double divisao(double a, double b) throws RemoteException {
        return a / b;
    }
    @Override
    public double multiplicacao(double a, double b) throws RemoteException {
        return a * b;
    }

    @Override
    public double soma(double a, double b) throws RemoteException {
        return a + b;
    }

    @Override
    public double subtracao(double a, double b) throws RemoteException {
        return a - b;
    }




}