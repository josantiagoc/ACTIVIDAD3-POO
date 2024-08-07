
package ejerciciopropuesto22cap4;
import java.util.Scanner;
public class EjercicioPropuesto22CAP4 {

    public static void main(String[] args) {
        Ventana22CAP4 ventana = new Ventana22CAP4();
        ventana.show(true);
        
        String NOM;
        double SALB, NUMH;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Escriba el nombre del empleado:");
        NOM = entrada.next();
        
        System.out.println("Ingrese el salario basico:");
        SALB = entrada.nextDouble();
        System.out.println("Ingrese el numero de horas trabajadas al mes:");
        NUMH = entrada.nextDouble();
        
        Empleado salarioempleado = new Empleado(NOM, SALB, NUMH);
        salarioempleado.CalcularSalarioMensual();
        System.out.println(salarioempleado.SalidaEmpleado());
    }
    
}
