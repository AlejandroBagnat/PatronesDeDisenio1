package patrones.ejercicio1;

import patrones.ejercicio1.ordenes.IOrden;
import patrones.ejercicio1.factory.CommandFactory;
import java.util.List;

public class Init {
    public static void main(String... params) {
        
        // Validaciones generales
        // Instanciacion de empresas habilitadas
        
        // Instanciacion de comados
        List<IOrden> ordenes = CommandFactory.crearListaOrdenes(params);
        for (IOrden orden : ordenes) {
            try {
                orden.parse();
            }
            catch (Exception ex) {
                System.out.println(ex.getMessage());
                break;
            }
            
            if (orden.parse()) {
                try {
                    System.out.println(orden.execute());
                    break;
                }
                catch (Exception ex) {
                    orden.undo();
                }
            }
        }
    }
}
