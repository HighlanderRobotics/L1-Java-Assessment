package org.frc8033.assessment.car;

public class GasCar implements Car {
    private double tankSize;
    private double gasMilage;
    private double gasInTank;
    
    public GasCar(double tankSize, double gasMilage) {
        this.tankSize = tankSize;
        this.gasMilage = gasMilage;
        this.gasInTank = tankSize;
    }

    public double getRangeMi() {
        return gasInTank*gasMilage;
    }

    public void drive(double miles) {
        double maxRange = getRangeMi();
        if (miles >= maxRange) {
            gasInTank = 0;
        } else {
            gasInTank -= (miles / gasMilage);
        }
    }

    public void fillTank() {
        this.gasInTank = tankSize; 
    }

    public double getTankSize() {
        return this.tankSize;
    }

    public double getGasMileage() {
        return this.gasMilage;
    }

    public double getGasInTank() {
        return this.gasInTank;
    }

}
