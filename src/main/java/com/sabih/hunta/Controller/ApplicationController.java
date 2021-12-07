package com.sabih.hunta.Controller;

import com.sabih.hunta.Model.Application;
import com.sabih.hunta.services.ApplicationServices;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@AllArgsConstructor
@RestController
public class ApplicationController {
    public ApplicationServices applicationServices;
    @PostMapping("/newapplication")
    public void saveApplication(@RequestBody Application application){
        applicationServices.createNewApplication(application);
    }

    @GetMapping("/applications")
    public List<Application> listApplications(){
        return applicationServices.listAllApplication();
    }
}
