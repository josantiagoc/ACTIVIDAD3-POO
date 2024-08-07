
package ejercicioresuelto7cap4;
import java.util.Scanner;
public class EjercicioResuelto7CAP4 {

    
    public static void main(String[] args) {
        Ventana7CAP4 ventana = new Ventana7CAP4();
        ventana.show(true);
        
        double A,B;
        
        Scanner entrada = new Scanner(System.in);
        System.out.println("Escriba el valor de A:");
        A = entrada.nextDouble();
        
        System.out.println("Escriba el valor de B:");
        B = entrada.nextDouble();
        
        NumerosAB comparacion = new NumerosAB(A,B);
        System.out.println(comparacion.Comparacion());
    }
    
}
