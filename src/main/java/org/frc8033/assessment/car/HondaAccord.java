package org.frc8033.assessment.car;

public class HondaAccord extends GasCar {
    private final boolean stock;
    public HondaAccord(){
        super(15,32);
        this.stock = true;
    }
    public HondaAccord(float tankSize, float mileage){
        super(tankSize,mileage);
        if (tankSize != 15 && mileage != 32) {
            this.stock = false;
        } else {
            this.stock = true;
        }
    }
    public boolean isStock() {
        return this.stock;
    }
}
