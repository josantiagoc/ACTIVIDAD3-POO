
package ejerciciopruebafiguras;


public class TrianguloRectangulo {
    int base; 
    int altura; 

    public TrianguloRectangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }
    
    double calcularHipotenusa() {
        return Math.pow(base*base + altura*altura, 0.5);
    }

    double calcularArea() {
        return (base * altura / 2);
    }

    double calcularPerimetro() {
        return (base + altura + calcularHipotenusa()); 
    }



    String determinarTipoTriangulo() {
        if ((base == altura) && (base == calcularHipotenusa()) && (altura
            == calcularHipotenusa())){
            return "Es un triángulo equilátero"; 

        }else if ((base != altura) && (base != calcularHipotenusa()) &&
            (altura != calcularHipotenusa())){
            return"Es un triángulo escaleno"; 

        }else{
            return"Es un triángulo isósceles"; 
        }
    }
}
