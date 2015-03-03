package com.simplifyingConditionalExpressions;

import com.refactoring.simplifyingConditionalExpressions.replaceNestedConditionalwithGuardClauses.replaceNestedConditionalWithGuardClauses;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class replaceNestedConditionalWithGuardClausesFact {
    @Test
    public void should_get_dead_amount_pay_given_is_dead() {
        replaceNestedConditionalWithGuardClauses replaceNestedConditionalWithGuardClauses = new replaceNestedConditionalWithGuardClauses(true, false, false);
        assertEquals(400, replaceNestedConditionalWithGuardClauses.getPayAmount(), 0);
    }

    @Test
    public void should_get_separated_amount_pay_given_is_separated_and_not_dead() {
        replaceNestedConditionalWithGuardClauses replaceNestedConditionalWithGuardClauses = new replaceNestedConditionalWithGuardClauses(false, true, false);
        assertEquals(300, replaceNestedConditionalWithGuardClauses.getPayAmount(), 0);
    }

    @Test
    public void should_get_separated_amount_pay_given_is_retired_and_not_dead_and_not_seperated() {
        replaceNestedConditionalWithGuardClauses replaceNestedConditionalWithGuardClauses = new replaceNestedConditionalWithGuardClauses(false, false, true);
        assertEquals(200, replaceNestedConditionalWithGuardClauses.getPayAmount(), 0);
    }

    @Test
    public void should_get_normal_amount_pay_given_is_not_retired_and_not_dead_and_not_seperated() {
        replaceNestedConditionalWithGuardClauses replaceNestedConditionalWithGuardClauses = new replaceNestedConditionalWithGuardClauses(false, false, false);
        assertEquals(100, replaceNestedConditionalWithGuardClauses.getPayAmount(), 0);
    }
}
