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

/*
 * Un ejemplo de implementar la n cantidad de interfaces que se necesite:
 * public class Circulo implements clase1, clase2{
 * }
 */

/*
 * Un ejemplo de implementar la herencia de interfaces:
 * La clase1 (clase hija)
 * public interface clase1 extends clase2{
 * }
 * 
 * La clase2 (clase-padre):
 * public interface clase2{
 * metodos
 * atributos
 * }
 * 
 * implementando la clase hija:
 * public class ClaseHija implements clase1{
 * metodos
 * }
 */
