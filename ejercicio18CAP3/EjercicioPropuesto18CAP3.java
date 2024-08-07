
package ejerciciopropuesto18cap3;
import java.util.Scanner;
public class EjercicioPropuesto18CAP3 {

    public static void main(String[] args) {
        Ventana18CAP3 ventana = new Ventana18CAP3();
        ventana.show(true);
        
        int CodEmpleado;
        String nombre;
        double numHorasTrabajadas, valorHora, PCTretencion, SALB, SALN, retencion;
        
        Scanner entrada = new Scanner (System.in);
        System.out.println("ingrese el codigo del empleado:");
        CodEmpleado=entrada.nextInt();
        
        System.out.println("ingrese el nombre del empleado:");
        nombre=entrada.next();
        
        System.out.println("ingrese el numero de horas trabajdas del empleado:");
        numHorasTrabajadas=entrada.nextDouble();
        
        System.out.println("ingrese el valor hora trabajada:");
        valorHora=entrada.nextDouble();
        
        System.out.println("ingrese el porcentaje de retencion en la fuente:");
        PCTretencion=entrada.nextDouble();
        
        Salario Csalario = new Salario(numHorasTrabajadas, valorHora, PCTretencion);
        
        System.out.println("el codigo del empleado es: " + CodEmpleado);
        System.out.println("el nombre del empleado es: " + nombre);
        System.out.println("el salario bruto del empleado es: " + Csalario.CalcularSALB());
        System.out.println("el salario neto del empleado es: " + Csalario.CalcularSALN());
    }
    
}
