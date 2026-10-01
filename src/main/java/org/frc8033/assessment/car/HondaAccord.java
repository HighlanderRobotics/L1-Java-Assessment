package org.frc8033.assessment.car;

public class HondaAccord extends GasCar {

    public HondaAccord() {
        super(15, 32);
    }

    public HondaAccord(float gasMileage, float tankSize) {
        super(tankSize, gasMileage);
    }

    public boolean isStock() {
        return gasMileage == 32 && tankSize == 15;
    }
}