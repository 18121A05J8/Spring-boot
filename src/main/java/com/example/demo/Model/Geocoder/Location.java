package com.example.demo.Model.Geocoder;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Location {
    @JsonProperty("lat")
    public double lat;

    public double getLat() {
        return lat;
    }

    public void setLat(double lat) {
        this.lat = lat;
    }

    public double getLng() {
        return lng;
    }

    public void setLng(double lng) {
        this.lng = lng;
    }

    @JsonProperty("lng")
    public double lng;


    @Override
    public String toString(){
        return "lat="+Double.toString(lat)+" lon="+Double.toString(lng);
    }
}
