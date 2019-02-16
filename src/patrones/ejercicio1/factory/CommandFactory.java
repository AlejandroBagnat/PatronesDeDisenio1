package patrones.ejercicio1.factory;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import patrones.ejercicio1.ordenes.AgarraTodo;
import patrones.ejercicio1.ordenes.CancelBid;
import patrones.ejercicio1.ordenes.CrearOffer;
import patrones.ejercicio1.ordenes.IOrden;
import patrones.ejercicio1.ListadoEmpresasDisponibles;


public class CommandFactory {
    public static ListadoEmpresasDisponibles crearEmpresasDisponibles() {
        return new ListadoEmpresasDisponibles();
    }
    public static List<IOrden> crearListaOrdenes(String[] params) {
        return Arrays.asList(
                new CrearOffer(crearEmpresasDisponibles(), params),
                // new CrearBid(),
                // new CancelOffer(),
                new CancelBid(),
                new AgarraTodo()
        );
    }
}
