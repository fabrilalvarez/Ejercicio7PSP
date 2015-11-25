package ejercicio7PSP;

/**
 *
 * @author Fran
 */
public class Receptor extends Thread {

    public String nombre;
    public Buzon b;

    public Receptor() {
    }

    public Receptor(String nombre, Buzon b) {
        super("Bandeja del Receptor");
        this.nombre = nombre;
        this.b = b;
    }

    @Override
    public void run() {
        System.out.println(nombre + " ha recibido el siguiente mensaje:\n" + b.leer());
    }

}
