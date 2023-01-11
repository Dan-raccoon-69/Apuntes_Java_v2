// Archivo - clase para la implementacion de las interfaces - polimorfismo en java.
public class Rectangulo implements Figura2 {
    public double base;
    public double altura;

    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public double getArea(){
        return base * altura;
    } 

    public double getPerimetro(){
        return (2*altura) + (2*base);
    }
}
