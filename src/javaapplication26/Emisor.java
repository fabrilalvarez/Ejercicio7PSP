package javaapplication26;

/**
 *
 * @author Fran
 */
public class Emisor extends Thread {

    public String nombre, mensaje;
    public Buzon b;

    public Emisor() {
    }

    public Emisor(String nombre, String mensaje, Buzon b) {
        super("Mensaje de emisor");
        this.mensaje = mensaje;
        this.nombre = nombre;
        this.b = b;
    }

    @Override
    public void run() {
        System.out.println(" enviando mensaje de " + nombre + " : " + mensaje);
        b.escribir(mensaje);
    }

}
