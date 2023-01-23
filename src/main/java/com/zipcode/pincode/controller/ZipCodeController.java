package com.zipcode.pincode.controller;

import com.zipcode.pincode.json.ZipCodeResponse;
import com.zipcode.pincode.service.ZipcodeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ZipCodeController {
    @Autowired
    ZipcodeService zipcodeService;

    @GetMapping("/getStateCityInfo")
    public ResponseEntity<ZipCodeResponse> getCityStateResponse(@RequestParam(name ="zipcode") String zipcode){
        return zipcodeService.getCityState(zipcode);
    }
}
