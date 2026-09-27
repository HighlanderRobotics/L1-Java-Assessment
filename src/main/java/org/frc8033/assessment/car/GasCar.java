package org.frc8033.assessment.car;

class GasCar implements Car {
    final float tankSize;
    float gasMileage;
    float currGas;

    public GasCar(float tankSize, float gasMileage) {
        this.tankSize = tankSize;
        this.gasMileage = gasMileage;
        this.currGas = tankSize;
    }

    public void drive(float distMi) {
        currGas = currGas - distMi/gasMileage < 0 ? 0 : currGas - distMi/ gasMileage;
    }

    public float getRangeMi() {
        return currGas * gasMileage;
    }

    public void fillTank() {
        currGas = tankSize;
    }
    
}