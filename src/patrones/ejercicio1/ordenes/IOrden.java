/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patrones.ejercicio1.ordenes;

/**
 *
 * @author educacionit
 */
public interface IOrden {
    boolean parse();
    String execute();
    void undo();
}
