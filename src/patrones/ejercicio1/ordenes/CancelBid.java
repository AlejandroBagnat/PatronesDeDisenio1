package patrones.ejercicio1.ordenes;


public class CancelBid implements IOrden {

    @Override
    public boolean parse() {
        return false;
    }

    @Override
    public String execute() {
        return "";
    }

    @Override
    public void undo() {
        
    }

}
