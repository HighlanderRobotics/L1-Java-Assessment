package org.frc8033.assessment.car;

public class GasCar implements Car {

    private final float fuelEconomyMiPerGal;

    private final float tankSizeGal;

    private float gasInTankGal;

    public GasCar(float fuelEconomyMiPerGal, float tankSizeGal) {
        this.fuelEconomyMiPerGal = fuelEconomyMiPerGal;
        this.tankSizeGal = tankSizeGal;

        this.gasInTankGal = tankSizeGal;
    }

    @Override
    public void drive(float miles) {
        float gallonsUsed = miles / fuelEconomyMiPerGal;

        if (gallonsUsed > gasInTankGal) {
            System.out.println("Out of gas!");
            gasInTankGal = 0;
        } else {
            gasInTankGal -= gallonsUsed;
            System.out.println("Used " + gallonsUsed);
        }
    }

    @Override
    public float getRangeMi() {
        return gasInTankGal * fuelEconomyMiPerGal;
    }

    public void fillTank() {
        gasInTankGal = tankSizeGal;
    }
    

}
