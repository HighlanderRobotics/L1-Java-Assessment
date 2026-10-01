package org.frc8033.assessment.car;


public class GasCar implements Car {
    public final float tankSize;
    public final float gasMileage;
    public float gasAmount;
    
        public GasCar(float tankSize, float gasMileage) {
            this.gasMileage = gasMileage;
            this.tankSize = tankSize;
            this.gasAmount = tankSize;
        }
        public float getTankSize() {
            return tankSize;
        }
        public float getGasMileage() {
            return gasMileage;
        }
    
        @SuppressWarnings("unused")
        @Override
        public void drive(float distance) {
            float gasUsed = distance / gasMileage;
            float gasLeft = gasAmount -= gasUsed;
    
        if (gasAmount <= gasUsed) {
            gasAmount = 0;
        } else {
            gasAmount -= gasUsed;
    }
    float range = gasLeft * gasMileage;
}
    public void fillTank() {
        gasAmount = tankSize;
    }
    @Override
    public float getRangeMi() {
        throw new UnsupportedOperationException("Unimplemented method 'getRangeMi'");
    }
}