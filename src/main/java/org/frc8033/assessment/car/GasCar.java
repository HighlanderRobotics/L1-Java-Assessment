package org.frc8033.assessment.car;
import org.frc8033.assessment.car.CarInterface.Car;

public class GasCar implements Car {
    private final float tankSize;
    private final float mileage;
    private float gasInTank;
    public GasCar(float tankSize, float mileage){
        this.tankSize = tankSize;
        this.mileage = mileage;
        this.gasInTank = tankSize;
    }
    public float getRangeMi() {
        return this.gasInTank * this.mileage;
    }
    public void fillTank(){
        this.gasInTank = this.tankSize;
    }
    public void drive(float distance){
        float fuelUsed = distance / this.mileage;
        if (this.gasInTank - fuelUsed > 0){
            this.gasInTank -= fuelUsed;
        } else {
            this.gasInTank = 0;
        }
    }
}
