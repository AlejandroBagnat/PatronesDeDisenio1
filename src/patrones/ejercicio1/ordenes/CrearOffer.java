package patrones.ejercicio1.ordenes;

import java.util.UUID;
import patrones.ejercicio1.ListadoEmpresasDisponibles;
import patrones.ejercicio1.Utiles;

public class CrearOffer implements IOrden {

    private String[] params;
    private ListadoEmpresasDisponibles listadoEmpresasDisponibles;
    
    public CrearOffer(ListadoEmpresasDisponibles listadoEmpresasDisponibles, String[] params) {
        this.params = params;
        this.listadoEmpresasDisponibles = listadoEmpresasDisponibles;
    }
    
    public boolean parse() {
        if (!params[0].equalsIgnoreCase("crearOffer")) {
            return false;
        }
        if (!listadoEmpresasDisponibles.validar(params[1])) {
            System.out.println("La empresa " + params[1] + "no es valida");
            return false;
        }
        
        // Aca una solucion para el listado de empresas
        if (Utiles.tryParse(params[2]) == 0) {
            System.out.println("Cantidad no valida");
            return false;
        }
        if (Utiles.tryParse(params[3]) == 0) {
            System.out.println("Precio No valido");
            return false;
        }
        return true;
    }

    public String execute() {
        return UUID.randomUUID().toString();
    }

    public void undo() {
        
    }

}
