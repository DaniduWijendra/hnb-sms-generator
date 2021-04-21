package com.example.hnbsmsgenerator.service;

import com.example.hnbsmsgenerator.deliverystatus.DelivertyStatusRespond;
import com.example.hnbsmsgenerator.enumarators.DeliveryStatusRequest;
import com.example.hnbsmsgenerator.enumarators.Encoding;
import com.example.hnbsmsgenerator.recieve.ReceiveRespond;
import com.example.hnbsmsgenerator.recieve.RecieveRequest;
import com.example.hnbsmsgenerator.sent.AddressEntry;
import com.example.hnbsmsgenerator.sent.SmsRequest;
import com.example.hnbsmsgenerator.sent.SmsRespond;
import com.example.hnbsmsgenerator.ussd.ReceiveRequestUssd;
import com.example.hnbsmsgenerator.ussd.ReceiveRespondUssd;
import com.example.hnbsmsgenerator.ussd.SendRequest;
import com.example.hnbsmsgenerator.util.Printer;
import com.example.hnbsmsgenerator.util.Status;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.HttpClientBuilder;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.client.RestTemplate;

import javax.validation.Valid;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


@org.springframework.stereotype.Service
public class Service {
    public void smsSendRest() {
        try {
            SmsRespond answer = null;
            Printer.print("SMS SEND");
            RestTemplate restTemplate = new RestTemplate();
            String url = "http://localhost:8080/v1/api/sms/send";
            List<String> sse = new ArrayList<>();
            sse.add("tel:94774747447 ");
            SmsRequest rr = new SmsRequest("APP_999999", "password", "1.0", sse, "Hello", "77000", DeliveryStatusRequest.VALUE1, Encoding.VALUE3, 5.75, "526574697265206170706c69636174696f6e20616e642072656c6561736520524b7320696620666f756e6420657870697265");
            ObjectMapper mapper = new ObjectMapper();
            String json = mapper.writeValueAsString(rr);
            Printer.print("JSON " + json);
            HttpHeaders headers = new HttpHeaders();
            headers.setContentType(MediaType.APPLICATION_JSON);
            org.springframework.http.HttpEntity<String> entity = new HttpEntity<>(json, headers);
            answer = restTemplate.postForObject(url, entity, SmsRespond.class);
            Printer.print("Answer\n" + answer);
            Printer.printStatus(Status.checkStatus(answer.getStatusCode()));
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public ReceiveRespond receiveSms(@Valid @RequestBody RecieveRequest recieveRequest) throws IOException
    {

        Printer.print("Message: " + recieveRequest.getMessage());
        Printer.print("Source address: " + recieveRequest.getSourceAddress());
        Printer.print("Request Id: " + recieveRequest.getRequestId());
        Printer.print("Encoding: " + recieveRequest.getEncoding());
        Printer.print("Version: " + recieveRequest.getVersion());

        return new ReceiveRespond("E1308","Error during the charging operation");
    }
    public DelivertyStatusRespond deliverSms(@Valid @RequestBody com.example.hnbsmsgenerator.deliverystatus.DeliveryStatusRequest deliveryStatusRequest) throws IOException
    {

        Printer.print("Destination Address: " + deliveryStatusRequest.getDestinationAddress());
        Printer.print("TimeStamp: " + deliveryStatusRequest.getTimeStamp());
        Printer.print("Request Id: " + deliveryStatusRequest.getRequestId());
        Printer.print("Delivery Status: " + deliveryStatusRequest.getDeliveryStatus());

        return new DelivertyStatusRespond("s1000","Success");
    }
    public void ussdSms(@Valid @RequestBody SendRequest sendRequest) throws IOException
    {

        Printer.print("Application Id: " + sendRequest.getApplicationId());
        Printer.print("Password: " + sendRequest.getPassword());
        Printer.print("Version: " + sendRequest.getVersion());
        Printer.print("Message: " + sendRequest.getMessage());
        Printer.print("Session Id: " + sendRequest.getSessionId());
        Printer.print("USSD Operation: " + sendRequest.getUssdOperation());
        Printer.print("Destination Address: " + sendRequest.getDestinationAddress());
        Printer.print("Encoding: " + sendRequest.getEncoding());
        Printer.print("Charging Amount: " + sendRequest.getChargingAmount());

    }
    public ReceiveRespondUssd ussdSmsRecieve(@Valid @RequestBody ReceiveRequestUssd recieveRequest) throws IOException
    {

        Printer.print("Version: " + recieveRequest.getVersion());
        Printer.print("Application Id: " + recieveRequest.getApplicationId());
        Printer.print("Session Id: " + recieveRequest.getSessionId());
        Printer.print("USSD Operation: " + recieveRequest.getUssdOperation());
        Printer.print("Source Address: " + recieveRequest.getSourceAddress());
        Printer.print("Vir Address: " + recieveRequest.getVirAddress());
        Printer.print("Message: " + recieveRequest.getMessage());
        Printer.print("Encoding: " + recieveRequest.getEncoding());
        Printer.print("Request Id: " + recieveRequest.getRequestId());


        return new ReceiveRespondUssd("S1000","Success");
    }
    public static void smsService() {
        try {
            List<AddressEntry> list = new ArrayList<>();
            list.add(new AddressEntry("771930848","20120515093023","dfsfs1213","S1000","Request was successfully processed","dialog"));
            SmsRespond smsRespond = new SmsRespond("S0001","Status Success","APP_000001","1.0",list);
            String postUrl = "http://localhost:8080/recieve";// put in your url
            Gson gson = new Gson();
            HttpClient httpClient = HttpClientBuilder.create().build();
            HttpPost post = new HttpPost(postUrl);
            StringEntity postingString = new StringEntity(gson.toJson(smsRespond));//gson.tojson() converts your pojo to json
            post.setEntity(postingString);
            post.setHeader("Content-type", "application/json");
            HttpResponse response = httpClient.execute(post);
            Printer.print("sf" + response.toString());
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }

    }


}
