package com.zipcode.pincode.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.io.Serializable;

@JsonIgnoreProperties({"city","state"})
public class ZipCode implements Serializable {
    public String zip_code;
    public double distance;
    public String city;
    public String state;
}