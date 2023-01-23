package com.zipcode.pincode.controller;

import com.zipcode.pincode.dto.Root;
import com.zipcode.pincode.service.ConsumeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class PincodeController {
    @Autowired
    ConsumeService consumeService;

    @GetMapping("/msg")
    public String getMessage() {
        return "Welcome to spring ";
    }

    @GetMapping("/getNear")
    public ResponseEntity<Root> getRadius(@RequestParam(name = "pincode") String pincode, @RequestParam(name = "distance") String distance) {
        return consumeService.getPinCode(pincode, distance);
    }
}
