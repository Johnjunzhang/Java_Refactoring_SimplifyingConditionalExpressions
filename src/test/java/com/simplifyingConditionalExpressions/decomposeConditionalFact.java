package com.simplifyingConditionalExpressions;

import com.refactoring.simplifyingConditionalExpressions.DecomposeConditional.chargeCalculator;
import org.junit.Test;

import java.util.Date;

import static org.junit.Assert.assertEquals;

public class decomposeConditionalFact {
    @Test
    public void should_get_summer_charge_given_date_is_in_summer() {
        chargeCalculator chargeCalculator = new chargeCalculator();
        double charge = chargeCalculator.getCharge(new Date(2011, 7, 1), 100);
        assertEquals(200, charge, 0);
    }

    @Test
    public void should_get_winter_charge_given_date_is_not_in_summer() {
        chargeCalculator chargeCalculator = new chargeCalculator();
        double charge = chargeCalculator.getCharge(new Date(2011, 11, 1), 100);
        assertEquals(400, charge, 0);
    }
}
