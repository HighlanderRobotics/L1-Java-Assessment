package org.frc8033.assessment.car;

public class GasCar implements Car {
    final float tankSize;
    final float gasMileage;
    float currentGas;

    public GasCar(float tankSize, float gasMileage) {
        this.tankSize = tankSize;
        this.gasMileage = gasMileage;
        this.currentGas = tankSize;
    }

    public void drive(float miles) {
        float gasUsed = miles/gasMileage;

        if (gasUsed > currentGas) {
            currentGas = 0;
        } else {
            currentGas -= gasUsed;
        }
    }

    public float getRangeMi() {
        return currentGas * gasMileage;
    }
    public void fillTank() {
        currentGas = tankSize;
    }
}