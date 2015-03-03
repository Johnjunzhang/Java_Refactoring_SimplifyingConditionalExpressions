package com.refactoring.simplifyingConditionalExpressions.introduceNullObject;

public class site {
    private customer customer;

    public site(customer customer)
    {
        this.customer = customer;
    }

    public customer GetCustomer()
    {
        return customer;
    }
}
