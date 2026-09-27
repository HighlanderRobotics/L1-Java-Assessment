package org.frc8033.assessment.car;

public class HondaAccord extends GasCar {
    public HondaAccord() {
        super(15, 32);
    }

    public HondaAccord(int tankSize, int gasMileage) {
        super(tankSize, gasMileage);
    }
    
    public boolean isStock() {
        return this.tankSize == 15 && this.gasMileage == 32;
    }
}
