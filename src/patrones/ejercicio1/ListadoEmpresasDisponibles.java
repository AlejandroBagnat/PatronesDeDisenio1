package patrones.ejercicio1;

import java.util.ArrayList;
import java.util.List;


public class ListadoEmpresasDisponibles {
    private List<String> empresas = null;
    public ListadoEmpresasDisponibles() {
        empresas = new ArrayList<String>();
        empresas.add("VALE");
        empresas.add("AMZN");
        empresas.add("AAPL");
        empresas.add("MSFT");
        empresas.add("TS");
    }
    public boolean validar(String empresa) {
        return empresas.contains(empresa);
    }
}
