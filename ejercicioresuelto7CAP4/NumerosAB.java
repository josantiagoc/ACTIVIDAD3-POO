
package ejercicioresuelto7cap4;


public class NumerosAB {
    double A,B;
    NumerosAB(double A, double B){
        this.A = A;
        this.B = B;
    }
    String Comparacion(){
        if (A > B) {
           return ("A es mayor que B");
        } else if (A==B){
            return ("A es igual a B");
        } else {
            return("A es menor que B");
        }
    }
    
}
