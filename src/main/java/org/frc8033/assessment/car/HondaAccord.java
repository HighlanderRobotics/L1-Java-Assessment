package org.frc8033.assessment.car;

public class HondaAccord extends GasCar {
    public HondaAccord() {
        super(32, 15);
    }
    public HondaAccord(float milageMi, float tankSizeGal) {
        super(milageMi, tankSizeGal);
    }

    public boolean isStock() {
        return this.tankSizeGal == 15 && this.milageMi == 32;
    }
}