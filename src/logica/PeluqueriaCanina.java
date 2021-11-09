package logica;

/**
 *
 * @author Juan E. Chemello <juanchemell@gmail.com>
 */

import igu.Layout;
import persistencia.PersistenciaController;

public class PeluqueriaCanina {

    public static void main(String[] args) {

        Controller control = new Controller();

        Layout gui = new Layout(control);
        gui.setTitle("Peluquería Canina");
        gui.setLocationRelativeTo(null);
        gui.setVisible(true);
    }

}
