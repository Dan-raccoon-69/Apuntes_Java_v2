package Threads;

public class BucleInterface implements Runnable{
    private String nombre;  
    
    public BucleInterface(String nombre){
        this.nombre = nombre;        
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            // this.getName devuelve el nombre del hilo
            if (nombre == "HILO #1") {
                System.out.println("CiCLO EN LA POSICION " + i + " " + nombre);
            } else {
                System.out.println("CiCLO EN LA POSICION " + i + " " + nombre);
            }
            try {
                // "duerme al hilo" por cierto tiempo
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("PROCESO TERMINADO de " + Thread.currentThread().getName());
    }
}
