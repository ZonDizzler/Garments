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
public class Application {

    private Garment garment;

    public Application(GarmentFactory factory) {
        garment = factory.someGarment();
    }

    public void revealContent() {
        garment.typeOfGarment();
    }

}
