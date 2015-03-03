package com.simplifyingConditionalExpressions;

import com.refactoring.simplifyingConditionalExpressions.introduceNullObject.client;
import com.refactoring.simplifyingConditionalExpressions.introduceNullObject.customer;
import com.refactoring.simplifyingConditionalExpressions.introduceNullObject.site;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class introduceNullObjectFact {
    @Test
    public void should_get_basic_statement_given_does_not_have_customer() {
        site site = new site(null);
        client client = new client(site);
        assertEquals("Basic Plan occupant 0", client.getStatement());
    }

    @Test
    public void should_get_customer_statement_given_has_customer() {
        site site = new site(new customer());
        client client = new client(site);
        assertEquals("Real Plan Name 100", client.getStatement());    }
}
