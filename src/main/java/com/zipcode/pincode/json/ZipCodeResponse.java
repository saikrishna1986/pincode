package com.zipcode.pincode.json;

import org.springframework.stereotype.Service;

import java.io.Serializable;
import java.util.ArrayList;
public class ZipCodeResponse implements Serializable {
    public String zip_code;
    public double lat;
    public double lng;
    public String city;
    public String state;
    public Timezone timezone;
    public ArrayList<AcceptableCityName> acceptable_city_names;
    public ArrayList<Integer> area_codes;
}
