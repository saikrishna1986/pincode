package com.zipcode.pincode.service;

import com.zipcode.pincode.dto.Root;
import com.zipcode.pincode.dto.ZipCode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

@Service
public class ConsumeService {

    @Autowired
    RestTemplate restTemplate;
    String URI = "https://www.zipcodeapi.com/rest/UVhuuqgmCbo21eK2ddfUQMwbgeHT190ivtfHSRDUZpWkX3lb94EXgpGPWrOn4Yy3/radius.json/{pincode}/{distance}/km";
    String token = "DemoOnly00KcjgnEw70qknZMKpBSiRxS30uJ4YC42o6EGrMmIoV5GQR0ScFOwdDJ";
    HttpEntity<String> entity = new HttpEntity<>(token);

    public ResponseEntity<Root> getPinCode(String pincode, String distance) {
        Map<String, String> input =new HashMap<>();
        input.put("pincode",pincode);
        input.put("distance",distance);

        return restTemplate.exchange(URI, HttpMethod.GET, entity, Root.class,input);

    }

}