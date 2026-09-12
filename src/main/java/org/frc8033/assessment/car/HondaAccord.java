package org.frc8033.assessment.car;

public class HondaAccord extends GasCar {

    
    public HondaAccord() {
        super(32, 15);
    }

    public HondaAccord(float gasMilage, float tankSizeGal) {
        super(gasMilage, tankSizeGal);
    }

    public boolean isStock() {
        return this.equals(new HondaAccord());
    }

}
