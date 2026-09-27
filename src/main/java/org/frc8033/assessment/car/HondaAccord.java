package org.frc8033.assessment.car;

public class HondaAccord extends GasCar {
     
    public HondaAccord(float tankSize, float gasMilage) {

        super(tankSize, gasMilage);

    }

    public HondaAccord() {

        super(15f, 32f);
    }

    public boolean isStock() {
        return tankSize == 15f && gasMilage == 32f;
    }

}
