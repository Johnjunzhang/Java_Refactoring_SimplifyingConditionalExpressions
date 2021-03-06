package com.refactoring.simplifyingConditionalExpressions.removeControlFlag;

import java.util.List;

public class usingReturn {
    private String alertedMessage = "";

    public String checkSecurity(List<String> people)
    {
        String found = "";
        for (String name:people)
        {
            if (found == "")
            {
                if (name.equals("Don"))
                {
                    sendAlert();
                    found = "Don";
                }
                if (name.equals("John"))
                {
                    sendAlert();
                    found = "John";
                }
            }
        }
        return someLaterCode(found);
    }

    private String someLaterCode(String found)
    {
        return alertedMessage + found;
    }

    private void sendAlert()
    {
        alertedMessage = "Alert";
    }
}
