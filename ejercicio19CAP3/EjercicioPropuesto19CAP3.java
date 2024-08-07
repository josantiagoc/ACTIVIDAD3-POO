
package ejerciciopropuesto19cap3;
import java.util.Scanner;
public class EjercicioPropuesto19CAP3 {
    public static void main(String[] args) {
        Ventana19CAP3 ventana = new Ventana19CAP3();
        ventana.show(true);
        
        double lado;
        
        System.out.println("ingrese cuanto mide el lado del triangulo:");
        Scanner entrada = new Scanner (System.in);
        lado = entrada.nextDouble();
        Triangulo_Equilatero triangulo = new Triangulo_Equilatero(lado);
        
        
        System.out.println("el perimetro del triangulo es: "+ triangulo.CalPerimetro());
        System.out.println("la altura del triangulo es: "+ triangulo.CalAltura());
        System.out.println("el area del triangulo es: "+ triangulo.CalArea());
    }
    
}
