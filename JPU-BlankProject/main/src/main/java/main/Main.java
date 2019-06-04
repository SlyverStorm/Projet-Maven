/**
 * @author Jean-Aymeric DIET jadiet@cesi.fr
 * @version 1.0
 */
package main;

import java.io.IOException;

import contract.ControllerOrder;
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
     *            the arguments
     * @throws IOException 
     */
    public static void main(final String[] args) throws IOException {
        BoulderDashModel model = new BoulderDashModel("//////////////////////////////////////// /o@//@/oo@/@@@o/o@@o@@@@/@@@o@@@@@o/@D@/ /@@P/@D@o@/@@@///@@/@o@@@@o@@o@o@@@/@/o/ /@@@@/@@oD@@o@@@@/@@@@@o@//o@@@@@@@/@/// /D@/@@/o/o@@o@@@@/@@@o@@@@@@o@oo@@@@@@// /o@/@@@/@@o@//@@o@//D@@@@@@@o@oo@@@@@@// /oo@@o@@@@/@@@o@@@@@@o@oo@@@@@@o@@D//@@/ /@@o@//@@o@oo@@@/@@@@o@oo@@@@@@/@@o@/@o/ /@@/@@@D@@@@@@D@o@@//o@@o@/@/o@@/o@@D@o/ /o@o@@@@/@//@@D@o@@//o@@o@@D@/@@@/@@o@// /@o@//@@@@@oo@o@@Do/@/o@@/o@@@/o@@D@o@@/ //@//@@@@@@oo/o@@o@/@//@@@/@@o@//@@o@/// /@/@o@o@/@@@//o@@o@@@@/@@@o@@@@@//@o@/// /@/@o@o@/@D@/@/o@@/o@@@@o@@o@oo@@@@/@@@/ //@@/o/o@@o@@@@/@@@D@@@/@o/@@@@@@/@//@D/ //@@@//o@@/@D@@@/o@@o@o@@@o@o/o@@@@@/@@/ //@D@@@@o@o//@@o@//o@@@@@@@o@/o@@@@@/@@/ /@@o@@@@/@@@o@@@@@@o@oo@@@@@@/@@o@/@@@// /o@//@@o@//@@@/@@@@o@oo@@@@@@/@@oD@@o@X/ //@@@o@@@@@@o@oD@@@@@@o@@@//@@/o@@D@/@@/ /oo@@@/@@@@@o@oD@@@@@@/@@o@/D@D@o/@o@@@/ ////////////////////////////////////////f");
        System.out.println(model.getMapString());
    }
}
