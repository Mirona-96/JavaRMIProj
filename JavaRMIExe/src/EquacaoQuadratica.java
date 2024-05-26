import java.rmi.Remote;
import java.rmi.RemoteException;

public interface EquacaoQuadratica extends Remote {

    double calcularRaiz1(double a, double b, double c) throws RemoteException;

    double calcularRaiz2(double a, double b, double c) throws RemoteException;

    double somaRaizes(double a, double b, double c) throws RemoteException;

}
