package com.sabih.hunta.Controller;

import com.sabih.hunta.Application;
import com.sabih.hunta.services.ApplicationServices;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@AllArgsConstructor
@Controller
public class ApplicationController {
    public ApplicationServices applicationServices;
    @PostMapping("/newapplication")
    public void saveApplication(@RequestBody Application application){
        applicationServices.createNewApplication(application);
    }
}
