/**
 * Programa que simule un buzón de correo (recurso compartido), de forma que se
 * pueda leer un mensaje o enviarlo. El buzón sólo puede almacenar un mensaje,
 * de forma que para poder escribir se debe de encontrar vacío y para poder leer
 * debe de estar lleno. Crear varios hilos lectores y escritores que manejen el
 * buzón de forma sincronizada.
 */
package ejercicio7PSP;

/**
 *
 * @author Fran
 */
public class Ejercicio7PSP {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String mensaje = "Hola, aqui estamos probando codigo";
        Buzon buz = new Buzon();
        Emisor miBuzon = new Emisor("Fran", mensaje, buz);
        Receptor suBuzon = new Receptor("Sergio", buz);

        suBuzon.start();
        miBuzon.start();
    }

}
