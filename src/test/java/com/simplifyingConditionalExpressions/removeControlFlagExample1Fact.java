package com.simplifyingConditionalExpressions;

import com.refactoring.simplifyingConditionalExpressions.removeControlFlag.replacedWithBreak;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class removeControlFlagExample1Fact {
    @Test
    public void should_get_alert_message_if_people_names_include_don() {
        List<String> peopleNames = Arrays.asList("Don", "Kent");

        replacedWithBreak replacedWithBreak = new replacedWithBreak();
        replacedWithBreak.checkSecurity(peopleNames);
        assertEquals("Alert", replacedWithBreak.getAlertedMessage());
    }

    @Test
    public void should_get_alert_message_if_people_names_include_john() {
        List<String> peopleNames = Arrays.asList("John", "Kent");

        replacedWithBreak replacedWithBreak = new replacedWithBreak();
        replacedWithBreak.checkSecurity(peopleNames);
        assertEquals("Alert", replacedWithBreak.getAlertedMessage());
    }

    @Test
    public void should_not_get_alert_message_if_people_names_does_include_don_and_john() {
        List<String> peopleNames = Arrays.asList("Martin", "Kent");

        replacedWithBreak replacedWithBreak = new replacedWithBreak();
        replacedWithBreak.checkSecurity(peopleNames);
        assertEquals("", replacedWithBreak.getAlertedMessage());
    }
}
