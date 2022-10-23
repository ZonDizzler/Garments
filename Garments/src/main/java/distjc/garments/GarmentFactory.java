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
public class GarmentFactory {

    Garment someGarment(String printName) {

        Garment someGarment;

        String variantName;

        if (printName.contains("professional")) {
            variantName = "professional";

        } else if (printName.contains("casual")) {
            variantName = "professional";

        } else if (printName.contains("party")) {
            variantName = "professional";

        } else {
            variantName = "undefined variant";
        }

        if (printName.contains("pants")) {

            someGarment = new Pants();
            someGarment.setVariant(variantName);
            return someGarment;
        }
        if (printName.contains("shoes")) {

            someGarment = new Shoes();
            someGarment.setVariant(variantName);
            return someGarment;
        }
        if (printName.contains("top")) {

            someGarment = new Top();
            someGarment.setVariant(variantName);
            return someGarment;
        }
        
        System.out.println("No valid garment name");
        return null;

    }

}
