/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package distjc.garments;

/**
 *
 * @author soblab
 */
public class DriverClass {

    private static Application configureApplication() {

        Application app;
        GarmentFactory factory;

        String printName = "professional pants";

        factory = new GarmentFactory();
        app = new Application(factory, printName);

        return app;
    }

    public static void main(String[] args) {
        Application app = configureApplication();
        app.revealContent();
    }
}
