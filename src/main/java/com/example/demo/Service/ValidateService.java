package com.example.demo.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.lang.NonNull;
import org.springframework.stereotype.Service;

@Service
public class ValidateService {
    
    public Boolean isValidUser(@NonNull String userid, @NonNull String password){
        if(userid.equals("root") && password.equals("admin"))
            return true;
        return false;
    }
}
