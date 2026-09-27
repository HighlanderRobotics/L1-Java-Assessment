package org.frc8033.assessment.car;

import com.google.errorprone.annotations.ForOverride;

public class GasCar implements Car {

    final float tankSize;
    final float gasMilage;
    float gasLevel;

    public GasCar(float tankSize, float gasMilage) {
    
        this.tankSize = tankSize;
        this.gasMilage = gasMilage;
        this.gasLevel = tankSize;

    }

    @Override public float getRangeMi() {
        return gasLevel * gasMilage;
    }

    @Override public void drive(float distance) {
        gasLevel -= (distance) / gasMilage;
        if (gasLevel < 0) { 
            gasLevel = 0; // kinda scummy
        } 
    }

    public void fillTank() {

        gasLevel = tankSize;
        
    }

}