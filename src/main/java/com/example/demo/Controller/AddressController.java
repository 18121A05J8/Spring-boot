package com.example.demo.Controller;

import com.example.demo.Model.APIErrorHander.ApiError;
import com.example.demo.Model.Geocoder.JSONResponce;
import com.example.demo.Service.GeoLocation;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponents;
import org.springframework.web.util.UriComponentsBuilder;

import java.util.Arrays;

import static com.example.demo.Constants.GeoConstants.API_KEY;

@Controller
public class AddressController {
    public GeoLocation geoLocation=new GeoLocation();

    @RequestMapping(value = "/address", method = RequestMethod.GET)
    private String addressControl(){
        return "address";
    }

    @RequestMapping(value = "/address", method = RequestMethod.POST)
    private String con(@RequestParam  String location, Model model){
        UriComponents uri = UriComponentsBuilder.newInstance().scheme("https")
                        .host("maps.googleapis.com")
                                .path("/maps/api/geocode/json")
                                        .queryParam("address",location)
                                                .queryParam("key",API_KEY)
                                                        .build();
        /*UriComponents uri=UriComponentsBuilder.fromUriString("https://maps.googleapis.com/maps/api/geocode/json")
                .queryParam("address",location)
                .queryParam("key",API_KEY)
                .build();*/
        try {
            JSONResponce response = geoLocation.getAddress(uri);
            model.addAttribute("address",Arrays.toString(response.getResult()));
            if(response.getStatus().equals("OK"))
                return "address";
            else
                throw new Exception("error");
        }
        catch (Exception e){
            ApiError response=new RestTemplate().getForObject(uri.toUriString(), ApiError.class);
            model.addAttribute("error",response.getError());
            model.addAttribute("status",response.getStatus());
            return "error";
        }
    }
}
