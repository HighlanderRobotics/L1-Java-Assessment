package org.frc8033.assessment.car;

public class HondaAccord extends GasCar {
    public HondaAccord() {
        super(15, 32);
    }
    public HondaAccord(double tankSize, double gasMilage) {
        super(tankSize, gasMilage);
    }
    public boolean isStock() {
        return (getTankSize() == 15 && getGasMileage() == 32);
    }
}
