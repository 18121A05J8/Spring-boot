package com.example.demo.Model.Geocoder;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class JSONResponce {
    @JsonProperty("results")
    public Result[] result;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @JsonProperty("status")
    public String status;

    public Result[] getResult() {
        return result;
    }

    public void setResult(Result[] result) {
        this.result = result;
    }
    @Override
    public String toString(){
        return "json="+result.toString();
    }
}
