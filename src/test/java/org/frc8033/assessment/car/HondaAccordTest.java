package org.frc8033.assessment.car;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class HondaAccordTest {
    
    @Test
    void defaultConstructorIsStock() {
        HondaAccord stock = new HondaAccord();
        assertTrue(stock.isStock());
    }

    @Test
    void constructedWithDefaultValuesIsStock() {
        HondaAccord stock = new HondaAccord(32, 15);
    }
}
