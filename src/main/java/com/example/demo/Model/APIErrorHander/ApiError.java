package com.example.demo.Model.APIErrorHander;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ApiError {
    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String[] getResults() {
        return results;
    }

    public void setResults(String[] results) {
        this.results = results;
    }
    @Override
    public String toString(){
        return "[Geocoding] error="+error+" status="+status+" results[]="+results.toString();
    }

    @JsonProperty("error_message")
    public String error;
    @JsonProperty("status")
    public String status;
    @JsonProperty("results")
    public String[] results;
}
