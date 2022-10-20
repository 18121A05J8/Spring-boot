package com.example.demo.Model.Geocoder;

import com.example.demo.Model.Geocoder.Geometry;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Result {
    @JsonProperty("address_components")
    private String Address;
    @JsonProperty("geometry")
    private Geometry geometry;

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }
    @Override
    public String toString(){
        return "address="+Address+" geometry="+geometry.toString();
    }

    public Geometry getGeometry() {
        return geometry;
    }

    public void setGeometry(Geometry geometry) {
        this.geometry = geometry;
    }
}
