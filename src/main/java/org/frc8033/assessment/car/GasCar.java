package org.frc8033.assessment.car;

public class GasCar implements Car {
    final float tankSizeGal, milageMi;
    float gas;

    public GasCar(float milageMi, float tankSizeGal) {
        this.tankSizeGal = tankSizeGal;
        this.milageMi = milageMi;
        this.gas = tankSizeGal;
    }

    public void drive(float dist) {
        float requiredFuel = dist / milageMi;
        gas = gas > requiredFuel ? gas - requiredFuel : 0;
    }
    
    public void fillTank() { gas = tankSizeGal; }
    public float getRangeMi() { return gas * milageMi; }
}