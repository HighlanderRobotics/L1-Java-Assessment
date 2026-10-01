package org.frc8033.assessment.car;

public class GasCar implements Car {
    public float tankSize;
    public float gasMileage;
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
    
        @Override
        public void drive(float distance) {
            float gasUsed = distance / gasMileage;
    
        if (gasAmount <= gasUsed) {
            gasAmount = 0;
        } else {
            gasAmount -= gasUsed;
    }

}
    @Override
    public float getRangeMi() {
        return gasAmount * gasMileage;
    }
    public void fillTank() {
        gasAmount = tankSize;
    }
}