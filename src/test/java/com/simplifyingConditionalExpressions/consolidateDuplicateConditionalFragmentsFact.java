package com.simplifyingConditionalExpressions;

import com.refactoring.simplifyingConditionalExpressions.consolidateDuplicateConditionalFragments.consolidateDuplicateConditionalFragments;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class consolidateDuplicateConditionalFragmentsFact {
    @Test
    public void should_get_disability_amount_given_is_special_deal() {
        consolidateDuplicateConditionalFragments consolidateDuplicateConditionalFragments = new consolidateDuplicateConditionalFragments(true, 10);
        assertEquals(10.5, consolidateDuplicateConditionalFragments.disabilityAmount(), 0);
    }

    @Test
    public void should_get_zero_disability_amount_given_month_disabled_more_than_12() {
        consolidateDuplicateConditionalFragments consolidateDuplicateConditionalFragments = new consolidateDuplicateConditionalFragments(false, 10);
        assertEquals(10.8, consolidateDuplicateConditionalFragments.disabilityAmount(), 0);
    }
}
