import javax.swing.JOptionPane;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class Cliente {
    public static void main(String[] args) {
        try {
            // Conectar ao serviço RMI
            Registry registry = LocateRegistry.getRegistry("localhost", 1099);

            // Obtenha uma referência para a interface remota
            EquacaoQuadratica equacaoQuadratica = (EquacaoQuadratica) registry.lookup("EquacaoQuadratica");

            // Chame os métodos remotos para calcular as raízes e a soma das raízes da equação quadrática
            double a = 1.0;
            double b = -3.0;
            double c = 2.0;

            double raiz1 = equacaoQuadratica.calcularRaiz1(a, b, c);
            double raiz2 = equacaoQuadratica.calcularRaiz2(a, b, c);
            double somaRaizes = equacaoQuadratica.somaRaizes(a, b, c);

            // Exiba as raízes e a soma das raízes usando JOptionPane
            JOptionPane.showMessageDialog(null, "Raiz 1: " + raiz1 + "\nRaiz 2: " + raiz2 + "\nSoma das raízes: " + somaRaizes);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
