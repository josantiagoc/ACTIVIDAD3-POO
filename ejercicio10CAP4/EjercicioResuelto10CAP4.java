
package ejercicioresuelto10cap4;
import java.util.Scanner;
public class EjercicioResuelto10CAP4 {

    public static void main(String[] args) {
        Ventana10CAP4 ventana = new Ventana10CAP4();
        ventana.show(true);
        
        double PAT, EST, PAGMAT;
        String NOM, NI;
        
        Scanner entrada = new Scanner(System.in);
        System.out.println("Escriba el numero de inscripcion:");
        NI = entrada.next();
        System.out.println("Escriba el nombre del estudiante:");
        NOM = entrada.next();
        System.out.println("Escriba el patrimonio:");
        PAT = entrada.nextDouble();
        System.out.println("Escriba el estrato social:");
        EST = entrada.nextDouble();
        PAGMAT = 50000;
        
        PagoMatricula pago = new PagoMatricula(PAT, EST, PAGMAT);
        System.out.println("El estudiante con numero de inscripcion "+NI);
        System.out.println("y nombre "+NOM+" debe pagar $"+pago.CalcularPago());
    }
    
}
