package org.frc8033.assessment.car;

public class GasCar implements org.frc8033.assessment.car.Car  {
    int tankSize;
    int gasMilage;
    int gasInTank;
    public GasCar(int tankSize, int gasMilage, int gasInTank){
        this.tankSize = tankSize;
        this.gasMilage = gasMilage;
        this.gasInTank = tankSize;
    }
    @Override
    public void drive(int miles){
        if(this.gasInTank-miles/this.gasMilage>0){
            this.gasInTank -= miles;
        }else{
            this.gasInTank = 0;
        }
        System.out.println("drove" + miles + " miles, taking away" + miles/this.gasMilage + " gas making the current gas:" + this.gasInTank);
    };
    public float getRangeMi(){
        return 0.2f;
    };
    public boolean isAccord(){
        if(tankSize == 15 && gasMilage == 32){
            return true;
        }else{
            return false;
        }

    };
}
