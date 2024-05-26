import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class Servidor {
    public static void main(String[] args) {
        try {
            // Inicie o serviço RMI
            Registry registry = LocateRegistry.createRegistry(1099);
            
            // Crie uma instância da implementação da interface remota
            EquacaoQuadraticaImpl equacaoQuadraticaImpl = new EquacaoQuadraticaImpl();
            
            // Vincule a implementação ao registro RMI com um nome específico
            registry.rebind("EquacaoQuadratica", equacaoQuadraticaImpl);
            
            System.out.println("Servidor pronto para receber chamadas.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
