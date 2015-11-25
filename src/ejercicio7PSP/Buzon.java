package ejercicio7PSP;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Fran
 */
public class Buzon {

    public static String mensaje;
    public static boolean bandera = false;

    public Buzon() {
    }

    public synchronized void escribir(String mensaje) {
        setMensaje(mensaje);
        bandera = true;
        notify();
    }

    public synchronized String leer() {
        if (bandera == false) {
            try {
                wait();
            } catch (InterruptedException ex) {
                //
            }
        } else {
            setMensaje(getMensaje());
        }
        return getMensaje();
    }

    public static String getMensaje() {
        return mensaje;
    }

    public static void setMensaje(String mensaje) {
        Buzon.mensaje = mensaje;
    }

}
