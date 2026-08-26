package org.frc8033.assessment.car;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class GasCarTest {

    @Test
    void tankHasNoGasWhenEmptied() {
        GasCar testCar = new GasCar(10, 10); // Range of 100
        assertEquals(testCar.getRangeMi(), 100);
        testCar.drive(150); // Should be out of fuel
        assertEquals(testCar.getRangeMi(), 0);
    }

    @Test
    void tankIsUsedWhenDriving() {
        GasCar testCar = new GasCar(10, 10); // Range of 100
        assertEquals(testCar.getRangeMi(), 100);
        testCar.drive(50);
        assertEquals(testCar.getRangeMi(), 50);
    }

    @Test
    void tankFillsFully() {
        GasCar testCar = new GasCar(10, 10); // Range of 100
        assertEquals(testCar.getRangeMi(), 100);
        testCar.drive(50);
        assertEquals(testCar.getRangeMi(), 50);
        
        testCar.fillTank();
        assertEquals(100, testCar.getRangeMi());
    }
}
