package persistencia;

import logica.Cliente;

/**
 *
 * @author Juan E. Chemello <juanchemell@gmail.com>
 */
public class PersistenciaController {

    ClienteJpaController clientJPA = new ClienteJpaController();

    // Create
    public void newCliente(Cliente c) {
        try {
            clientJPA.create(c);
        } catch (Exception e) {
            System.out.println(e);
            System.out.println("No se pudo crear el huesped.");
        }
    }
}
