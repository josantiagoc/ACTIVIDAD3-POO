
package ejerciciopropuesto23cap4;
import java.util.Scanner;
public class EjercicioPropuesto23CAP4 {

    public static void main(String[] args) {
        Ventana23CAP4 ventana = new Ventana23CAP4();
        ventana.show(true);
        
        double A,B,C;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Escriba el valor de A:");
        A = entrada.nextDouble();
        System.out.println("Escriba el valor de B:");
        B = entrada.nextDouble();
        System.out.println("Escriba el valor de C:");
        C = entrada.nextDouble();
        
        EcuacionCuadratica Ecuadratica = new EcuacionCuadratica(A,B,C);
        System.out.println(Ecuadratica.EncontrarSoluciones());
    }
    
}
