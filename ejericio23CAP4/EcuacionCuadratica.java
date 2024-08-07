
package ejerciciopropuesto23cap4;

public class EcuacionCuadratica {
    double A,B,C,x1,x2;
    
    EcuacionCuadratica(double A, double B, double C){
        this.A = A;
        this.B = B;
        this.C = C;
    }
    String EncontrarSoluciones(){
        if (A != 0){
            if ((B*B)-(4*A*C) >= 0){
                x1 = (-B + Math.sqrt((B*B)-(4*A*C)))/(2*A);
                x2 = (-B - Math.sqrt((B*B)-(4*A*C)))/(2*A);
                return "x1: "+x1+" y x2: "+x2;
            } else {
                return "El resultado es un numero imaginario";
            }
        }else {
            return "El resultado es indeterminado";
        }
    }
}
