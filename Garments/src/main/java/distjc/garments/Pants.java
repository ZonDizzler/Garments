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
public class Pants implements Garment {
    

    @Override
    public void typeOfGarment() {
        System.out.println("Pants are a garment worn on the legs.");
    }
    
    String variantName;
    
    @Override
    public void setVariant(String variantName) {
        this.variantName = variantName;
    }

    @Override
    public String getVariant() {
        return variantName;
    }
    
}
