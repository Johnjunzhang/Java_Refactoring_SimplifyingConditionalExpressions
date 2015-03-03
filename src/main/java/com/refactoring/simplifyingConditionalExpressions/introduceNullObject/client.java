package com.refactoring.simplifyingConditionalExpressions.introduceNullObject;

public class client {
    private site site;

    public client(site site)
    {
        this.site = site;
    }

    private customer customer()
    {
        return site.GetCustomer();
    }

    public String getStatement()
    {
        String plan = customer() == null ? "Basic Plan" : customer().getPlan();
        String customerName = customer() == null ? "occupant" : customer().getName();
        int weeksDelinquent = customer() == null ? 0 : customer().getWeeksDelinquentInLastYear();

        return plan + " " + customerName + " " + weeksDelinquent;
    }
}
