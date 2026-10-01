package org.frc8033.assessment.car;

public class HondaAccord extends GasCar {
    private boolean stock;
    public HondaAccord() {
        super(15, 32);
        stock = true;
    }

    public HondaAccord(float tankSize, float gasMileage) {
        super(tankSize, gasMileage);
        if (tankSize == 15 && gasMileage == 32) {
            stock = true;
        } else {
            stock = false;
        }
    }

    public boolean isStock() {
        return stock;
    }
}
