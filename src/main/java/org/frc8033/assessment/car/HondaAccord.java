package org.frc8033.assessment.car;

public class HondaAccord extends GasCar {
    private final boolean stock;
    public HondaAccord(){
        super(15,32);
        this.stock = true;
    }
    public HondaAccord(float tankSize, float mileage){
        super(tankSize,mileage);
        this.stock = false;
    }
    public boolean isStock() {
        return this.stock;
    }
}
