package Threads;
// hereda de thread para que pueda ejecutar hilos-threads
public class BucleThread extends Thread {

    public BucleThread(String nombre){
        // llama al constructor padre del hilo 
        super(nombre);
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            // this.getName devuelve el nombre del hilo
            if (this.getName() == "HILO #1") {
                System.out.println("CiCLO EN LA POSICION " + i + " " + this.getName());
            } else {
                System.out.println("CiCLO EN LA POSICION " + i + " " + this.getName());
            }
            try {
                // "duerme al hilo" por cierto tiempo
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("PROCESO TERMINADO de " + this.getName());
    }
}
