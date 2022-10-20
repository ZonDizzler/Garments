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
public class Driver {
    public class DriverClass {

    private static Application configureApplication(){

        Application app;
        GarmentFactory factory;

        String printName = "Check the config file for garment";

        if (printName.contains("garment")) {
            factory = new GarmentFactory();
            app = new Application(factory);
        } else {
            factory = new MenuscriptFactory();
            app = new Application(factory);
        }
        return app;
    }

    public static void main(String[] args) {
        Application app = configureApplication();
        app.revealContent();
    }
}
