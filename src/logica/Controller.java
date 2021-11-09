package logica;

import persistencia.PersistenciaController;

/**
 *
 * @author Juan E. Chemello <juanchemell@gmail.com>
 */
public class Controller {

    PersistenciaController persCont = new PersistenciaController();
    
    public void newCliente(Cliente c) {
       persCont.newCliente(c);
    }
}
