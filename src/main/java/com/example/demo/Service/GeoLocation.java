package com.example.demo.Service;

import com.example.demo.Model.Geocoder.JSONResponce;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponents;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

@Service
public class GeoLocation {
    public JSONResponce getAddress(UriComponents uri) throws IOException {
        JSONResponce response = new RestTemplate().getForObject(uri.toUriString(), JSONResponce.class);
        /*ObjectMapper om=new ObjectMapper();
        File jsonfile=new File("C:\\Users\\putha\\Desktop\\demo1\\src\\main\\java\\com\\example\\demo\\JSON\\jsoncode.json");
        try {
            JSONResponce response = om.readValue(jsonfile, JSONResponce.class);
            return response;
        }
        catch(FileNotFoundException e){
            System.out.println(e.getMessage());
        }
        catch(IOException e){
            System.out.println(e.getMessage());
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }*/
        return new JSONResponce();
    }
}
