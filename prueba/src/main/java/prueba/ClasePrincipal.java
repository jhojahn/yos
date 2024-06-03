package prueba;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
public class ClasePrincipal {
    private static  Logger miLogEnFich = LogManager.getLogger("ClasePrincipal");
    private static  Logger miLogConsola= LogManager.getLogger("ERROR");
    
    public static void main(String[] args) {
        System.out.println("hola ");
        miLogEnFich.info("Errores informativo  de clase principal");
        miLogEnFich.error("Errores grave de clase principal");
        miLogEnFich.debug("Errores grave de clase principal");
        miLogEnFich.warn("Errores grave de clase principal");
        miLogEnFich.fatal("Errores grave de clase principal");
        miLogConsola.error("Error grave en consola");
        System.out.println("hola 2");
        try {
            throw new Exception("Excepción de jmpl");
        } catch (Exception e) {
            miLogEnFich.error(e.getMessage());
        }
        System.out.println("hola 3");
    }
}
