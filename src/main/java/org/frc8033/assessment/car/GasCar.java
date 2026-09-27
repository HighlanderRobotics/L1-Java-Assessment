package org.frc8033.assessment.car;


public class GasCar implements Car{
    public final float tankSize;
    public final float mileage;
    public float gasUsed;
    

public GasCar(float tankSize, float mileage){
    this.tankSize = 15;
    this.mileage = 32;
    this.gasUsed = 15;

}
@Override
    public float getRangeMi() {
            return 0;
    }

    @Override
    public void drive(float distance) {
            float gasUsed = distance / mileage;
            tankSize-= gasUsed;

    }
}


