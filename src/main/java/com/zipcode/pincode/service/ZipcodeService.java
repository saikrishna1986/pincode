package com.zipcode.pincode.service;

import com.zipcode.pincode.json.ZipCodeResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.Map;

@Service
public class ZipcodeService {

    @Autowired
    RestTemplate restTemplate;

    String URI = "https://www.zipcodeapi.com/rest/UVhuuqgmCbo21eK2ddfUQMwbgeHT190ivtfHSRDUZpWkX3lb94EXgpGPWrOn4Yy3/info.json/{zipcode}/degrees";
    String token = "DemoOnly00KcjgnEw70qknZMKpBSiRxS30uJ4YC42o6EGrMmIoV5GQR0ScFOwdDJ";


    HttpEntity<String> tokens = new HttpEntity<>(token);

    public ResponseEntity<ZipCodeResponse> getCityState(String zipcode) {
        Map<String, String> inputs = new HashMap<>();
        inputs.put("zipcode", zipcode);
        //return restTemplate.exchange(URI, tokens, HttpMethod.GET, ZipCodeResponse.class , inputs);
        //ResponseEntity<ZipCodeResponse> response2 = restTemplate.getForObject(URI, ZipCodeResponse.class, inputs);
        ResponseEntity<ZipCodeResponse> response = restTemplate.getForEntity(URI, ZipCodeResponse.class, inputs);
        return response;
    }


}
