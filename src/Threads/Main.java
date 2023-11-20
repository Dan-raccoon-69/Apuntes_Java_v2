package Threads;

public class Main {
    public static void main(String[] args) {
        // utilizando la herencia 
        Thread t1 = new BucleThread("HILO #1");
        Thread t2 = new BucleThread("HILO #2");
        t1.start();
        t2.start();

        System.out.println("RUNNABLE");
        // utilizando la interfaz Runnable
        // creamos la instancia
        BucleInterface obj = new BucleInterface("HILO #1 aaa");
        // creamos un hilo 
        Thread hilo1 = new Thread(obj);
        hilo1.start();
    }
}
