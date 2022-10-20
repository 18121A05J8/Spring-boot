package com.example.demo.Model.Geocoder;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Geometry {
    @JsonProperty("location")
    private Location location;

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }
    @Override
    public String toString(){
        return location.toString();
    }
}
