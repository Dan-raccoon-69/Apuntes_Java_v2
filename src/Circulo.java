// Archivo - clase para la implementación de las interfaces - polimorfismo en java.
public class Circulo implements Figura2{
    public double radio;

    public Circulo (double radio){
        this.radio = radio;
    }

    public double getArea(){
        return Math.round(Math.PI * (Math.pow(radio, 2.0)));
    } 

    public double getPerimetro(){
        return Math.PI * (radio * 2);
    }

}
