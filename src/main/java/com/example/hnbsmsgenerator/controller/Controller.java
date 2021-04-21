package com.example.hnbsmsgenerator.controller;
import com.example.hnbsmsgenerator.deliverystatus.DelivertyStatusRespond;
import com.example.hnbsmsgenerator.deliverystatus.DeliveryStatusRequest;
import com.example.hnbsmsgenerator.recieve.ReceiveRespond;
import com.example.hnbsmsgenerator.recieve.RecieveRequest;
import com.example.hnbsmsgenerator.service.Service;
import com.example.hnbsmsgenerator.ussd.ReceiveRequestUssd;
import com.example.hnbsmsgenerator.ussd.ReceiveRespondUssd;
import com.example.hnbsmsgenerator.ussd.SendRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.io.IOException;


@RestController
@RequestMapping("/v1/api/sms")
public class Controller {

    private final Service service;
    @Autowired
    public Controller(Service service) {
        this.service = service;
    }

    @PostMapping("/smssend")
    public void smsSendRest() {
        service.smsSendRest();
    }
    @PostMapping("/receive")
    public ReceiveRespond receiveSms(@Valid @RequestBody RecieveRequest recieveRequest) throws IOException
    {
        return service.receiveSms(recieveRequest);
    }

    @PostMapping("/deliverStatus")
    public DelivertyStatusRespond deliverSms(@Valid @RequestBody DeliveryStatusRequest deliveryStatusRequest) throws IOException
    {

        return service.deliverSms(deliveryStatusRequest);
    }

    @PostMapping("/ussdSend")
    public void ussdSms(@Valid @RequestBody SendRequest sendRequest) throws IOException
    {
        service.ussdSms(sendRequest);
    }

    @PostMapping("/ussdReceive")
    public ReceiveRespondUssd ussdSmsRecieve(@Valid @RequestBody ReceiveRequestUssd recieveRequest) throws IOException
    {
        return service.ussdSmsRecieve(recieveRequest);
    }
}