package com.refactoring.simplifyingConditionalExpressions.replaceNestedConditionalwithGuardClauses;

public class reversingTheConditions {
    private double capital;
    private double intRate;
    private double duration;
    private double income;
    private double AdjFactor = 2;

    public reversingTheConditions(double capital, double intRate, double duration, double income)
    {
        this.capital = capital;
        this.income = income;
        this.duration = duration;
        this.intRate = intRate;
    }

    public double getAdjustedCapital()
    {
        double result = 0.0;
        if (capital > 0.0)
        {
            if (intRate > 0.0 && duration > 0.0)
            {
                result = (income / duration) * AdjFactor;
            }
        }
        return result;
    }
}
