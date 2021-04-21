package com.example.hnbsmsgenerator.util;

public class Status {
    public static String checkStatus(String status)
    {
        String msg = "";
        switch (status)
        {
            case "S1000":
                msg = "Process completed successfully for all the available destination \n" +
                        "numbers.";
                break;
            case "P1001":
                msg = "Request processed successfully, but delivery to some destinations \n" +
                        "have failed. Please check the individual status for more details.\n";
                break;
            case "P1002":
                msg = "Message contains suspected abusive content or subscriber base is \n" +
                        "larger than limit. Message will be stored for admin approval.\n";
                break;
            case "E1313":
                msg = "Authentication failed. No such active application with applicationId \n" +
                        "<application-id>, or no active service provider or the given password \n" +
                        "in the request is invalid.";
                break;
            case "E1303":
                msg = "IP address from which this request originated is not provisioned to \n" +
                        "send request to application <application-id>. Please use a provisioned \n" +
                        "system to send request or contact system admin to provision the new \n" +
                        "IP.\n";
                break;
            case "E1312":
                msg = "Request is Invalid. <specify_the_reason> Refer the SMS and USSD \n" +
                        "Gateway NBL API Developer Guide for the mandatory fields and \n" +
                        "correct format of the request.";
                break;
            case "E1309":
                msg = "Requested SMS service is not allowed for this Application. Please \n" +
                        "check the issue with SMS and USSD Gateway system administrator. ";
                break;
            case "E1311":
                msg = "Mobile terminated SMS messages have not enabled. Check your NCS \n" +
                        "configuration in provisioning.\n";
                break;
            case "E1315":
                msg = "Cannot find the requested service SMS or it is not active";
                break;
            case "E1341":
                msg = "Request failed. Errors occurred while sending the request for all the \n" +
                        "destinations.\n";
                break;
            case "E1334":
                msg = "SMS sent to <application name> application could not be processed \n" +
                        "as the message length is too long. Maximum message length allowed \n" +
                        "is <specify_max_limit> ";
                break;
            case "E1335":
                msg = "SMS sent to <application name> application could not be processed \n" +
                        "as the advertisement message length is too long. Maximum message \n" +
                        "length allowed for advertisements is <specify_max_adv_limit>\n";
                break;
            case "E1601":
                msg = "System experienced an unexpected error.\n";
                break;
            case "E1342":
                msg = "MSISDN is black listed. Not authorized to use the application \n" +
                        "<application_name>";
                break;
            case "E1343":
                msg = "MSISDN is not white listed. Only white list numbers are allowed to \n" +
                        "send messages at this state.";
                break;
            case "E1325":
                msg = "Format of the address is invalid. Expected format is \n" +
                        "\"tel:94771211212\"\n";
                break;
            case "E1331":
                msg = "<sourceAddress> is not allowed. Please use one of the values \n" +
                        "configured in alias configuration in the SLAs or send the request \n" +
                        "without <sourceAddress>, so SMS and USSD Gateway will use the \n" +
                        "default source address to send the message to subscriber.\n";
                break;
            case "E1308":
                msg = "Permanent charging error due <specify_reason E.g., Insufficient \n" +
                        "Balance>.\n";
                break;
            case "E1318":
                msg = "Transaction limit per second has exceeded. Please throttle requests \n" +
                        "not to exceed the transaction limit. Contact SMS and USSD Gateway\n" +
                        "admin to increase the traffic limit.\n";
                break;
            case "E1319":
                msg = "Transaction limit for today is exceeded. Please try again tomorrow or \n" +
                        "contact SMS and USSD Gateway admin to increase the transaction per \n" +
                        "day limit\n";
                break;
            case "E1602":
                msg = "Message delivery failed. Please retry";
                break;
            case "E1603":
                msg = "Temporary System Error occurred while delivering your request.\n";
                break;
        }
        return "Status: " + msg;
    }
}
