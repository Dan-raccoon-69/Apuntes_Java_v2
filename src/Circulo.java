// Archivo - clase para la implementación de las interfaces - polimorfismo en java.
public class Circulo implements Figura2 {
    public double radio;
    public String nombre;

    public Circulo(String nombre, double radio) {
        this.nombre = nombre;
        this.radio = radio;
    }

    public double getArea() {
        return Math.round(Math.PI * (Math.pow(radio, 2.0)));
    }

    public double getPerimetro() {
        return Math.PI * (radio * 2);
    }

    public String getNombre() {
        return this.nombre;
    }

}
