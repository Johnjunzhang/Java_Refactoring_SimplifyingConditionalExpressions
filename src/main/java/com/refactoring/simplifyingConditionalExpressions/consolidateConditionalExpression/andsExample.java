package com.refactoring.simplifyingConditionalExpressions.consolidateConditionalExpression;

public class andsExample {
    private double lengthOfService;
    private boolean onVacation;

    public andsExample(double lengthOfService, boolean onVacation)
    {
        this.lengthOfService = lengthOfService;
        this.onVacation = onVacation;
    }

    public double getCharge()
    {
        if (onVacation())
            if (lengthOfService() > 10)
                return 1;
        return 0.5;
    }

    private double lengthOfService()
    {
        return lengthOfService;
    }

    private boolean onVacation()
    {
        return onVacation;
    }
}
