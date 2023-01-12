// Archivo - clase para la implementacion de las interfaces - polimorfismo en java.
public class Rectangulo implements Figura2 {
    public double base;
    public double altura;
    public String nombre;

    public Rectangulo(String nombre, double base, double altura) {
        this.nombre = nombre;
        this.base = base;
        this.altura = altura;
    }

    public double getArea() {
        return base * altura;
    }

    public double getPerimetro() {
        return (2 * altura) + (2 * base);
    }

    public String getNombre() {
        return this.nombre;
    }
}
