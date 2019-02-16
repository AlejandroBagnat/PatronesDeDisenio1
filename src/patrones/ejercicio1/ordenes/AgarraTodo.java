package patrones.ejercicio1.ordenes;


public class AgarraTodo implements IOrden {

    @Override
    public boolean parse() {
        return true;
    }

    @Override
    public String execute() {
        return "Comando no encontrado";
    }

    @Override
    public void undo() {
        
    }

}
