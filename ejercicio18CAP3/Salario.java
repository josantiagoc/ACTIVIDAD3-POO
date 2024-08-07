
package ejerciciopropuesto18cap3;

public class Salario {
    double numHorasTrabajadas, valorHora, PCTretencion, SALB, SALN, retencion;
    
    Salario(double numHorasTrabajadas, double valorHora, double PCTretencion){
        this.numHorasTrabajadas = numHorasTrabajadas;
        this.valorHora = valorHora;
        this.PCTretencion = PCTretencion;
    }
    double CalcularSALB(){
        SALB = valorHora * numHorasTrabajadas;
        return SALB;
    }
    double CalcularSALN(){
        retencion= SALB*(PCTretencion/100);
        SALN = SALB - retencion;
        return SALN;
    }
}
