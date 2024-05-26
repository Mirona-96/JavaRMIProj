import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class EquacaoQuadraticaImpl extends UnicastRemoteObject implements EquacaoQuadratica {
    public EquacaoQuadraticaImpl() throws RemoteException {
        super();
    }

    public double calcularRaiz1(double a, double b, double c) throws RemoteException {
        double delta = b * b - 4 * a * c;
        
        // Verifique se o delta é negativo
        if (delta < 0) {
            // Retorne um valor especial para indicar que não há raízes reais
            return Double.NaN;
        }
        
        double raiz1 = (-b + Math.sqrt(delta)) / (2 * a);
        return raiz1;
    }
    
    public double calcularRaiz2(double a, double b, double c) throws RemoteException {
        double delta = b * b - 4 * a * c;
        
        // Verifique se o delta é negativo
        if (delta < 0) {
            // Retorne um valor especial para indicar que não há raízes reais
            return Double.NaN;
        }
        
        double raiz2 = (-b - Math.sqrt(delta)) / (2 * a);
        return raiz2;
    }

    @Override
    public double somaRaizes(double a, double b, double c) throws RemoteException  {
        double raiz1 = calcularRaiz1(a, b, c);
        double raiz2 = calcularRaiz2(a, b, c);
        return raiz1 + raiz2;
    }
    
}
