package com.simplifyingConditionalExpressions;

import com.refactoring.simplifyingConditionalExpressions.consolidateConditionalExpression.andsExample;
import com.refactoring.simplifyingConditionalExpressions.consolidateConditionalExpression.orsExample;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class consolidateConditionalExpressionFact {

    @Test
    public void should_get_zero_disability_amount_given_seniority_less_than_two() {
        orsExample consolidateConditionalExpression = new orsExample(1, 0, false);
        assertEquals(0, consolidateConditionalExpression.disabilityAmount(), 0);
    }

    @Test
    public void should_get_zero_disability_amount_given_month_disabled_more_than_12() {
        orsExample consolidateConditionalExpression = new orsExample(2, 13, false);
        assertEquals(0, consolidateConditionalExpression.disabilityAmount(), 0);
    }

    @Test
    public void should_get_zero_disability_amount_given_is_part_time() {
        orsExample consolidateConditionalExpression = new orsExample(2, 1, true);
        assertEquals(0, consolidateConditionalExpression.disabilityAmount(), 0);
    }

    @Test
    public void should_get_ten_disability_amount_given_seniority_greater_than_one_and_disabled_less_than_13_and_is_not_part_time() {
        orsExample consolidateConditionalExpression = new orsExample(2, 1, false);
        assertEquals(10, consolidateConditionalExpression.disabilityAmount(), 0);
    }

    @Test
    public void should_get_1_given_is_on_vacation_and_length_of_service_greater_than_10() {
        andsExample andsExample = new andsExample(11, true);
        assertEquals(1, andsExample.getCharge(), 0);
    }

    @Test
    public void should_get_point_5_given_is_not_on_vacation() {
        andsExample andsExample = new andsExample(11, false);
        assertEquals(0.5, andsExample.getCharge(), 0);
    }

    @Test
    public void should_get_point_5_given_length_of_service_not_greater_than_10() {
        andsExample andsExample = new andsExample(5, true);
        assertEquals(0.5, andsExample.getCharge(), 0);
    }
}
