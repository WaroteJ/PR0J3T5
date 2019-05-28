/**
 * @author Jean-Aymeric DIET jadiet@cesi.fr
 * @version 1.0
 */
package main;

import java.io.IOException;

import contract.IBoulderDashModel;
import contract.IController;
import controller.Controller;
import model.BoulderDashModel;
import view.View;

/**
 * The Class Main.
 *
 * @author Jean-Aymeric Diet
 */
public abstract class Main {

    /**
     * The main method.
     *
     * @param args
     *            the argumentsz
     * @throws IOException 
     */
    public static void main(final String[] args) throws IOException {
        final IBoulderDashModel model = new BoulderDashModel("lvl1.txt", 1, 1);
        final View view = new View(model.getModel(),model.getMyPlayer());
        final IController controller = new Controller(view, model);
        view.setController(controller);

        controller.control();
    }
}
