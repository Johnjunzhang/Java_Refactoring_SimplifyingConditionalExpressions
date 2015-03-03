package com.simplifyingConditionalExpressions;

import com.refactoring.simplifyingConditionalExpressions.removeControlFlag.usingReturn;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class removeControlFlagExample2Fact {
    @Test
    public void should_get_alert_message_if_people_names_include_don() {
        List<String> peopleNames = Arrays.asList("Don", "Kent");

        usingReturn usingReturn = new usingReturn();
        String alertMessage = usingReturn.checkSecurity(peopleNames);
        assertEquals("AlertDon", alertMessage);
    }

    @Test
    public void should_get_alert_message_if_people_names_include_john() {
        List<String> peopleNames = Arrays.asList("John", "Kent");

        usingReturn usingReturn = new usingReturn();
        String alertMessage = usingReturn.checkSecurity(peopleNames);
        assertEquals("AlertJohn", alertMessage);
    }

    @Test
    public void should_alert_first_matched_people() {
        List<String> peopleNames = Arrays.asList("John", "Don");

        usingReturn usingReturn = new usingReturn();
        String alertMessage = usingReturn.checkSecurity(peopleNames);
        assertEquals("AlertJohn", alertMessage);
    }

    @Test
    public void should_not_get_alert_message_if_people_names_does_include_don_and_john() {
        List<String> peopleNames = Arrays.asList("Martin", "Kent");

        usingReturn usingReturn = new usingReturn();
        String alertMessage = usingReturn.checkSecurity(peopleNames);
        assertEquals("", alertMessage);
    }
}
