/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciopropuesto19cap3;

public class Triangulo_Equilatero {
    
    double lado;
    
    Triangulo_Equilatero(double lado){
        this.lado=lado;
    }
    double CalPerimetro(){
        return 3*lado;
    }
    double CalAltura(){
        return (Math.sqrt(3)*(lado/2));
    }
    double CalArea(){
        return (lado*(Math.sqrt(3)*(lado/2)))/2;
    }
}
