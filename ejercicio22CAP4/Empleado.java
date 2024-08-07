
package ejerciciopropuesto22cap4;


public class Empleado {
    String NOM;
    double SALB, NUMH, SALM;
    
    Empleado(String NOM, double SALB, double NUMH){
        this.NOM = NOM;
        this.SALB = SALB;
        this.NUMH = NUMH;
    }
    double CalcularSalarioMensual(){
        SALM = SALB*NUMH;
        return SALM;
    }
    String SalidaEmpleado(){
        if (SALM > 450000){
            return NOM+" tiene un salario mensual de "+SALM;
        } else {
            return NOM;
        }
    }
}
