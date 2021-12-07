package com.sabih.hunta.services;

import com.sabih.hunta.Application;
import com.sabih.hunta.Repository.ApplicationRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
@AllArgsConstructor
@Service
public class ApplicationServices {

    public ApplicationRepository applicationRepository;

    public void createNewApplication(Application application){
        applicationRepository.save(application);
    }

}
