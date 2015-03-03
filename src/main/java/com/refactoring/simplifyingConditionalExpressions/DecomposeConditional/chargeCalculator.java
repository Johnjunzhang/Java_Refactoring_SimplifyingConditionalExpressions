package com.refactoring.simplifyingConditionalExpressions.DecomposeConditional;

import java.util.Date;

public class chargeCalculator {
    private Date SUMMER_START = new Date(2011, 6, 1);
    private Date SUMMER_END = new Date(2011, 9, 31);
    private double WinterServiceCharge = 100;
    private double WinterRate = 3;
    private double SummerRate = 2;

    public double getCharge(Date date, double quantity)
    {
        double charge;
        if (date.before(SUMMER_START) || date.after(SUMMER_END))
            charge = quantity * WinterRate + WinterServiceCharge;
        else charge = quantity * SummerRate;
        return charge;
    }
}
