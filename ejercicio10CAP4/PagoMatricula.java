
package ejercicioresuelto10cap4;


public class PagoMatricula {
    double PAT, EST, PAGMAT;
 
    PagoMatricula(double PAT, double EST, double PAGMAT){
        this.PAT = PAT;
        this.EST = EST;
        this.PAGMAT = PAGMAT;
    }
    double CalcularPago(){
        if ((PAT > 2000000)&&(EST > 3)){
            PAGMAT = PAGMAT + 0.03 * PAT;
        }  
        return PAGMAT;
    } 
    
}
